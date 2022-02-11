/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entitas.ModelApp;
import KoneksiDB.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anjar
 */
public class ModelPenjualan {
     Connection connection;
    String tampilbarang         = "SELECT * FROM barang";
    String simpanpenjualan      = "INSERT INTO penjualan values(?,?,?,?,?)";
    String simpandetail         = "INSERT INTO isi_penjualan (id_penjualan,id_barang,jumlah,subtotal) values(?, ?, ?, ?)";
    String simpancustomer       = "INSERT INTO customer VALUES (?,?,?,?)"; 
//     String hapuspenjualan      = "DELETE FROM penjualan where id_penjualan=?";
//     String hapusdetail      = "DELETE FROM isi_penjualan where id_penjualan=?";
    String hapuscustomer        = "DELETE FROM customer where id_customer=? ";

            
    final String Customer       = "SELECT ifnull(max(convert(right(id_customer,2),signed integer)),0)as kode," 
                                  + " ifnull(length(max(convert(right(id_customer,2),signed integer))),0)as panjang "
                                  + "from customer";
    final String NoNota         = "SELECT ifnull(max(convert(right(id_penjualan,2),signed integer)),0)as kode," 
                                + " ifnull(length(max(convert(right(id_penjualan,2),signed integer))),0)as panjang "
                                + "from penjualan";
    
    final String select         = "SELECT isi_penjualan.id,isi_penjualan.id_penjualan, isi_penjualan.id_barang, barang.nama_barang,barang.harga_barang,isi_penjualan.jumlah,isi_penjualan.subtotal\n" +
                                    "FROM isi_penjualan INNER JOIN barang On isi_penjualan.id_barang = barang.id_barang ";
    
    
    public ModelPenjualan(){
        connection = Koneksi.connection();
    }

    //insert penjualan
    
     public int autonumberNoNota(ModelApp object){
        PreparedStatement statement = null;
        int nomor = 0;
        try {
            statement = connection.prepareStatement(NoNota);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                nomor=rs.getInt("kode")+1;
                
            }
        } catch (Exception e) {
        }
        return nomor;
    }

    public void InsertPenjualan(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpanpenjualan);
           statement.setString(1, object.getId_penjualan());
           statement.setString(2, object.getTgl_penjualan());
           statement.setString(3, object.getId_customer());
           statement.setInt(4, object.getTotal_harga());
           statement.setString(5, object.getId_petugas());
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
          try{
            statement.close();
          } catch (SQLException ex) {
            ex.printStackTrace();
          }
       }
    }


        //insert isi
    
    public void InsertIsi(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpandetail);
           
           statement.setString(1, object.getId_penjualan());
           statement.setString(2, object.getId_barang());
            statement.setInt(3, object.getJumlah_beli());
           statement.setInt(4, object.getSubtotal());
          
         
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
          try{
            statement.close();
          } catch (SQLException ex) {
            ex.printStackTrace();
          }
       }
    }


   
//    public void deletedetail(String id_detail) {
//          PreparedStatement statement = null;
//       try {
//
//           statement = connection.prepareStatement(hapusdetail);
//           statement.setString(1,id_detail);
//
//           statement.executeUpdate();
//           
//       } catch (SQLException ex) {
//        ex.printStackTrace();
//    } finally {
//          try{
//            statement.close();
//          } catch (SQLException ex) {
//            ex.printStackTrace();
//          }
//       }
//    }
    
         //insert customer
    public int autonumbercustomer(ModelApp object){
        PreparedStatement statement = null;
        int nomor = 0;
        try {
            statement = connection.prepareStatement(Customer);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                nomor=rs.getInt("kode")+1;
                
            }
        } catch (Exception e) {
        }
        return nomor;
    }
    
    
    public void insertcustomer(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpancustomer);
           statement.setString(1, object.getId_customer());
           statement.setString(2, object.getNama_customer());
           statement.setString(3, object.getTelepon());
           statement.setString(4, object.getAlamat());
          
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
          try{
            statement.close();
          } catch (SQLException ex) {
            ex.printStackTrace();
          }
       }
    }


   
//    public void deletecostomer(String id_cs) {
//          PreparedStatement statement = null;
//       try {
//           statement = connection.prepareStatement(hapuscustomer);
//           statement.setString(1,id_cs);
//           statement.executeUpdate();
//           
//       } catch (SQLException ex) {
//        ex.printStackTrace();
//    } finally {
//          try{
//            statement.close();
//          } catch (SQLException ex) {
//            ex.printStackTrace();
//          }
//       }
//    }
//    
    
 
    public List<ModelApp >getAll() {
        List<ModelApp > lb = null;
       try {
           lb = new ArrayList<ModelApp>();
           Statement st = connection.createStatement();
      
           ResultSet rs = st.executeQuery(select);
           while (rs.next()) {
               ModelApp b = new ModelApp();
               b.setNo(rs.getString("id"));
               b.setId_penjualan(rs.getString("id_penjualan"));
               b.setId_barang(rs.getString("id_barang"));
               b.setNama_barang(rs.getString("nama_barang"));
               b.setHarga(rs.getInt("harga_barang"));
               b.setJumlah_beli(rs.getInt("jumlah"));
               b.setSubtotal(rs.getInt("subtotal"));
               lb.add(b);
           }
       } catch (SQLException ex){
           Logger.getLogger(ModelPengiriman.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return lb;
    }
    
     
    public List<ModelApp> getBarang() {
        List<ModelApp> lb = null;
       try {
           lb = new ArrayList<ModelApp>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(tampilbarang);
           while (rs.next()) {
               ModelApp b = new ModelApp();
             
               b.setId_barang(rs.getString("id_barang"));
               b.setNama_barang(rs.getString("nama_barang"));
               b.setHarga(rs.getInt("harga_barang"));
               b.setSatuan(rs.getString("satuan"));
               b.setStok_barang(rs.getInt("stok_barang"));
             
               lb.add(b);
           }
       } catch (SQLException ex){
           Logger.getLogger(ModelPengiriman.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return lb;
    }
    
    
     public void kurang_stok(ModelApp object) {
       PreparedStatement statement;
       int stok_akhir=0;
        try {
                String SELECT = "select stok_barang from barang where id_barang=?";   
                statement = connection.prepareStatement(SELECT);
                statement.setString(1, object.getId_barang());
                ResultSet rs = statement.executeQuery();     
                
                if (rs.next()){ //jika data ditemukan (baik null maupun tidak null)
                        //hitung stok akhir berdasarkan qty masing2 kode barang yang ada di jtabel 
                        stok_akhir=rs.getInt("stok_barang") - object.getJumlah_beli();

                        //update stok barang ke dalam table barang                     
                        PreparedStatement statement2; 
                        String UPDATESTOCK ="update barang set stok_barang=? where id_barang=?";
                        statement2 = connection.prepareStatement(UPDATESTOCK);                
                        statement2.setInt(1, stok_akhir);
                        statement2.setString(2, object.getId_barang());     
                        statement2.executeUpdate();
                    }
                        } catch (Exception e) {
            e.printStackTrace();
        }      
    }
     
     public void tambah_stok(ModelApp object) {
       PreparedStatement statement;
       int stok_akhir=0;
        try {
                String SELECT = "select stok_barang from barang where id_barang=?";   
                statement = connection.prepareStatement(SELECT);
                statement.setString(1, object.getId_barang());
                ResultSet rs = statement.executeQuery();     
                
                if (rs.next()){ //jika data ditemukan (baik null maupun tidak null)
                        //hitung stok akhir berdasarkan qty masing2 kode barang yang ada di jtabel 
                        stok_akhir=rs.getInt("stok_barang") + object.getJumlah_beli();

                        //update stok barang ke dalam table barang                     
                        PreparedStatement statement2; 
                        String UPDATESTOCK ="update barang set stok_barang=? where id_barang=?";
                        statement2 = connection.prepareStatement(UPDATESTOCK);                
                        statement2.setInt(1, stok_akhir);
                        statement2.setString(2, object.getId_barang());     
                        statement2.executeUpdate();
                    }
                        } catch (Exception e) {
            e.printStackTrace();
        }      
    }

     
}
