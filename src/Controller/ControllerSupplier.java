/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entitas.ModelApp;
import Model.ModelSupplier;
import View.ViewSupplier;
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
public class ControllerSupplier {
    ViewSupplier form;
    ModelSupplier model;
    List<ModelApp> list; //deklarasi method "List" yang sudah dibuat pada interface MODEL_DAO
    String[] header; //deklarasi variable untuk membuat judul kolom pada objek JTable

    public ControllerSupplier(ViewSupplier form) {
        this.form = form;
        model = new ModelSupplier();
        list = model.getAll();
        header = new String[]{"ID","NAMA SUPPLIER","TELEPON", "ALAMAT"};
       
        form.getTableSupplier().setShowGrid(true);
        form.getTableSupplier().setShowVerticalLines(true);
        form.getTableSupplier().setGridColor(Color.blue);
      
    }
     public void tampilurutan() {         
            ModelApp p = new ModelApp();
            model.autonumber(p);
            String no_mor=String.valueOf(model.autonumber(p));
            String oke="00".substring(0, 2 - no_mor.length());
            form.getTxtIdSupplier().setText( "SUP-"+  oke +""+no_mor );
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
            data[0] = B.getId_supplier();
            data[1] = B.getNama_supplier();
            data[2] = B.getTelepon();
            data[3] = B.getAlamat();
            
            tblModel.addRow(data);
        }
        form.getTableSupplier().setModel(tblModel);
    }
     
      
          
    
     public void isiField(int row) {
        form.getTxtIdSupplier().setText(String.valueOf(list.get(row).getId_supplier()));
        form.getTxtNamaSupplier().setText(list.get(row).getNama_supplier());
        form.getTxtTelepon().setText(list.get(row).getTelepon());
        form.getTxtAlamat().setText(list.get(row).getAlamat());
    }
      public void insert() {
        ModelApp B = new ModelApp();
        
        B.setId_supplier(form.getTxtIdSupplier().getText());
        B.setNama_supplier(form.getTxtNamaSupplier().getText());
        B.setTelepon(form.getTxtTelepon().getText());
        B.setAlamat(form.getTxtAlamat().getText());
     
        model.insert(B);
      }
      

       
      public void update() {
      ModelApp B = new ModelApp();
       
      B.setId_supplier(form.getTxtIdSupplier().getText());
      B.setNama_supplier(form.getTxtNamaSupplier().getText());
      B.setTelepon(form.getTxtTelepon().getText());
      B.setAlamat(form.getTxtAlamat().getText());
      
      model.update(B);
      }
      
       public void delete() {
          
        if (!form.getTxtIdSupplier().getText().trim().isEmpty()) {
            String id = (form.getTxtIdSupplier().getText());
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
