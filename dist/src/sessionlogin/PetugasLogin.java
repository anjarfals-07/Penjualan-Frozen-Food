/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionlogin;

/**
 *
 * @author Anjar
 */
public class PetugasLogin {
    private static String id;
    private static String nama;

    public static String getKodeLogin() {
        return id;
    }
    
    public static void setKodeLogin(String id) {
        PetugasLogin.id = id;
    }


    public static String getNamaLogin() {
        return nama;
    }

    public static void setNamaLogin(String nama) {
        PetugasLogin.nama = nama;
    }
    
}
