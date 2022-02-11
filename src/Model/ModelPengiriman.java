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
public class ModelPengiriman {
     Connection connection;
    String tampilbarang         = "SELECT * FROM barang";
    String simpanpengiriman      = "INSERT INTO pengiriman values(?,?,?,?,?)";
    String simpandetail         = "INSERT INTO isi_pengiriman (id_pengiriman,id_barang,jumlah_pengiriman) values(?, ?, ?)";
    String simpansupplier       = "INSERT INTO supplier VALUES (?,?,?,?)"; 
//     String hapuspengiriman      = "DELETE FROM pengiriman where id_pengiriman=?";
//     String hapusdetail      = "DELETE FROM isi_pengiriman where id_pengiriman=?";
    String hapussupplier        = "DELETE FROM supplier where id_supplier=? ";

            
    final String Supplier       = "SELECT ifnull(max(convert(right(id_supplier,2),signed integer)),0)as kode," 
                                  + " ifnull(length(max(convert(right(id_supplier,2),signed integer))),0)as panjang "
                                  + "from supplier";
    final String NOPengiriman   = "SELECT ifnull(max(convert(right(id_pengiriman,2),signed integer)),0)as kode," 
                                + " ifnull(length(max(convert(right(id_pengiriman,2),signed integer))),0)as panjang "
                                + "from pengiriman";
    
    final String select         = "SELECT isi_pengiriman.id_isi,isi_pengiriman.id_pengiriman, isi_pengiriman.id_barang, barang.nama_barang,barang.harga_barang,isi_pengiriman.jumlah_pengiriman\n" +
                                    "FROM isi_pengiriman INNER JOIN barang On isi_pengiriman.id_barang = barang.id_barang ";
    String TAMPILSUPPLIER = "SELECT * FROM supplier order by nama_supplier";
    String CARISUPPLIER  = "SELECT * FROM supplier where nama_supplier=? ";
    
    public ModelPengiriman(){
        connection = Koneksi.connection();
    }
    
       //tampil rt
      public List<ModelApp> isicombosupplier() {
        PreparedStatement statement;
        List<ModelApp> list = null;
        try {
            list = new ArrayList();
            statement = connection.prepareStatement(TAMPILSUPPLIER);
            ResultSet rs = statement.executeQuery();              
            while (rs.next()) {
                ModelApp b = new ModelApp();  
                b.setNama_supplier(rs.getString("nama_supplier"));
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
        
         //manggil data supplier lewat combo supplier
    public List<ModelApp> getkodesupplier(String nama) {
        PreparedStatement statement;
        List<ModelApp> list = null;
        try {
            list = new ArrayList();
            statement = connection.prepareStatement(CARISUPPLIER);
            statement.setString(1, nama);
            ResultSet rs = statement.executeQuery();   
           
            while (rs.next()) {                         
                ModelApp b = new ModelApp();
                b.setId_supplier(rs.getString("id_supplier"));
                b.setNama_supplier(rs.getString("nama_supplier"));
                b.setTelepon(rs.getString("telepon"));
                b.setAlamat(rs.getString("alamat"));
                list.add(b);            
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }  

    //insert penjualan
    
     public int autonumberNoPengiriman(ModelApp object){
        PreparedStatement statement = null;
        int nomor = 0;
        try {
            statement = connection.prepareStatement(NOPengiriman);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                nomor=rs.getInt("kode")+1;
                
            }
        } catch (Exception e) {
        }
        return nomor;
    }

    public void InsertPengiriman(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpanpengiriman);
           statement.setString(1, object.getId_pengiriman());
           statement.setString(2, object.getTgl_pengiriman());
           statement.setString(3, object.getId_supplier());
           statement.setInt(4, object.getTotal_kirim());
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


  
//    public void delete(String id) {
//          PreparedStatement statement = null;
//       try {
//           statement = connection.prepareStatement(hapuspenjualan);
//           statement.setString(1,id);
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
        //insert isi
    
    public void InsertIsi(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpandetail);
           
           statement.setString(1, object.getId_pengiriman());
           statement.setString(2, object.getId_barang());
           statement.setInt(3, object.getJumlah_kirim());
          
         
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
    public int autonumbersupplier(ModelApp object){
        PreparedStatement statement = null;
        int nomor = 0;
        try {
            statement = connection.prepareStatement(Supplier);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                nomor=rs.getInt("kode")+1;
                
            }
        } catch (Exception e) {
        }
        return nomor;
    }
    
    
    public void insertsupplier(ModelApp object) {
         PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(simpansupplier);
           statement.setString(1, object.getId_supplier());
           statement.setString(2, object.getNama_supplier());
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
               b.setNo(rs.getString("id_isi"));
               b.setId_pengiriman(rs.getString("id_pengiriman"));
               b.setId_barang(rs.getString("id_barang"));
               b.setNama_barang(rs.getString("nama_barang"));
               b.setHarga(rs.getInt("harga_barang"));
               b.setJumlah_kirim(rs.getInt("jumlah_pengiriman"));
             
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
                        stok_akhir=rs.getInt("stok_barang") - object.getJumlah_kirim();

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
                        stok_akhir=rs.getInt("stok_barang") + object.getJumlah_kirim();

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
