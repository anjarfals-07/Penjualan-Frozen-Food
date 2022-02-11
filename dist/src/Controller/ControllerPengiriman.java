/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Entitas.ModelApp;
import Model.ModelPengiriman;
import View.ViewPengiriman;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */

// controller berfungsi sebagai otak dari memanggil class model implement yang berisi query sql untuk diimplementasikan ke dalam form transaksi
public class ControllerPengiriman {
    ViewPengiriman form;
    ModelPengiriman model;
    List<ModelApp> list; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    List<ModelApp> listbarang; //deklarasi method "List" yang sudah dibuat pada interface InterfaceEc
    String[] header;
    String[] headerbarang;
 
    
    public ControllerPengiriman(ViewPengiriman form) {
        this.form        = form; // form transaksi
        model            = new ModelPengiriman(); // Implement yang berisi query sql 
        list             = model.getAll(); 
        listbarang       = model.getBarang();
        header           = new String[]{"NO","ID PENGIRIMAN","KODE BARANG","NAMA BARANG","HARGA","QTY"};
        headerbarang     = new String[]{"id BARANG","NAMA BARANG","HARGA BARANG","STOK"};
     
        form.getTablePengiriman().setShowGrid(true);
        form.getTablePengiriman().setShowVerticalLines(true);
        form.getTablePengiriman().setGridColor(Color.blue);
        
        form.getTableBarang().setShowGrid(true);
        form.getTableBarang().setShowVerticalLines(true);
        form.getTableBarang().setGridColor(Color.red);
    }
    //menempilkan urutan kode otomatis costuumer dan struk
    String tanggal= new SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
    

     public void tampilurutannoPengiriman(){
        ModelApp p = new ModelApp();
        model.autonumberNoPengiriman(p);
        String no_mor = String.valueOf(model.autonumberNoPengiriman(p));
        String oke = "00".substring(0, 2 - no_mor.length());
        form.getTxtIdPengiriman().setText("ORD-"+tanggal+"-"+oke + ""+no_mor);
    }
  public void isicombosupplier() {
        form.getTxtNamaSupplier().removeAllItems();
        form.getTxtNamaSupplier().addItem("--Pilih Supplier--");
        for (ModelApp b : model.isicombosupplier()) {
            form.getTxtNamaSupplier().addItem(b.getNama_supplier());
        }
    }
    
    //method ini akan digunakan untuk menampilkan kode supplier dan lain-lain berdasarkan inputan combo nama supplier
    public void tampilkodesupplier() {
        if (form.getTxtNamaSupplier().getSelectedIndex() != 0) {
            for (ModelApp b : model.getkodesupplier(form.getTxtNamaSupplier().getSelectedItem().toString())) {
               form.getTxtIdSupplier().setText(String.valueOf(b.getId_supplier()));
                form.getTxtTelepon().setText(String.valueOf(b.getTelepon()));
                form.getTxtAlamat().setText(String.valueOf(b.getAlamat()));
            }
        }
    }  
     //----------------------------------------------------
     
     //isi table detail penjualan dengan query inner join menggabungkan data barang dan detail transaksi
     //dengan mengambil k0ode barang
     public void isiTablePengiriman(){
      list = model.getAll();
         DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{},header){
               public boolean isCellEditable(int RowIndex, int ColumnIndex){
                   return false;
               }
         };
      Object[] data = new Object[header.length];
         for (ModelApp B : list) {
             data[0] = B.getNo();
             data[1] = B.getId_pengiriman();
             data[2] = B.getId_barang();
             data[3] = B.getNama_barang();
             data[4] = B.getHarga();
             data[5] = B.getJumlah_kirim();
             
             tblModel.addRow(data);
         }
         form.getTablePengiriman().setModel(tblModel);
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
        form.getTxtIdPengiriman().setText(list.get(row).getId_pengiriman());
        form.getTxtKodeBarang().setText(list.get(row).getId_pengiriman());
        form.getTxtNamaBarang().setText(list.get(row).getNama_barang());
        form.getTxtHargaBarang().setText(String.valueOf(list.get(row).getHarga()));
        form.getTxtJumlahKirim().setText(String.valueOf(list.get(row).getJumlah_kirim()));

        }
     //------------------------------------------------------------------------------//
        
        //untuk reset
     public void reset() {      
        
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setText("");
        form.getTxtTelepon().setText("");
        form.getTxtIdSupplier().setText("");
        form.getTxtNamaSupplier().setSelectedItem("");
        form.getTxtKodeBarang().setText("");
        form.getTxtNamaBarang().setText("");
        
        form.getTxtIdPengiriman().setText("");
        form.getTxtTanggal().setText("");
        form.getTxtJumlahKirim().setText("");
       
        form.getTxtTotalKirim().setText("");
        form.getTxtHargaBarang().setText("");    
        form.getTxtNo().setText("");    
       
        }
     
      public void awal() {      
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setEditable(false);
        form.getTxtTelepon().setEditable(false);
        form.getTxtIdSupplier().setEditable(false);
        form.getTxtNamaSupplier().setEditable(false);
        form.getTxtKodeBarang().setEditable(false);
        form.getTxtNamaBarang().setEditable(false);
       
        form.getTxtIdPengiriman().setEditable(false);
        form.getTxtJumlahKirim().setEditable(false);
      
        form.getTxtHargaBarang().setEditable(false);       
      
       
        }
       public void mulai() {      
        
        //form.getTanggal().setDate(null);
        form.getTxtAlamat().setEditable(true);
        form.getTxtTelepon().setEditable(true);
        form.getTxtIdSupplier().setEditable(false);
        form.getTxtNamaSupplier().setEditable(true);
        form.getTxtKodeBarang().setEditable(false);
        form.getTxtNamaBarang().setEditable(false);
      
        form.getTxtIdPengiriman().setEditable(false);
        form.getTxtJumlahKirim().setEditable(true);
       
        form.getTxtTotalKirim().setEditable(false);
        form.getTxtHargaBarang().setEditable(false);       
      
         form.getTxtNamaSupplier().requestFocus();   
        }
    //-------------------------------------------------------------..
     
     // method simpan transaksi
    
    public void simpan_pengiriman() {
        //text harga dan stok tidak boleh kosong
  
        ModelApp B = new ModelApp();
        B.setId_pengiriman(form.getTxtIdPengiriman().getText());
        B.setTgl_pengiriman(form.getTxtTanggal().getText());        
        B.setId_supplier(form.getTxtIdSupplier().getText());    
        B.setTotal_kirim(Integer.parseInt(form.getTxtTotalKirim().getText()));
        B.setId_petugas(form.getTxtIdPetugas().getText()); 
        model.InsertPengiriman(B); 
        JOptionPane.showMessageDialog(form, "Pengiriman Supplier Berhasil Diproses");
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
        B.setId_pengiriman(form.getTxtIdPengiriman().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_kirim(Integer.parseInt(form.getTxtJumlahKirim().getText()));
      
        model.InsertIsi(B);  
        
    }
    //----------------------------------------------------------------------------//
    
      public void tambah_stok() {
        //text harga dan stok tidak boleh kosong
       
        ModelApp B = new ModelApp();
        B.setId_pengiriman(form.getTxtIdPengiriman().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_kirim(Integer.parseInt(form.getTxtJumlahKirim().getText()));
       
        model.tambah_stok(B);
    }
       public void kurang_stok() {
        //text harga dan stok tidak boleh kosong
       
        ModelApp B = new ModelApp();
       B.setId_pengiriman(form.getTxtIdPengiriman().getText());
        B.setId_barang(form.getTxtKodeBarang().getText());
        B.setJumlah_kirim(Integer.parseInt(form.getTxtJumlahKirim().getText()));
       
      
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
//     public void simpansupplier() {
//        ModelApp B = new ModelApp();                         
//        B.setId_supplier(form.getTxtIdSupplier().getText());              
//        B.setNama_supplier(form.getTxtNamaSupplier().getText());   
//        B.setTelepon(form.getTxtTelepon().getText()); 
//        B.setAlamat(form.getTxtAlamat().getText());  
//        model.insertsupplier(B);
//    }
     
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
        
  
    
   
}
