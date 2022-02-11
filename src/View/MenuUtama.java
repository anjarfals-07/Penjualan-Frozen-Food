/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import KoneksiDB.Koneksi;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import sessionlogin.PetugasLogin;


/**
 *
 * @author Anjar
 */
public class MenuUtama extends javax.swing.JFrame implements Runnable  {
    
    /**
     * Creates new form MenuUtama
     */

     private Connection conn = new Koneksi().connection();
     //variabel text gerak
     Thread t;
        boolean kanan=true;
        boolean kiri=false;
        boolean jalan=true;
        int x,y;
        int a,b;
        

    public MenuUtama() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        initListener();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Gambar/logo.jpg"));
        setIconImage(icon.getImage());
    
       // menampilkan form di tengah layar
        this.setLocationRelativeTo(null);
          jPanel9.setVisible(false);
          jPanel9.setEnabled(false);
          

         String KD = PetugasLogin.getKodeLogin();
        lbadm.setText(KD);
      
        String NM = PetugasLogin.getNamaLogin();
        namaadm.setText(NM);
        
        //pemanggilan text bergerak kekanan dan kira
        x = textgerak.getX();
        y= textgerak.getY();
        t= new Thread(this);
        t.start();//pemanggilan text gerak

    }

     //text gerak
      @Override
    public void run() {
        getjam(); 
      while(true){
          if(jalan){
              if(x >= pgerak.getWidth()-130){
                  kiri=true;
                  kanan=false;
              }
               if(kiri){
                   x --;
                   textgerak.setLocation(x,y); 
              }
               if(x<=5){
                   kanan=true;
                   kiri=false;
              }
               if(kanan){
                   x++;
                   textgerak.setLocation(x,y);
              } 

       } try {
         Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE,null,ex);
        }
 
      }
    }
    
    public void getBackgroundColor(){
        Color c= jColorChooser1.showDialog(null,"Background Color", jDesktopPane1.getBackground());
        jDesktopPane1.setBackground(c);
        
            
    }
   
   
    public void getBackgroundColorSide(){
        Color d= jColorChooser1.showDialog(null,"Panel Side",getBackground());
        panel_side.setBackground(d);

        jPanel9.setBackground(d);
        jPanel8.setBackground(d);
        panel_master.setBackground(d);
        pnldata.setBackground(d);
        pnel_top.setBackground(d);
       
    }
    public void getBackgroundTextColor(){
         Color d= jColorChooser1.showDialog(null,"Title Text Color ",getForeground());
        jLabel36.setForeground(d);
        jLabel37.setForeground(d);
        lbadm.setForeground(d);
        namaadm.setForeground(d);
        lbl_tgl.setForeground(d);
        lbl_jam.setForeground(d);
        lbversi.setForeground(d);
    }
   
    public void getjam(){
       ActionListener taskPerformer = new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent evt) {
               SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-YYYY");
               String no1_jam="";
               String no1_menit="";
               String no1_detik="";
               Date dt= new Date();
               int nilai_jam = dt.getHours();
               int nilai_menit = dt.getMinutes();
               int nilai_detik = dt.getSeconds();
               if(nilai_jam<=9){
                   no1_jam="0";
               }
               if(nilai_menit<=9){
                   no1_menit="0";
               }
               if(nilai_detik<=9){
                   no1_detik="0";
               }
               String jam = no1_jam + Integer.toString(nilai_jam);
               String menit = no1_menit + Integer.toString(nilai_menit);
               String detik = no1_detik + Integer.toString(nilai_detik);
               lbl_jam.setText("  " + jam+ " : " +menit+ " : " +detik+ "  ");
               lbl_tgl.setText(tgl.format(dt));
           }
       };
       new javax.swing.Timer(1000, taskPerformer).start();
    }
    
      private void initListener(){
        this.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e){
              exit();  
            }
});
        
    }
    
    public void exit(){
         int konfirmasi = JOptionPane.showConfirmDialog(
                this, "Konfirmasi Keluar Aplikasi",
                "Yakin Ingin Keluar Dari Program",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (konfirmasi== JOptionPane.YES_OPTION) {
            System.exit(0);
            
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

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_side = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel_master = new javax.swing.JPanel();
        pnldata = new javax.swing.JPanel();
        bdaftar = new javax.swing.JPanel();
        lbdaftar = new javax.swing.JLabel();
        bbyr = new javax.swing.JPanel();
        lbbyr = new javax.swing.JLabel();
        bkelas = new javax.swing.JPanel();
        lbkls = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbadm = new javax.swing.JLabel();
        namaadm = new javax.swing.JLabel();
        lbl_tgl = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        pnel_top = new javax.swing.JPanel();
        lbversi = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        pgerak = new javax.swing.JPanel();
        textgerak = new javax.swing.JPanel();
        hh = new javax.swing.JLabel();
        textgerak1 = new javax.swing.JLabel();
        textgerak2 = new javax.swing.JLabel();
        lblnamaadm3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 0));
        jDesktopPane1.setEnabled(false);
        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        panel_side.setBackground(new java.awt.Color(0, 153, 0));
        panel_side.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/full-time.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/date.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customers.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(219, 219, 219))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-exit-sign-16.png"))); // NOI18N
        jLabel10.setText("Exit");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-color-wheel-25.png"))); // NOI18N
        jLabel11.setText("Warna 1");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-about-16.png"))); // NOI18N
        jLabel12.setText("About");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 30));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jLabel13.setText("  Logout");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 30));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel14MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database.png"))); // NOI18N
        jLabel14.setText("Backup Dan Restore Database");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, 30));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel16MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-color-wheel-25.png"))); // NOI18N
        jLabel17.setText("Warna 2");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 30));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel18MousePressed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-color-wheel-25.png"))); // NOI18N
        jLabel39.setText("Warna 1");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-color-wheel-25.png"))); // NOI18N
        jLabel38.setText(" Text");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, 30));

        jPanel15.setBackground(new java.awt.Color(0, 153, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-menu-25.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-menu-25.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel21MousePressed(evt);
            }
        });
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel22MousePressed(evt);
            }
        });
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_master.setBackground(new java.awt.Color(204, 204, 204));
        panel_master.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panel_master.setLayout(new java.awt.CardLayout());

        pnldata.setBackground(new java.awt.Color(255, 255, 255));
        pnldata.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bdaftar.setBackground(new java.awt.Color(255, 255, 255));
        bdaftar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bdaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdaftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdaftarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bdaftarMousePressed(evt);
            }
        });

        lbdaftar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delivery-25.png"))); // NOI18N
        lbdaftar.setText("Data Pengiriman Supplier");

        javax.swing.GroupLayout bdaftarLayout = new javax.swing.GroupLayout(bdaftar);
        bdaftar.setLayout(bdaftarLayout);
        bdaftarLayout.setHorizontalGroup(
            bdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bdaftarLayout.createSequentialGroup()
                .addComponent(lbdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bdaftarLayout.setVerticalGroup(
            bdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bbyr.setBackground(new java.awt.Color(255, 255, 255));
        bbyr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bbyr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbyrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbyrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bbyrMousePressed(evt);
            }
        });

        lbbyr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbbyr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-payment-check-25.png"))); // NOI18N
        lbbyr.setText("Riwayat Transaksi");

        javax.swing.GroupLayout bbyrLayout = new javax.swing.GroupLayout(bbyr);
        bbyr.setLayout(bbyrLayout);
        bbyrLayout.setHorizontalGroup(
            bbyrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bbyrLayout.createSequentialGroup()
                .addComponent(lbbyr)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bbyrLayout.setVerticalGroup(
            bbyrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bbyrLayout.createSequentialGroup()
                .addComponent(lbbyr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bkelas.setBackground(new java.awt.Color(255, 255, 255));
        bkelas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bkelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkelasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bkelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bkelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bkelasMousePressed(evt);
            }
        });

        lbkls.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbkls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-payment-25.png"))); // NOI18N
        lbkls.setText("Data Penjualan");
        lbkls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbklsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbklsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbklsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bkelasLayout = new javax.swing.GroupLayout(bkelas);
        bkelas.setLayout(bkelasLayout);
        bkelasLayout.setHorizontalGroup(
            bkelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bkelasLayout.createSequentialGroup()
                .addComponent(lbkls, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bkelasLayout.setVerticalGroup(
            bkelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbkls, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pnldataLayout = new javax.swing.GroupLayout(pnldata);
        pnldata.setLayout(pnldataLayout);
        pnldataLayout.setHorizontalGroup(
            pnldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bkelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bbyr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnldataLayout.setVerticalGroup(
            pnldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bbyr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_master.add(pnldata, "card3");

        jScrollPane3.setViewportView(panel_master);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Petugas");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kode Petugas");

        lbadm.setForeground(new java.awt.Color(255, 255, 255));
        lbadm.setText("jLabel7");
        lbadm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        namaadm.setForeground(new java.awt.Color(255, 255, 255));
        namaadm.setText("jLabel8");
        namaadm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbl_tgl.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        lbl_tgl.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tgl.setText("TANGGAL");

        lbl_jam.setBackground(new java.awt.Color(255, 255, 255));
        lbl_jam.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jam.setText("JAM");

        javax.swing.GroupLayout panel_sideLayout = new javax.swing.GroupLayout(panel_side);
        panel_side.setLayout(panel_sideLayout);
        panel_sideLayout.setHorizontalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sideLayout.createSequentialGroup()
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_sideLayout.createSequentialGroup()
                        .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_sideLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_sideLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_sideLayout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_sideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_sideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_sideLayout.createSequentialGroup()
                                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbadm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaadm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panel_sideLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sideLayout.createSequentialGroup()
                                        .addComponent(lbl_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_jam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        panel_sideLayout.setVerticalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_jam, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lbl_tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbadm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaadm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnel_top.setBackground(new java.awt.Color(0, 153, 0));
        pnel_top.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnel_top.setLayout(new java.awt.BorderLayout());

        lbversi.setFont(new java.awt.Font("Lucida G", 3, 12)); // NOI18N
        lbversi.setForeground(new java.awt.Color(255, 255, 255));
        lbversi.setText(" Dashboard V .1 .0");
        pnel_top.add(lbversi, java.awt.BorderLayout.CENTER);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("SISTEM INFORMASI PENJUALAN");
        pnel_top.add(jLabel36, java.awt.BorderLayout.PAGE_START);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("HTB - FOOD ");
        pnel_top.add(jLabel37, java.awt.BorderLayout.PAGE_END);

        pgerak.setBackground(new java.awt.Color(0, 0, 0));
        pgerak.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pgerak.setLayout(new java.awt.BorderLayout());

        textgerak.setBackground(new java.awt.Color(0, 0, 0));
        textgerak.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textgerak.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hh.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        hh.setForeground(new java.awt.Color(255, 255, 255));
        hh.setText("Selamat Datang ..! ");
        textgerak.add(hh, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 0, 140, -1));

        textgerak1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        textgerak1.setForeground(new java.awt.Color(255, 255, 255));
        textgerak1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textgerak1.setText("Di Aplikasi Penjualan  ..!");
        textgerak.add(textgerak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, -1));

        textgerak2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textgerak2.setForeground(new java.awt.Color(255, 255, 255));
        textgerak2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textgerak2.setText(">>>>>>>>> HTB FROZEN FOOD <<<<<<<<<");
        textgerak.add(textgerak2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 20));

        lblnamaadm3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblnamaadm3.setForeground(new java.awt.Color(255, 255, 255));
        lblnamaadm3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnamaadm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customers.png"))); // NOI18N
        lblnamaadm3.setText(" -");
        textgerak.add(lblnamaadm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 20));

        pgerak.add(textgerak, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgerak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnel_top, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pgerak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jDesktopPane1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/communication.png"))); // NOI18N
        jMenu1.setText("File Master");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-customer-25.png"))); // NOI18N
        jMenuItem1.setText("Master Customer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-supplier-25.png"))); // NOI18N
        jMenuItem3.setText("Master Supplier");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-packing-25.png"))); // NOI18N
        jMenuItem4.setText("Master Barang");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-administrator-male-skin-type-7-25.png"))); // NOI18N
        jMenu2.setText("Petugas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-administrator-male-skin-type-7-25.png"))); // NOI18N
        jMenuItem6.setText("Data Petugas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-report-file-25.png"))); // NOI18N
        jMenu3.setText("Laporan");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-report-file-25.png"))); // NOI18N
        jMenuItem5.setText("Cetak Data Laporan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setForeground(Color.white);
        jPanel10.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
       jLabel10.setForeground(Color.black);
        jPanel10.setBackground(new Color(255,255,255));
        
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
      initListener();
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        // TODO add your handling code here:
         jLabel14.setForeground(Color.white);
        jPanel14.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        // TODO add your handling code here:
       jLabel14.setForeground(Color.black);
        jPanel14.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setForeground(Color.white);
        jPanel13.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        // TODO add your handling code here:
        jLabel13.setForeground(Color.black);
        jPanel13.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:
        jLabel12.setForeground(Color.white);
        jPanel12.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        // TODO add your handling code here:
        jLabel12.setForeground(Color.black);
        jPanel12.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setForeground(Color.white);
        jPanel11.setBackground(new Color(255,102,0));

    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
      jLabel11.setForeground(Color.black);
        jPanel11.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jPanel15.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
      jPanel15.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        ImageIcon AS =  new ImageIcon(getClass().getResource("/icon/icons8-scroll-up-25.png"));
        jLabel15.setIcon(AS);
        jLabel15.setVisible(true);
        jLabel15.setEnabled(true);
        jLabel16.setVisible(false);
         jLabel16.setEnabled(false);
         jPanel9.setVisible(true);
          jPanel9.setEnabled(true);
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
         jLabel16.setVisible(true);
        jLabel16.setEnabled(true);
        jLabel15.setVisible(false);
        jLabel15.setEnabled(false);
       
        jPanel9.setVisible(false);
        jPanel9.setEnabled(false);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jLabel16MouseClicked

    private void bdaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdaftarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bdaftarMouseClicked

    private void bdaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdaftarMouseEntered
        // TODO add your handling code here:
          lbdaftar.setForeground(Color.white);
        bdaftar.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_bdaftarMouseEntered

    private void bdaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdaftarMouseExited
        // TODO add your handling code here:
        lbdaftar.setForeground(Color.black);
        bdaftar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bdaftarMouseExited

    private void bbyrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbyrMouseEntered
        // TODO add your handling code here:
        lbbyr.setForeground(Color.white);
        bbyr.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_bbyrMouseEntered

    private void bbyrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbyrMouseExited
        // TODO add your handling code here:
         lbbyr.setForeground(Color.black);
        bbyr.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bbyrMouseExited

    private void jPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jPanel22MouseEntered

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel22MousePressed

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel21MousePressed

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
        getBackgroundColor();
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        // TODO add your handling code here:
         jLabel17.setForeground(Color.white);
        jPanel16.setBackground(new Color(255,102,0));

    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        // TODO add your handling code here:
        jLabel17.setForeground(Color.black);
        jPanel16.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        // TODO add your handling code here:
        getBackgroundColorSide();
    }//GEN-LAST:event_jPanel16MousePressed

    private void bdaftarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdaftarMousePressed
         // TODO add your handling code here:
         
    
         ViewPengiriman f = new ViewPengiriman();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
        
    }//GEN-LAST:event_bdaftarMousePressed

    private void bbyrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbyrMousePressed
         // TODO add your handling code here:
         ViewRiwayat f = new ViewRiwayat();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_bbyrMousePressed

    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        // TODO add your handling code here:
            BackupData f= new BackupData();
            f.setVisible(true);
       
    }//GEN-LAST:event_jPanel14MousePressed

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MousePressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
         jLabel38.setForeground(Color.white);
        jPanel2.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jLabel38.setForeground(Color.black);
        jPanel2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        getBackgroundTextColor();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        // TODO add your handling code here:
             ViewAbout a = new ViewAbout();
             jDesktopPane1.removeAll();
             jDesktopPane1.repaint();
             jDesktopPane1.revalidate();
             jDesktopPane1.add(a);
             jDesktopPane1.repaint();
             jDesktopPane1.revalidate();
             
             a.setVisible(true);
    }//GEN-LAST:event_jPanel12MousePressed

    private void jPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MousePressed
        // TODO add your handling code here:
        LoginAplikasi lo = new LoginAplikasi();
        this.dispose();
        lo.setVisible(true);
  
    }//GEN-LAST:event_jPanel13MousePressed

    private void bkelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkelasMouseClicked
        // TODO add your handling code here:
//          FormseleksiSiswa f = new FormseleksiSiswa();
//         jDesktopPane1.removeAll();
//         jDesktopPane1.repaint();
//         jDesktopPane1.revalidate();
//         jDesktopPane1.add(f);
//         jDesktopPane1.repaint();
//         jDesktopPane1.revalidate();
//         f.setVisible(true);
    }//GEN-LAST:event_bkelasMouseClicked

    private void bkelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkelasMouseEntered
        // TODO add your handling code here:
         lbkls.setForeground(Color.white);
        bkelas.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_bkelasMouseEntered

    private void bkelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkelasMouseExited
        // TODO add your handling code here:
        lbkls.setForeground(Color.black);
        bkelas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_bkelasMouseExited

    private void bkelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkelasMousePressed
         // TODO add your handling code here:
         ViewPenjualan f = new ViewPenjualan();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_bkelasMousePressed

    private void lbklsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbklsMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lbklsMouseEntered

    private void lbklsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbklsMouseExited
        // TODO add your handling code here:
    
    }//GEN-LAST:event_lbklsMouseExited

    private void lbklsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbklsMousePressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_lbklsMousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       
   
        ViewSupplier f = new ViewSupplier();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ViewCustomer f = new ViewCustomer();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        
        ViewBarang f = new ViewBarang();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ViewLaporan f = new ViewLaporan();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
       
      
         ViewPetugas f = new ViewPetugas();
         jDesktopPane1.removeAll();
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         jDesktopPane1.add(f);
         jDesktopPane1.repaint();
         jDesktopPane1.revalidate();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     try {
           UIManager.setLookAndFeel(new McWinLookAndFeel());
                 //"com.jtattoo.plaf.hifi.HiFiLookAndFeel " com.jtattoo.plaf.mcwin.McWinLookAndFeel
      
      } catch (Exception ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bbyr;
    private javax.swing.JPanel bdaftar;
    private javax.swing.JPanel bkelas;
    private javax.swing.JLabel hh;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbadm;
    private javax.swing.JLabel lbbyr;
    private javax.swing.JLabel lbdaftar;
    private javax.swing.JLabel lbkls;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tgl;
    private javax.swing.JLabel lblnamaadm3;
    private javax.swing.JLabel lbversi;
    private javax.swing.JLabel namaadm;
    private javax.swing.JPanel panel_master;
    private javax.swing.JPanel panel_side;
    private javax.swing.JPanel pgerak;
    private javax.swing.JPanel pnel_top;
    private javax.swing.JPanel pnldata;
    private javax.swing.JPanel textgerak;
    private javax.swing.JLabel textgerak1;
    private javax.swing.JLabel textgerak2;
    // End of variables declaration//GEN-END:variables


}
