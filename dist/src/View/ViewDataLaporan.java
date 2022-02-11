/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ControllerLaporan;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
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
public class ViewDataLaporan extends javax.swing.JInternalFrame {

    /**
     * Creates new form Costumer
     */
//       ControllerLaporan controller;
    public ViewDataLaporan() {
        initComponents();
// controller = new ControllerLaporan(this);
//        controller.isiTableBarang();
//        controller.isiTableCustomer();
//        controller.isiTableSupplier();
//        controller.isiTablePenjualan();
//        controller.isiTablePengiriman();
//        //session login
//        String NM = PetugasLogin.getNamaLogin();
//        txtnamapetugas.setText(NM);
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

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcs = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jdcs = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsupplier = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbbarang = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbjual = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jdjual1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jdjual2 = new com.toedter.calendar.JDateChooser();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbkirim = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jdkirim1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jdkirim2 = new com.toedter.calendar.JDateChooser();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnamapetugas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setVisible(true);

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 0));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-print-25.png"))); // NOI18N
        jButton1.setText("Cetak Data Costumer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Pilih Tanggal");

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton6.setText("Export");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdcs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton6)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Data Customer", new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-customer-25.png")), jPanel2); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 204, 0));

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-print-25.png"))); // NOI18N
        jButton2.setText("Cetak Data Supplier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton7.setText("Export");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab(" Data Supplier", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-supplier-25.png")), jPanel4); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-print-25.png"))); // NOI18N
        jButton3.setText("Cetak Data Barang");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton8.setBackground(new java.awt.Color(255, 255, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton8.setText("Export");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab(" Data Barang", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-packing-25.png")), jPanel5); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-print-25.png"))); // NOI18N
        jButton4.setText("Cetak Data Penjualan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("s/d");

        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton9.setText("Export");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jdjual1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jdjual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdjual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdjual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Data Penjualan", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-order-25.png")), jPanel6); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print-25.png"))); // NOI18N
        jButton5.setText("Cetak Pengiriman Supplier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("s/d");

        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-microsoft-excel-25.png"))); // NOI18N
        jButton10.setText("Export");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jdkirim1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jdkirim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdkirim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdkirim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Data Pengiriman", new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delivery-25.png")), jPanel7); // NOI18N

        txtnamapetugas.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-report-file-25.png"))); // NOI18N
        jLabel1.setText("Data Laporan HTB FOOD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(txtnamapetugas)
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnamapetugas)
                    .addComponent(jLabel1))
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        controller.cetakcustomer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewDataLaporan.this);
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        controller.cetaksupplier();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewDataLaporan.this);
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        controller.cetakbarang();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewDataLaporan.this);
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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        controller.cetakpenjualan();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewDataLaporan.this);
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
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        controller.cetakpengiriman();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(ViewDataLaporan.this);
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
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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