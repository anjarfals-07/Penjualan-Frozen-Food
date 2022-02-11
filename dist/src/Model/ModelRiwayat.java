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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anjar
 */
public class ModelRiwayat {
    
  public ModelRiwayat(){
        connection = Koneksi.connection();
    }
    Connection connection;
  //  form spp
  
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
    String DETAILKIRIM = "SELECT\n" +
                        "    isi_pengiriman.id_pengiriman,\n" +
                        "    isi_pengiriman.id_barang,\n" +
                        "    barang.nama_barang,\n" +
                        "    barang.satuan,\n" +
                        "    barang.harga_barang,\n" +
                        "    isi_pengiriman.jumlah_pengiriman\n" +
                        "FROM\n" +
                        "    isi_pengiriman\n" +
                        "INNER JOIN barang ON isi_pengiriman.id_barang = barang.id_barang\n" +
                        "ORDER BY\n" +
                        "    isi_pengiriman.id_pengiriman ASC";
    String DETAILPENJUALAN  = "SELECT\n" +
                                "    isi_penjualan.id_penjualan,\n" +
                                "    isi_penjualan.id_barang,\n" +
                                "    barang.nama_barang,\n" +
                                "    barang.satuan,\n" +
                                "    barang.harga_barang,\n" +
                                "    isi_penjualan.jumlah,\n" +
                                "    isi_penjualan.subtotal\n" +
                                "FROM\n" +
                                "    isi_penjualan\n" +
                                "INNER JOIN barang ON isi_penjualan.id_barang = barang.id_barang\n" +
                                "ORDER BY\n" +
                                "    isi_penjualan.id_penjualan ASC";
      
     
 
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
    
    public List<ModelApp> getAllDetailPenjualan() {
        List<ModelApp> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<ModelApp>();
            statement = connection.prepareStatement(DETAILPENJUALAN);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelApp b = new ModelApp ();
                b.setId_penjualan(rs.getString("id_penjualan"));
                b.setId_barang(rs.getString("id_barang"));
                b.setNama_barang(rs.getString("nama_barang"));
                b.setSatuan(rs.getString("satuan"));
                b.setHarga(rs.getInt("harga_barang"));
                b.setJumlah_beli(rs.getInt("jumlah"));
                b.setSubtotal(rs.getInt("subtotal"));
              
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        }
  
        public List<ModelApp> getAllDetailPengiriman() {
        List<ModelApp> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<ModelApp>();
            statement = connection.prepareStatement(DETAILKIRIM);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelApp b = new ModelApp ();
                b.setId_pengiriman(rs.getString("id_pengiriman"));
                b.setId_barang(rs.getString("id_barang"));
                b.setNama_barang(rs.getString("nama_barang"));
                b.setSatuan(rs.getString("satuan"));
                b.setHarga(rs.getInt("harga_barang"));
                b.setJumlah_kirim(rs.getInt("jumlah_pengiriman"));
               
              
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        }
  
}
    
