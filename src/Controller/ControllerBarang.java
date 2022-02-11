/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitas.ModelApp;
import Model.ModelBarang;
import View.ViewBarang;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anjar
 */
public class ControllerBarang {
    ViewBarang form;
    ModelBarang model;
    List<ModelApp> list; //deklarasi method "List" yang sudah dibuat pada interface MODEL_DAO
    String[] header; //deklarasi variable untuk membuat judul kolom pada objek JTable

    public ControllerBarang(ViewBarang form) {
        this.form = form;
        model = new ModelBarang();
        list = model.getAll();
        header = new String[]{"ID","NAMA BARANG","SATUAN BARANG", "HARGA BARANG","STOK BARANG"};
       
        form.getTableBarang().setShowGrid(true);
        form.getTableBarang().setShowVerticalLines(true);
        form.getTableBarang().setGridColor(Color.blue);
      
    }
     public void tampilurutan() {         
            ModelApp p = new ModelApp();
            model.autonumber(p);
            String no_mor=String.valueOf(model.autonumber(p));
            String oke="00".substring(0, 2 - no_mor.length());
            form.getTxtIdBarang().setText( "BRG-"+  oke +""+no_mor );
        }
     
    
     public void isiTable() {
        list = model.getAll();
        //Script agar jtable tidak bisa di edit
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }
        };

        Object[] data = new Object[header.length];
        for (ModelApp B : list) {
            data[0] = B.getId_barang();
            data[1] = B.getNama_barang();
            data[2] = B.getSatuan();
            data[3] = B.getHarga();
            data[4] = B.getStok_barang();
            tblModel.addRow(data);
        }
        form.getTableBarang().setModel(tblModel);
    }
     
      
          
    
     public void isiField(int row) {
        form.getTxtIdBarang().setText(String.valueOf(list.get(row).getId_barang()));
        form.getTxtNamaBarang().setText(list.get(row).getNama_barang());
        form.getTxtSatuan().setText(list.get(row).getSatuan());
        form.getTxtHarga().setText(String.valueOf(list.get(row).getHarga()));
        form.getTxtStok().setText(String.valueOf(list.get(row).getStok_barang()));
    }
      public void insert() {
        ModelApp B = new ModelApp();
        
        B.setId_barang(form.getTxtIdBarang().getText());
        B.setNama_barang(form.getTxtNamaBarang().getText());
        B.setHarga(Integer.parseInt(form.getTxtHarga().getText()));
        B.setSatuan(form.getTxtSatuan().getText());
        B.setStok_barang(Integer.parseInt(form.getTxtStok().getText()));
        model.insert(B);
      }
      

       
      public void update() {
      ModelApp B = new ModelApp();
      
      B.setId_barang(form.getTxtIdBarang().getText());
      B.setNama_barang(form.getTxtNamaBarang().getText());
      B.setHarga(Integer.parseInt(form.getTxtHarga().getText()));
      B.setSatuan(form.getTxtSatuan().getText());
      B.setStok_barang(Integer.parseInt(form.getTxtStok().getText()));
      
      model.update(B);
      }
      
       public void delete() {
          
        if (!form.getTxtIdBarang().getText().trim().isEmpty()) {
            String id = (form.getTxtIdBarang().getText());
            model.delete(id);
        } else {
            JOptionPane.showMessageDialog(form, "Pilih data yang akan dihapus");
        }
    }
       
//       public void cetakSuratPengantar(){
//            try {
//               
//           String fillname = ("src/Laporan/FormulirSuratPengantar.jasper");
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/siwarga014","root","");
//             
//            HashMap hash = new HashMap();
//            //Mengambil parameter dari ireport
//                  hash.put("no_surat_pengantar",(form.getTxtNo_Surat().getText()));
//                     hash.put("nama_rt",(form.getTxtNamaErte().getText()));
//                   File file = new File(fillname);
//                   JasperReport jasperReport =(JasperReport)JRLoader.loadObject(file.getPath());
//                   JasperPrint jasperPrint = JasperFillManager.fillReport(fillname, hash, koneksi);
//                   JasperViewer.viewReport(jasperPrint, false);
//                   
//        } catch(Exception ex) {
//            JOptionPane.showMessageDialog(null,"Data Tidak dapat Dicetak !!"+"\n"+ex.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
//        }
//        
//  }  
}
