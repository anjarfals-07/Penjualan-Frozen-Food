/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelLaporan;
import Entitas.ModelApp;
import KoneksiDB.Koneksi;
import View.ViewLaporan;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * @author Anjar
 */
public class ControllerLaporan {
    private Connection con = Koneksi.connection();
     ViewLaporan form;
    ModelLaporan model;
    List<ModelApp> listcustomer;
    List<ModelApp> listsupplier;
    List<ModelApp> listbarang;
    List<ModelApp> listpenjualan; //deklarasi method "List" yang sudah dibuat pada interface InterfaceE
    List<ModelApp> listpengiriman; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
//  List<ModelApp> listdetailpenjualan; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
//  List<ModelApp> listdetailpengiriman; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    String[] headercustomer;
    String[] headersupplier;
    String[] headerbarang;
    String[] headerpenjualan;
    String[] headerpengiriman;
//    String[] headerdetailpengiriman;
//    String[] headerdetailpenjualan;
    
    public ControllerLaporan(ViewLaporan form) {
        this.form               = form; // form transaksi
        model                   = new ModelLaporan(); // Implement yang berisi query sql 
        listcustomer            = model.getAllCustomer(); 
        listsupplier            = model.getAllSupplier(); 
        listbarang              = model.getAllBarang(); 
        listpenjualan           = model.getAllPenjualan(); 
        listpengiriman          = model.getAllPengiriman(); 
//        listdetailpenjualan     = model.getAllDetailPenjualan();
//        listdetailpengiriman    = model.getAllDetailPengiriman();
        headersupplier          = new String[]{"ID SUPPLIER","NAMA SUPPLIER","TELEPON","ALAMAT"};
        headerbarang            = new String[]{"ID BARANG","NAMA BARANG","SATUAN","HARGA BARANG","STOK BARANG"};
        headercustomer          = new String[]{"ID TRANSAKSI","TANGGAL","ID CUSTOMER","NAMA CUSTOMER","TELEPON","ALAMAT"};
        headerpenjualan         = new String[]{"ID TRANSAKSI","TANGGAL","ID CUSTOMER","NAMA CUSTOMER","TOTAL HARGA"};
        headerpengiriman         = new String[]{"ID PENGIRIMAN","TANGGAL","ID SUPPLIER","NAMA SUPPLIER","TOTAL PENGIRIMAN"};
//        headerdetailpenjualan   = new String[]{"ID PENJUALAN","ID BARANG","NAMA BARANG","SATUAN","HARGA BARANG","JUMLAH BELI","SUBTOTAL"};
//        headerdetailpengiriman   = new String[]{"ID PENGIRIMAN","ID BARANG","NAMA BARANG","SATUAN","HARGA BARANG","JUMLAH KIRIM"};

  
    }
  

    
     //----------------------------------------------------
      public void isiTableCustomer(){
      listcustomer = model.getAllCustomer();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headercustomer){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headercustomer.length];
         for (ModelApp B : listcustomer) {
             data[0] = B.getId_penjualan();
             data[1] = B.getTgl_penjualan();
             data[2] = B.getId_customer();
             data[3] = B.getNama_customer();
             data[4] = B.getTelepon();
             data[5] = B.getAlamat();
             tblModel.addRow(data);
         }
         form.getTableCustomer().setModel(tblModel);
     }
     
        public void isiTableSupplier(){
      listsupplier = model.getAllSupplier();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headersupplier){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headersupplier.length];
         for (ModelApp B : listsupplier) {
             data[0] = B.getId_supplier();
             data[1] = B.getNama_supplier();
             data[2] = B.getTelepon();
             data[3] = B.getAlamat();
             tblModel.addRow(data);
         }
         form.getTableSupplier().setModel(tblModel);
     }
        
      public void isiTableBarang(){
      listbarang = model.getAllBarang();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerbarang){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerbarang.length];
         for (ModelApp B : listbarang) {
             data[0] = B.getId_barang();
             data[1] = B.getNama_barang();
             data[2] = B.getSatuan();
             data[3] = B.getHarga();
             data[4] = B.getStok_barang();
             tblModel.addRow(data);
         }
         form.getTableBarang().setModel(tblModel);
     }
             
     //isi table isiTableLangsung
     public void isiTablePenjualan(){
      listpenjualan = model.getAllPenjualan();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerpenjualan){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerpenjualan.length];
         for (ModelApp B : listpenjualan) {
             data[0] = B.getId_penjualan();
             data[1] = B.getTgl_penjualan();
             data[2] = B.getId_customer();
             data[3] = B.getNama_customer();
             data[4] = B.getTotal_harga();
             
             tblModel.addRow(data);
         }
         form.getTablePenjualan().setModel(tblModel);
     }
     
//        //isi table isiTableLangsung
//     public void isiTableDetailPenjualan(){
//      listdetailpenjualan = model.getAllDetailPenjualan();
//         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerdetailpenjualan){
//               public boolean isCellEditable(int RowIndex, int ColumnIndex){
//                   return false;
//               }
//         };
//      Object[] data = new Object[headerdetailpenjualan.length];
//         for (ModelApp B : listdetailpenjualan) {
//             data[0] = B.getId_penjualan();
//             data[1] = B.getId_barang();
//             data[2] = B.getNama_barang();
//             data[3] = B.getSatuan();
//             data[4] = B.getHarga();
//             data[5] = B.getJumlah_beli();
//             data[6] = B.getSubtotal();
//             tblModel.addRow(data);
//         }
//         form.getTableDetailPenjualan().setModel(tblModel);
//     }
     //---------------------------------------------------------//
     
       public void isiTablePengiriman(){
      listpengiriman = model.getAllPengiriman();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerpengiriman){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerpengiriman.length];
         for (ModelApp B : listpengiriman) {
             data[0] = B.getId_pengiriman();
             data[1] = B.getTgl_pengiriman();
             data[2] = B.getId_supplier();
             data[3] = B.getNama_supplier();
             data[4] = B.getTotal_kirim();
             
             tblModel.addRow(data);
         }
         form.getTablePengiriman().setModel(tblModel);
     }
     //----------------------------------------------------//
       
//        public void isiTableDetailPengiriman(){
//      listdetailpengiriman = model.getAllDetailPengiriman();
//         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerdetailpengiriman){
//               public boolean isCellEditable(int RowIndex, int ColumnIndex){
//                   return false;
//               }
//         };
//      Object[] data = new Object[headerdetailpengiriman.length];
//         for (ModelApp B : listdetailpengiriman) {
//             data[0] = B.getId_pengiriman();
//             data[1] = B.getId_barang();
//             data[2] = B.getNama_barang();
//             data[3] = B.getSatuan();
//             data[4] = B.getHarga();
//             data[5] = B.getJumlah_kirim();
//         
//             tblModel.addRow(data);
//         }
//         form.getTableDetailPengiriman().setModel(tblModel);
//     }
       //----------------------------------------------------//
       
     
       //--------------------------cetak------------------------//
       
   public void cetakcustomer(){
            try {
               
           String fillname = ("src/Laporan/DataCustomer.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            hash.put("tgl",form.getTxtTanggalCs().getDate()); 
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
   
   public void cetaksupplier(){
            try {
               
           String fillname = ("src/Laporan/DataSupplier.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
   
   
    public void cetakbarang(){
            try {
               
           String fillname = ("src/Laporan/DataBarang.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
    
    public void cetakpenjualan(){
            try {
               
           String fillname = ("src/Laporan/DataPenjualan.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            hash.put("tgl1",form.getTxtTanggalJual1().getDate()); 
            hash.put("tgl2",form.getTxtTanggalJual2().getDate()); 
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
     public void cetakpengiriman(){
            try {
               
           String fillname = ("src/Laporan/DataPengiriman.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/frozen_food","root","");
            HashMap hash = new HashMap();
            hash.put("petugas",form.getTxtNamaPetugas().getText()); 
            hash.put("tgl1",form.getTxtTanggalKirim1().getDate()); 
            hash.put("tgl2",form.getTxtTanggalKirim2().getDate()); 
            File file = new File(fillname);
             JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
                   
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
        
  } 
   
}
