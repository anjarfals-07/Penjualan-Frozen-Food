/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



import Entitas.ModelApp;
import KoneksiDB.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sessionlogin.PetugasLogin;



/**
 *
 * @author Anjar
 */
public class ControllerLogin {
    public boolean cekLogin(ModelApp usr) throws SQLException {
        String sql = "SELECT * FROM petugas WHERE username = ? AND password = ?";
        PreparedStatement pst =Koneksi.connection().prepareStatement(sql);
        pst.setString(1, usr.getUsername());
        pst.setString(2, usr.getPassword());
     
        ResultSet rs;
        rs = pst.executeQuery();
        if (rs.next()) { 
            PetugasLogin.setKodeLogin(rs.getString("id_petugas"));
            PetugasLogin.setNamaLogin(rs.getString("nama_petugas"));
            return true;
        }
        return false;
    }

}
