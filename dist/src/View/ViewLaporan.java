/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerLaporan;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import sessionlogin.PetugasLogin;

/**
 *
 * @author Anjar
 */
public class ViewLaporan extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewLaporan
     */
    ControllerLaporan controller;
    public ViewLaporan() {
        initComponents();
    controller = new ControllerLaporan(this);
        controller.isiTableBarang();
        controller.isiTableCustomer();
        controller.isiTableSupplier();
        controller.isiTablePenjualan();
        controller.isiTablePengiriman();
        //session login
        String NM = PetugasLogin.getNamaLogin();
        txtnamapetugas.setText(NM);
    }
    
  private void toExcelCS(JTable table, File file) {
        
        try {
            TableModel model = tbcs.getModel();
            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i)+"\t");
                
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString()+"\t");
                   
                }
                excel.write("\n");
            }
            excel.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }   
 private void toExcelSupplier(JTable table, File file) {
        
        try {
            TableModel model = tbsupplier.getModel();
            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i)+"\t");
                
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString()+"\t");
                    
                }
                excel.write("\n");
            }
            excel.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
 
  private void toExcelBarang(JTable table, File file) {
        
        try {
            TableModel model = tbbarang.getModel();
            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i)+"\t");
                
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString()+"\t");
                    
                }
                excel.write("\n");
            }
            excel.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
  
   private void toExcelJual(JTable table, File file) {
        
        try {
            TableModel model = tbjual.getModel();
            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i)+"\t");
                
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString()+"\t");
                    
                }
                excel.write("\n");
            }
            excel.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void toExcelKirim(JTable table, File file) {
        
        try {
            TableModel model = tbkirim.getModel();
            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i)+"\t");
                
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString()+"\t");
                    
                }
                excel.write("\n");
            }
            excel.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnamapetugas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcs = new javax.swing.JTable();
        jdcs = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsupplier = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbbarang = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbjual = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jdjual1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jdjual2 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbkirim = new javax.swing.JTable();
        jdkirim2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jdkirim1 = new com.toedter.calendar.JDateChooser();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        txtnamapetugas.setText("jLabel5");

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        tbcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbcs);

        jLabel2.setText("Pilih Tanggal");

        jButton11.setBackground(new java.awt.Color(0, 204, 255));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton11.setText("Cetak Data Customer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 0));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton12.setText("Export");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jdcs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Customer", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-customer-25.png")), jPanel2); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));

        tbsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbsupplier);

        jButton13.setBackground(new java.awt.Color(255, 255, 0));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton13.setText("Export");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 255));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton14.setText("Cetak Data Supplier");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Supplier", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-supplier-25.png")), jPanel3); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 204, 51));

        tbbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbbarang);

        jButton15.setBackground(new java.awt.Color(0, 204, 255));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton15.setText("Cetak Data Barang");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 0));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton16.setText("Export");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Barang", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-packing-25.png")), jPanel4); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 204, 51));

        tbjual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbjual);

        jButton17.setBackground(new java.awt.Color(0, 204, 255));
        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton17.setText("Cetak Data Penjualan");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 0));
        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton18.setText("Export");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel3.setText("s/d");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jdjual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdjual2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdjual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jdjual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Penjualan", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-order-25.png")), jPanel5); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 204, 51));

        tbkirim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tbkirim);

        jLabel4.setText("s/d");

        jButton19.setBackground(new java.awt.Color(0, 204, 255));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton19.setText("Cetak Data Pengiriman");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 0));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton20.setText("Export");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jdkirim1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdkirim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdkirim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdkirim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Pengiriman", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delivery-25.png")), jPanel6); // NOI18N

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 700, 310));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-report-file-25.png"))); // NOI18N
        jLabel5.setText("Data Laporan HTB FOOD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        controller.cetakcustomer();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
          JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewLaporan.this);
        if (option== JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext="";
            String file = "";
            if (len > 4) {
                ext = filename.substring(len-4, len);

            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename+ "";

            }else{
                file = path + "\\" + filename+ ".xls";
            }
            toExcelCS(tbcs, new File(file));
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewLaporan.this);
        if (option== JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext="";
            String file = "";
            if (len > 4) {
                ext = filename.substring(len-4, len);

            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename+ "";

            }else{
                file = path + "\\" + filename+ ".xls";
            }
            toExcelSupplier(tbsupplier, new File(file));
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        controller.cetaksupplier();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        controller.cetakbarang();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewLaporan.this);
        if (option== JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext="";
            String file = "";
            if (len > 4) {
                ext = filename.substring(len-4, len);

            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename+ "";

            }else{
                file = path + "\\" + filename+ ".xls";
            }
            toExcelBarang(tbbarang, new File(file));
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        controller.cetakpenjualan();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewLaporan.this);
        if (option== JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext="";
            String file = "";
            if (len > 4) {
                ext = filename.substring(len-4, len);

            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename+ "";

            }else{
                file = path + "\\" + filename+ ".xls";
            }
            toExcelJual(tbjual, new File(file));
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        controller.cetakpengiriman();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
         JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewLaporan.this);
        if (option== JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext="";
            String file = "";
            if (len > 4) {
                ext = filename.substring(len-4, len);

            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename+ "";

            }else{
                file = path + "\\" + filename+ ".xls";
            }
            toExcelKirim(tbkirim, new File(file));
        }
    }//GEN-LAST:event_jButton20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private com.toedter.calendar.JDateChooser jdcs;
    private com.toedter.calendar.JDateChooser jdjual1;
    private com.toedter.calendar.JDateChooser jdjual2;
    private com.toedter.calendar.JDateChooser jdkirim1;
    private com.toedter.calendar.JDateChooser jdkirim2;
    private javax.swing.JTable tbbarang;
    private javax.swing.JTable tbcs;
    private javax.swing.JTable tbjual;
    private javax.swing.JTable tbkirim;
    private javax.swing.JTable tbsupplier;
    private javax.swing.JLabel txtnamapetugas;
    // End of variables declaration//GEN-END:variables
public JTable getTableCustomer(){
        return tbcs;
    }
    public JTable getTableSupplier(){
        return tbsupplier;
    }
    public JTable getTableBarang(){
        return tbbarang;
    }
    public JTable getTablePenjualan(){
        return tbjual;
    }
    public JTable getTablePengiriman(){
        return tbkirim;
    }
    public JLabel getTxtNamaPetugas(){
        return txtnamapetugas;
    }
    public JDateChooser getTxtTanggalCs(){
        return jdcs;
    }
    public JDateChooser getTxtTanggalJual1(){
        return jdjual1;
    }
    public JDateChooser getTxtTanggalJual2(){
        return jdjual2;
    }
    public JDateChooser getTxtTanggalKirim1(){
        return jdkirim1;
    }
    public JDateChooser getTxtTanggalKirim2(){
        return jdkirim2;
    }
}
