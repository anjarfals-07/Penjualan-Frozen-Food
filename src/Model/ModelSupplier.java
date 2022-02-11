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
public class ModelSupplier {
     
    Connection connection;
    String INSERT = "INSERT INTO supplier values(?,?,?,?)";
    String UPDATE = "UPDATE supplier SET nama_supplier=?,telepon=?,alamat=? WHERE id_supplier=?";
    String DELETE = "DELETE FROM supplier WHERE id_supplier=?";
    String SELECT = "SELECT * FROM supplier ORDER BY id_supplier ASC"; 
    String IDOTOMATIS = "SELECT ifnull(max(convert(right(id_supplier,2),signed integer)),0) as kode,"
            + "ifnull(length(max(convert(right(id_supplier,2),signed integer))),0)as panjang "
            + "from supplier";
    
    public ModelSupplier(){
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
                statement2.setString(1, object.getId_supplier());
                statement2.setString(2, object.getNama_supplier());
                statement2.setString(3, object.getTelepon());
                statement2.setString(4, object.getAlamat());
               
                statement2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Supplier berhasil di simpan!");
            } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement2 != null) {
                    statement2.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ModelSupplier.class.getName()).log(Level.SEVERE, null, e);
            }
        }
         
    } 

    public void update(ModelApp object) {
         PreparedStatement statement = null;
        try {
         
                statement = connection.prepareStatement(UPDATE);
                statement.setString(1, object.getNama_supplier());
                statement.setString(2, object.getTelepon());
                statement.setString(3, object.getAlamat());
                statement.setString(4, object.getId_supplier());
                
                statement.executeUpdate();                    
                JOptionPane.showMessageDialog(null, "Data Supplier berhasil di ubah!");                
           } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ModelSupplier.class.getName()).log(Level.SEVERE, null, e);
            }
        }
         
    } 

    public void delete(String id) {
            PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Supplier berhasil di hapus!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelSupplier.class.getName()).log(Level.SEVERE, null, ex);
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

}
