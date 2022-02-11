/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Entitas.ModelApp;
import Model.ModelPenjualan;
import View.ViewPenjualan;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */

// controller berfungsi sebagai otak dari memanggil class model implement yang berisi query sql untuk diimplementasikan ke dalam form transaksi
public class ControllerPenjualan {
    ViewPenjualan form;
    ModelPenjualan model;
    List<ModelApp> list; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    List<ModelApp> listbarang; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    String[] header;
    String[] headerbarang;
 
    
    public ControllerPenjualan(ViewPenjualan form) {
        this.form        = form; // form transaksi
        model            = new ModelPenjualan(); // Implement yang berisi query sql 
        list             = model.getAll(); 
        listbarang       = model.getBarang();
        header           = new String[]{"NO","ID PENJUALAN","KODE BARANG","NAMA BARANG","HARGA","QTY","SUBTOTAL"};
        headerbarang     = new String[]{"id BARANG","NAMA BARANG","HARGA BARANG","STOK"};
     
        form.getTablPenjualan().setShowGrid(true);
        form.getTablPenjualan().setShowVerticalLines(true);
        form.getTablPenjualan().setGridColor(Color.blue);
        
        form.getTableBarang().setShowGrid(true);
        form.getTableBarang().setShowVerticalLines(true);
        form.getTableBarang().setGridColor(Color.red);
    }
    //menempilkan urutan kode otomatis costuumer dan struk
    String tanggal= new SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
    
    public void tampilurutanPelanggan(){
        ModelApp p = new ModelApp();
        model.autonumbercustomer(p);
        String no_mor = String.valueOf(model.autonumbercustomer(p));
        String oke = "00".substring(0, 2 - no_mor.length());
        form.getTxtIdPelanggan().setText("CS-"+tanggal+"-"+oke + ""+no_mor);
    }
   
     public void tampilurutanNoNota(){
        ModelApp p = new ModelApp();
        model.autonumberNoNota(p);
        String no_mor = String.valueOf(model.autonumberNoNota(p));
        String oke = "00".substring(0, 2 - no_mor.length());
        form.getTxtNoNota().setText("FR-"+tanggal+"-"+oke + ""+no_mor);
    }

     //----------------------------------------------------
     
     //isi table detail penjualan dengan query inner join menggabungkan data barang dan detail transaksi
     //dengan mengambil k0ode barang
     public void isiTablePenjualan(){
      list = model.getAll();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},header){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[header.length];
         for (ModelApp B : list) {
             data[0] = B.getNo();
             data[1] = B.getId_penjualan();
             data[2] = B.getId_barang();
             data[3] = B.getNama_barang();
             data[4] = B.getHarga();
             data[5] = B.getJumlah_beli();
             data[6] = B.getSubtotal();
             tblModel.addRow(data);
         }
         form.getTablPenjualan().setModel(tblModel);
     }
     //---------------------------------------------------------//
     
     //isi table barang
       public void isiTableBarang(){
         listbarang = model.getBarang();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerbarang){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerbarang.length];
         for (ModelApp B : listbarang) {
           
             data[0] = B.getId_barang();
             data[1] = B.getNama_barang();
             data[2] = B.getHarga();
             data[3] = B.getStok_barang();
             tblModel.addRow(data);
         }
         form.getTableBarang().setModel(tblModel);
     }
       //----------------------------------------------------//
       
       // untuk table klik dan keluar isi tablenya ke dalam textfield
       //method isi field barang yang ada di table barang
        public void isiFieldBarang(int row){
        form.getTxtKodeBarang().setText(listbarang.get(row).getId_barang());
        form.getTxtNamaBarang().setText(listbarang.get(row).getNama_barang());
        form.getTxtHargaBarang().setText(String.valueOf(listbarang.get(row).getHarga()));
         form.getTxtStok().setText(String.valueOf(listbarang.get(row).getStok_barang()));
        }

//----------------------------------------------------------------------
        
        //method isi table detail penjualan yang ada di table detail detail penjualan
        public void isiFieldDetail(int row){
      
        form.getTxtNo().setText(list.get(row).getNo());
        form.getTxtNoNota().setText(list.get(row).getId_penjualan());
        form.getTxtKodeBarang().setText(list.get(row).getId_penjualan());
        form.getTxtNamaBarang().setText(list.get(row).getNama_barang());
        form.getTxtHargaBarang().setText(String.valueOf(list.get(row).getHarga()));
        form.getTxtJumlahBeli().setText(String.valueOf(list.get(row).getJumlah_beli()));
        form.getTxtSubtotal().setText(String.valueOf(list.get(row).getSubtotal()));

        }
     //------------------------------------------------------------------------------//
        
        //untuk reset
     public void reset() {      
        
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setText("");
        form.getTxtTelepon().setText("");
        form.getTxtIdPelanggan().setText("");
        form.getTxtNamaPelanggan().setText("");
        form.getTxtKodeBarang().setText("");
        form.getTxtNamaBarang().setText("");
        
        form.getTxtNoNota().setText("");
        form.getTxtTanggal().setText("");
        form.getTxtJumlahBeli().setText("");
       form.getTxtTotalHarga().setText("");
        form.getTxtSubtotal().setText("");
        form.getTxtHargaBarang().setText("");    
        form.getTxtNo().setText("");    
       
        }
     
      public void awal() {      
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setEditable(false);
        form.getTxtTelepon().setEditable(false);
        form.getTxtIdPelanggan().setEditable(false);
        form.getTxtNamaPelanggan().setEditable(false);
        form.getTxtKodeBarang().setEditable(false);
        form.getTxtNamaBarang().setEditable(false);
       
        form.getTxtNoNota().setEditable(false);
        form.getTxtJumlahBeli().setEditable(false);
         form.getTxtSubtotal().setEditable(false);
        form.getTxtTotalHarga().setEditable(false);
      
        form.getTxtHargaBarang().setEditable(false);       
      
       
        }
       public void mulai() {      
        
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setEditable(true);
        form.getTxtTelepon().setEditable(true);
        form.getTxtIdPelanggan().setEditable(false);
        form.getTxtNamaPelanggan().setEditable(true);
        form.getTxtKodeBarang().setEditable(false);
        form.getTxtNamaBarang().setEditable(false);
      
        form.getTxtNoNota().setEditable(false);
        form.getTxtJumlahBeli().setEditable(true);
         form.getTxtSubtotal().setEditable(false);
        form.getTxtTotalHarga().setEditable(false);
        form.getTxtHargaBarang().setEditable(false);       
      
         form.getTxtNamaPelanggan().requestFocus();   
        }
    //-------------------------------------------------------------..
     
     // method simpan transaksi
    
    public void simpan_penjualan() {
        //text harga dan stok tidak boleh kosong
  
        ModelApp B = new ModelApp();
        B.setId_penjualan(form.getTxtNoNota().getText());
        B.setTgl_penjualan(form.getTxtTanggal().getText());
        
        B.setId_customer(form.getTxtIdPelanggan().getText());
        
        B.setTotal_harga(Integer.parseInt(form.getTxtTotalHarga().getText()));
        B.setId_petugas(form.getTxtIdPetugas().getText()); 
        model.InsertPenjualan(B); 
        JOptionPane.showMessageDialog(form, "Penjualan  Berhasil Diproses");
    }
    //---------------------------------------------------------------//
    
//    //method delete transaksi
//    public void delete( String id){
//    if (!form.getTxtNoStruk().getText().trim().isEmpty()) {
//        model.delete(form.getTxtNoStruk().getText());
//        model.delete(id);
//        JOptionPane.showMessageDialog(form, "Data Berhasil Dihapus");
//    } else {
//        JOptionPane.showMessageDialog(form, "Pilih data yang akan di hapus");
//    }
//}
//-------------------------------------------------------------------------//
    
    //method simpan detail transaksi
    public void simpan_detail() {
        
        ModelApp B = new ModelApp();
        B.setId_penjualan(form.getTxtNoNota().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_beli(Integer.parseInt(form.getTxtJumlahBeli().getText()));
        B.setSubtotal(Integer.parseInt(form.getTxtSubtotal().getText()));
        model.InsertIsi(B);  
        
    }
    //----------------------------------------------------------------------------//
    
      public void tambah_stok() {
        //text harga dan stok tidak boleh kosong
       
        ModelApp B = new ModelApp();
        B.setId_penjualan(form.getTxtNoNota().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_beli(Integer.parseInt(form.getTxtJumlahBeli().getText()));
       
        model.tambah_stok(B);
    }
       public void kurang_stok() {
        //text harga dan stok tidak boleh kosong
       
        ModelApp B = new ModelApp();
        B.setId_penjualan(form.getTxtNoNota().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_beli(Integer.parseInt(form.getTxtJumlahBeli().getText()));
      
        model.kurang_stok(B);
    }
      
//        public void deletedetail( String id_cs){
//    if (!form.getTxtNoStruk().getText().trim().isEmpty()) {
//        model.deletedetail(form.getTxtNoStruk().getText());
//        model.deletedetail(id_cs);
//       
//        JOptionPane.showMessageDialog(form, "Data Berhasil Dihapus");
//    } else {
//        JOptionPane.showMessageDialog(form, "Pilih data yang akan di hapus");
//    }
//}
        //---------------------------------------------------------------------------------------//
       
       //method simpan dan delete costumer
     public void simpanpelanggan() {
        ModelApp B = new ModelApp();                         
        B.setId_customer(form.getTxtIdPelanggan().getText());              
        B.setNama_customer(form.getTxtNamaPelanggan().getText());   
        B.setTelepon(form.getTxtTelepon().getText()); 
        B.setAlamat(form.getTxtAlamat().getText());  
        model.insertcustomer(B);
    }
     
//        public void deletecustomer( String id_cs){
//    if (!form.getTxtIdCustomer().getText().trim().isEmpty()) {
//        model.deletecostomer(form.getTxtIdCustomer().getText());
//        model.deletecostomer(id_cs);
//        JOptionPane.showMessageDialog(form, "Data Berhasil Dihapus");
//    } else {
//        JOptionPane.showMessageDialog(form, "Pilih data yang akan di hapus");
//    }
//}
        //---------------------------------------------------------------------------------------//
        
  public void cetaknota(){
            try {
               
           String fillname = ("src/Laporan/Nota.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            hash.put("penjualan",form.getTxtNoNota().getText()); 
           
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
    
   
}
