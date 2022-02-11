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
public class ModelLaporan {
     Connection connection;
   
    final String selectcustomer  = "SELECT\n" +
                                "    penjualan.id_penjualan,\n" +
                                "    penjualan.tanggal_penjualan,\n" +
                                "    penjualan.id_customer,\n" +
                                "    customer.nama_customer,\n" +
                                "    customer.telepon,\n" +
                                "    customer.alamat\n" +
                                "FROM\n" +
                                "    penjualan\n" +
                                "INNER JOIN customer ON penjualan.id_customer = customer.id_customer";
    String selectsupplier       = "SELECT * FROM supplier";
    String selectbarang         = "SELECT * FROM barang";
     String SELECTPENJUALAN = "SELECT\n" +
                            "    penjualan.id_penjualan,\n" +
                            "    penjualan.tanggal_penjualan,\n" +
                            "    penjualan.id_customer,\n" +
                            "    customer.nama_customer,\n" +
                            "    penjualan.total_harga\n" +
                            "FROM\n" +
                            "    penjualan\n" +
                            "INNER JOIN customer ON penjualan.id_customer = customer.id_customer\n" +
                            "ORDER BY\n" +
                            "    penjualan.tanggal_penjualan ASC";
    
  
    String SELECTPENGIRIMAN = "SELECT\n" +
                                "    pengiriman.id_pengiriman,\n" +
                                "    pengiriman.tanggal_pengiriman,\n" +
                                "    pengiriman.id_supplier,\n" +
                                "    supplier.nama_supplier,\n" +
                                "    pengiriman.total_pengiriman\n" +
                                "FROM\n" +
                                "    pengiriman\n" +
                                "INNER JOIN supplier ON pengiriman.id_supplier = supplier.id_supplier\n" +
                                "ORDER BY\n" +
                                "    pengiriman.tanggal_pengiriman ASC";
    
    public ModelLaporan(){
        connection = Koneksi.connection();
    }

    //insert penjualan
    
   
    public List<ModelApp >getAllCustomer() {
        List<ModelApp > lb = null;
       try {
           lb = new ArrayList<ModelApp>();
           Statement st = connection.createStatement();
      
           ResultSet rs = st.executeQuery(selectcustomer);
           while (rs.next()) {
               ModelApp b = new ModelApp();
               b.setId_penjualan(rs.getString("id_penjualan"));
               b.setTgl_penjualan(rs.getString("tanggal_penjualan"));
               b.setId_customer(rs.getString("id_customer"));
               b.setNama_customer(rs.getString("nama_customer"));
               b.setTelepon(rs.getString("telepon"));
               b.setAlamat(rs.getString("alamat"));
               
               lb.add(b);
           }
       } catch (SQLException ex){
           Logger.getLogger(ModelLaporan.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return lb;
    }
    
    public List<ModelApp >getAllSupplier() {
        List<ModelApp > lb = null;
       try {
           lb = new ArrayList<ModelApp>();
           Statement st = connection.createStatement();
      
           ResultSet rs = st.executeQuery(selectsupplier);
           while (rs.next()) {
               ModelApp b = new ModelApp();
               b.setId_supplier(rs.getString("id_supplier"));
               b.setNama_supplier(rs.getString("nama_supplier"));
               b.setTelepon(rs.getString("telepon"));
               b.setAlamat(rs.getString("alamat"));
               
               lb.add(b);
           }
       } catch (SQLException ex){
           Logger.getLogger(ModelLaporan.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return lb;
    }
    
     
    public List<ModelApp> getAllBarang() {
        List<ModelApp> lb = null;
       try {
           lb = new ArrayList<ModelApp>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(selectbarang);
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
           Logger.getLogger(ModelLaporan.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return lb;
    }
    
   public List<ModelApp> getAllPenjualan() {
        List<ModelApp> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<ModelApp>();
            statement = connection.prepareStatement(SELECTPENJUALAN);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelApp b = new ModelApp ();
                b.setId_penjualan(rs.getString("id_penjualan"));
                b.setTgl_penjualan(rs.getString("tanggal_penjualan"));
                b.setId_customer(rs.getString("id_customer"));
                b.setNama_customer(rs.getString("nama_customer"));
                b.setTotal_harga(rs.getInt("total_harga"));
              
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        }
   
    public List<ModelApp> getAllPengiriman() {
        List<ModelApp> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<ModelApp>();
            statement = connection.prepareStatement(SELECTPENGIRIMAN);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelApp b = new ModelApp ();
                b.setId_pengiriman(rs.getString("id_pengiriman"));
                b.setTgl_pengiriman(rs.getString("tanggal_pengiriman"));
                b.setId_supplier(rs.getString("id_supplier"));
                b.setNama_supplier(rs.getString("nama_supplier"));
                b.setTotal_kirim(rs.getInt("total_pengiriman"));
              
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        }
      
}
