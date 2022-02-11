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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anjar
 */
public class ModelBarang {
     
    Connection connection;
    String INSERT = "INSERT INTO barang values(?,?,?,?,?)";
    String UPDATE = "UPDATE barang SET nama_barang=?,harga_barang=?,satuan=?,stok_barang=? WHERE id_barang=?";
    String DELETE = "DELETE FROM barang WHERE id_barang=?";
    String SELECT = "SELECT * FROM barang ORDER BY id_barang ASC"; 
    String IDOTOMATIS = "SELECT ifnull(max(convert(right(id_barang,2),signed integer)),0) as kode,"
            + "ifnull(length(max(convert(right(id_barang,2),signed integer))),0)as panjang "
            + "from barang";
    
    public ModelBarang(){
    connection = Koneksi.connection();
    }
    
   
    public int autonumber(ModelApp object) {
        PreparedStatement statement = null;
         int nomor=0;
        try{
            statement = connection.prepareStatement(IDOTOMATIS);
            ResultSet rs = statement.executeQuery();
            if(rs.next())             
                nomor=rs.getInt("kode")+1;          
            
        }catch (Exception e) {
            e.printStackTrace();
        }   
        return nomor;
    }

    public void insert(ModelApp object) {
       PreparedStatement statement2 = null;
        try {
            
                statement2 = connection.prepareStatement(INSERT);
                statement2.setString(1, object.getId_barang());
                statement2.setString(2, object.getNama_barang());
                statement2.setInt(3, object.getHarga());
                statement2.setString(4, object.getSatuan());
                statement2.setInt(5, object.getStok_barang());
               
                statement2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Barang berhasil di simpan!");
            } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement2 != null) {
                    statement2.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ModelBarang.class.getName()).log(Level.SEVERE, null, e);
            }
        }
         
    } 

    public void update(ModelApp object) {
         PreparedStatement statement = null;
        try {
         
                statement = connection.prepareStatement(UPDATE);
                statement.setString(1, object.getNama_barang());
                statement.setInt(2, object.getHarga());
                statement.setString(3, object.getSatuan());
                statement.setInt(4, object.getStok_barang());
                statement.setString(5, object.getId_barang());
                
                
                statement.executeUpdate();                    
                JOptionPane.showMessageDialog(null, "Data Barang berhasil di ubah!");                
           } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ModelBarang.class.getName()).log(Level.SEVERE, null, e);
            }
        }
         
    } 

    public void delete(String id) {
            PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Barang berhasil di hapus!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelBarang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<ModelApp> getAll() {
        List<ModelApp> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<ModelApp>();
            statement = connection.prepareStatement(SELECT);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelApp b = new ModelApp();
                b.setId_barang(rs.getString("id_barang"));
                b.setNama_barang(rs.getString("nama_barang"));
                b.setHarga(rs.getInt("harga_barang"));
                b.setSatuan(rs.getString("satuan"));
                b.setStok_barang(rs.getInt("stok_barang"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        }

}
