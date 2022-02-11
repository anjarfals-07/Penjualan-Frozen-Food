/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelRiwayat;
import Entitas.ModelApp;
import View.ViewRiwayat;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anjar
 */
public class ControllerRiwayat {
    
     ViewRiwayat form;
    ModelRiwayat model;
    List<ModelApp> listpenjualan; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    List<ModelApp> listdetailpenjualan; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    List<ModelApp> listpengiriman; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    List<ModelApp> listdetailpengiriman; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    String[] headerpenjualan;
    String[] headerdetailpenjualan;
    String[] headerpengiriman;
    String[] headerdetailpengiriman;
    
    public ControllerRiwayat(ViewRiwayat form) {
        this.form               = form; // form transaksi
        model                   = new ModelRiwayat(); // Implement yang berisi query sql 
        listpenjualan           = model.getAllPenjualan(); 
        listpengiriman          = model.getAllPengiriman(); 
        listdetailpenjualan     = model.getAllDetailPenjualan();
        listdetailpengiriman    = model.getAllDetailPengiriman();
        headerpenjualan         = new String[]{"ID TRANSAKSI","TANGGAL","ID CUSTOMER","NAMA CUSTOMER","TOTAL HARGA"};
        headerpengiriman         = new String[]{"ID PENGIRIMAN","TANGGAL","ID SUPPLIER","NAMA SUPPLIER","TOTAL PENGIRIMAN"};
        headerdetailpenjualan   = new String[]{"ID PENJUALAN","ID BARANG","NAMA BARANG","SATUAN","HARGA BARANG","JUMLAH BELI","SUBTOTAL"};
        headerdetailpengiriman   = new String[]{"ID PENGIRIMAN","ID BARANG","NAMA BARANG","SATUAN","HARGA BARANG","JUMLAH KIRIM"};
//     
//        form.getTablePenjualan().setShowGrid(true);
//        form.getTableLangsung().setShowVerticalLines(true);
//        form.getTableLangsung().setGridColor(Color.blue);
  
    }
  

    
     //----------------------------------------------------
     
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
     
        //isi table isiTableLangsung
     public void isiTableDetailPenjualan(){
      listdetailpenjualan = model.getAllDetailPenjualan();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerdetailpenjualan){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerdetailpenjualan.length];
         for (ModelApp B : listdetailpenjualan) {
             data[0] = B.getId_penjualan();
             data[1] = B.getId_barang();
             data[2] = B.getNama_barang();
             data[3] = B.getSatuan();
             data[4] = B.getHarga();
             data[5] = B.getJumlah_beli();
             data[6] = B.getSubtotal();
             tblModel.addRow(data);
         }
         form.getTableDetailPenjualan().setModel(tblModel);
     }
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
       
        public void isiTableDetailPengiriman(){
      listdetailpengiriman = model.getAllDetailPengiriman();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},headerdetailpengiriman){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[headerdetailpengiriman.length];
         for (ModelApp B : listdetailpengiriman) {
             data[0] = B.getId_pengiriman();
             data[1] = B.getId_barang();
             data[2] = B.getNama_barang();
             data[3] = B.getSatuan();
             data[4] = B.getHarga();
             data[5] = B.getJumlah_kirim();
         
             tblModel.addRow(data);
         }
         form.getTableDetailPengiriman().setModel(tblModel);
     }
       //----------------------------------------------------//
       
     
       //----------------------------------------------------//
       
     public void isiFieldDetailPenjualan(int row) {
       form.getTxtTransaksiPenjualan().setText (listpenjualan.get(row).getId_penjualan());

    }
     
      public void isiFieldDetailPengiriman(int row) {
       form.getTxtTransaksiPengiriman().setText (listpengiriman.get(row).getId_pengiriman());

    }
   
}
