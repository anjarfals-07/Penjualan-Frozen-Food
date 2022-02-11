/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitas;

/**
 *
 * @author Anjar
 */
public class ModelApp {
    //-- Customer --//
    private String id_customer;
    private String nama_customer;
    private String telepon;
    private String alamat;
    //-- Barang--//
    private String id_barang;
    private String nama_barang;
    private int harga;
    private String satuan;
    private int stok_barang;
    //--Petugas--//
    private String id_petugas;
    private String nama_petugas;
    private String username;
    private String password;
    //--Supplier--//
    private String id_supplier;
    private String nama_supplier;
    //--Pengiriman--/
    private String id_pengiriman;
    private String tgl_pengiriman;
    private int total_kirim;
    //--Isi Pengiriman--//
    private String id_isi_kirim;
    private int jumlah_kirim;
    //--Penjualan--//
    private String id_penjualan;
    private String tgl_penjualan;
    private int total_harga;
    //Isi Penjualan--//
    private String id_isi_jual;
    private int jumlah_beli;
    private int subtotal;
    
    private String no;
    
    public ModelApp(){
        
    }

    public String getId_customer() {
        return id_customer;
    }

    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStok_barang() {
        return stok_barang;
    }

    public void setStok_barang(int stok_barang) {
        this.stok_barang = stok_barang;
    }

    public String getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(String id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_supplier() {
        return nama_supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    public String getId_pengiriman() {
        return id_pengiriman;
    }

    public void setId_pengiriman(String id_pengiriman) {
        this.id_pengiriman = id_pengiriman;
    }

    public String getTgl_pengiriman() {
        return tgl_pengiriman;
    }

    public void setTgl_pengiriman(String tgl_pengiriman) {
        this.tgl_pengiriman = tgl_pengiriman;
    }

    public int getTotal_kirim() {
        return total_kirim;
    }

    public void setTotal_kirim(int total_kirim) {
        this.total_kirim = total_kirim;
    }

    public String getId_isi_kirim() {
        return id_isi_kirim;
    }

    public void setId_isi_kirim(String id_isi_kirim) {
        this.id_isi_kirim = id_isi_kirim;
    }

    public int getJumlah_kirim() {
        return jumlah_kirim;
    }

    public void setJumlah_kirim(int jumlah_kirim) {
        this.jumlah_kirim = jumlah_kirim;
    }

    public String getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(String id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public String getTgl_penjualan() {
        return tgl_penjualan;
    }

    public void setTgl_penjualan(String tgl_penjualan) {
        this.tgl_penjualan = tgl_penjualan;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public String getId_isi_jual() {
        return id_isi_jual;
    }

    public void setId_isi_jual(String id_isi_jual) {
        this.id_isi_jual = id_isi_jual;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    
}
