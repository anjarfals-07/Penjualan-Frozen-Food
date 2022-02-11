/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.ControllerRiwayat;
import chumbucket.plankton.widget.layar.Layar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anjar
 */
public class ViewRiwayat extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewRiwayat
     */
    ControllerRiwayat control;
    public ViewRiwayat() {
        initComponents();
        control = new ControllerRiwayat(this);
      control.isiTablePenjualan();
      control.isiTablePengiriman();  
       control.isiTableDetailPengiriman();
        control.isiTableDetailPenjualan();
    }
    
 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpenjualan = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbdetail_penjualan = new javax.swing.JTable();
        txtidlangsung = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbpengiriman = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbdetail_kirim = new javax.swing.JTable();
        txtidlangsung1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Riwayat Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 0));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 10, 260, 30));

        tbpenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpenjualan);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 880, 220));

        jButton9.setBackground(new java.awt.Color(0, 153, 204));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Detail Data");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 121, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

        jPanel3.add(jPanel5, "card9");

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbdetail_penjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbdetail_penjualan);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 891, 221));

        txtidlangsung.setEditable(false);
        txtidlangsung.setBackground(new java.awt.Color(0, 204, 0));
        txtidlangsung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidlangsungFocusGained(evt);
            }
        });
        txtidlangsung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidlangsungKeyReleased(evt);
            }
        });
        jPanel6.add(txtidlangsung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 249, 31));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 11, 137, 31));

        jPanel3.add(jPanel6, "card10");

        jTabbedPane1.addTab("Penjualan", jPanel3);

        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 10, 290, 30));

        tbpengiriman.setModel(new javax.swing.table.DefaultTableModel(
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
        tbpengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpengirimanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbpengiriman);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 880, 210));

        jButton10.setBackground(new java.awt.Color(0, 153, 204));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Detail Data");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 121, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search-icon.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

        jPanel4.add(jPanel7, "card9");

        jPanel8.setBackground(new java.awt.Color(0, 204, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbdetail_kirim.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbdetail_kirim);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 891, 221));

        txtidlangsung1.setEditable(false);
        txtidlangsung1.setBackground(new java.awt.Color(0, 204, 0));
        txtidlangsung1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidlangsung1FocusGained(evt);
            }
        });
        jPanel8.add(txtidlangsung1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 216, 31));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 11, 137, 31));

        jPanel4.add(jPanel8, "card10");

        jTabbedPane1.addTab("Pengiriman", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Layar.pindahPanel(jPanel3, "card10");
          TableRowSorter<TableModel>sorter = new TableRowSorter<TableModel>(((DefaultTableModel)tbdetail_penjualan.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(txtidlangsung.getText()));
        tbdetail_penjualan.setRowSorter(sorter);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        TableRowSorter<TableModel>sorter = new TableRowSorter<TableModel>(((DefaultTableModel)tbpenjualan.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
        tbpenjualan.setRowSorter(sorter);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Layar.pindahPanel(jPanel3, "card9");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpenjualanMouseClicked
        // TODO add your handling code here:
        control.isiFieldDetailPenjualan(tbpenjualan.getSelectedRow());
    }//GEN-LAST:event_tbpenjualanMouseClicked

    private void txtidlangsungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidlangsungFocusGained
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtidlangsungFocusGained

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
         TableRowSorter<TableModel>sorter = new TableRowSorter<TableModel>(((DefaultTableModel)tbpengiriman.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(jTextField2.getText()));
        tbpengiriman.setRowSorter(sorter);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void tbpengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpengirimanMouseClicked
        // TODO add your handling code here:
         control.isiFieldDetailPengiriman(tbpengiriman.getSelectedRow());
    }//GEN-LAST:event_tbpengirimanMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
          Layar.pindahPanel(jPanel4, "card10");
          TableRowSorter<TableModel>sorter = new TableRowSorter<TableModel>(((DefaultTableModel)tbdetail_kirim.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(txtidlangsung1.getText()));
        tbdetail_kirim.setRowSorter(sorter);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtidlangsung1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidlangsung1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidlangsung1FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       Layar.pindahPanel(jPanel4, "card9");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtidlangsungKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidlangsungKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidlangsungKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbdetail_kirim;
    private javax.swing.JTable tbdetail_penjualan;
    private javax.swing.JTable tbpengiriman;
    private javax.swing.JTable tbpenjualan;
    private javax.swing.JTextField txtidlangsung;
    private javax.swing.JTextField txtidlangsung1;
    // End of variables declaration//GEN-END:variables
public JTable getTablePenjualan(){
    return tbpenjualan;
}
public JTable getTableDetailPenjualan(){
    return tbdetail_penjualan;
}
public JTextField getTxtTransaksiPenjualan(){
    return txtidlangsung;
}
public JTable getTablePengiriman(){
    return tbpengiriman;
}
public JTable getTableDetailPengiriman(){
    return tbdetail_kirim;
}
public JTextField getTxtTransaksiPengiriman(){
    return txtidlangsung1;
}


}