package proyekpbd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sidhat
 */
public class DataBarang extends javax.swing.JFrame {
    private final Connection con;
    private final Statement stat;
    private ResultSet rs;
    private String sql;
    /**
     * Creates new form DataBarang
     */
    public DataBarang() throws SQLException {
        initComponents();
        Koneksi DB = new Koneksi ();
        DB.bukaKoneksi();
        con =DB.con;
        stat = DB.stm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnldashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlbarang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlkasir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlsupplier = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnllaporan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnllogout = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        txtnamabarang = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txthargaawal = new javax.swing.JTextField();
        txthargabarang = new javax.swing.JTextField();
        txtkodebarang = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spinnerbarang = new javax.swing.JSpinner();
        txttglkadaluarsa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(0, 153, 255));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(102, 204, 255));

        jLabel5.setBackground(new java.awt.Color(102, 204, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Menu");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sidepane.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Toko N3 Jaya");
        sidepane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 40));

        pnldashboard.setBackground(new java.awt.Color(0, 204, 255));
        pnldashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnldashboardMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DASHBOARD");

        javax.swing.GroupLayout pnldashboardLayout = new javax.swing.GroupLayout(pnldashboard);
        pnldashboard.setLayout(pnldashboardLayout);
        pnldashboardLayout.setHorizontalGroup(
            pnldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnldashboardLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnldashboardLayout.setVerticalGroup(
            pnldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnldashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 40));

        pnlbarang.setBackground(new java.awt.Color(0, 204, 255));
        pnlbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlbarangMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA BARANG");

        javax.swing.GroupLayout pnlbarangLayout = new javax.swing.GroupLayout(pnlbarang);
        pnlbarang.setLayout(pnlbarangLayout);
        pnlbarangLayout.setHorizontalGroup(
            pnlbarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbarangLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlbarangLayout.setVerticalGroup(
            pnlbarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnlbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 40));

        pnlkasir.setBackground(new java.awt.Color(0, 204, 255));
        pnlkasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlkasirMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATA KASIR");

        javax.swing.GroupLayout pnlkasirLayout = new javax.swing.GroupLayout(pnlkasir);
        pnlkasir.setLayout(pnlkasirLayout);
        pnlkasirLayout.setHorizontalGroup(
            pnlkasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlkasirLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlkasirLayout.setVerticalGroup(
            pnlkasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnlkasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 40));

        pnlsupplier.setBackground(new java.awt.Color(0, 204, 255));
        pnlsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlsupplierMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA SUPPLIER");

        javax.swing.GroupLayout pnlsupplierLayout = new javax.swing.GroupLayout(pnlsupplier);
        pnlsupplier.setLayout(pnlsupplierLayout);
        pnlsupplierLayout.setHorizontalGroup(
            pnlsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsupplierLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlsupplierLayout.setVerticalGroup(
            pnlsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnlsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 40));

        pnllaporan.setBackground(new java.awt.Color(0, 204, 255));
        pnllaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnllaporanMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LAPORAN");

        javax.swing.GroupLayout pnllaporanLayout = new javax.swing.GroupLayout(pnllaporan);
        pnllaporan.setLayout(pnllaporanLayout);
        pnllaporanLayout.setHorizontalGroup(
            pnllaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllaporanLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnllaporanLayout.setVerticalGroup(
            pnllaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnllaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 40));

        pnllogout.setBackground(new java.awt.Color(0, 204, 255));
        pnllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnllogoutMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOG OUT");

        javax.swing.GroupLayout pnllogoutLayout = new javax.swing.GroupLayout(pnllogout);
        pnllogout.setLayout(pnllogoutLayout);
        pnllogoutLayout.setHorizontalGroup(
            pnllogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllogoutLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnllogoutLayout.setVerticalGroup(
            pnllogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sidepane.add(pnllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, 40));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 680));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DATA BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 790, 110));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode barang", "Nama barang", "Harga awal", "Harga barang", "Jumlah barang", "Tanggal kadaluarsa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 750, 250));

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        bg.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 90, 30));

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        bg.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 90, 30));

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        bg.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 90, 30));
        bg.add(txtnamabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 230, 30));

        jLabel15.setText("Harga barang");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 110, 30));
        bg.add(txthargaawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 230, 30));
        bg.add(txthargabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 230, 30));
        bg.add(txtkodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 230, 30));

        jLabel16.setText("Jumlah barang");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, 30));

        jLabel17.setText("Harga awal");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 90, 30));

        jLabel18.setText("Nama barang");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, 30));

        jLabel19.setText("Kode barang");
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 90, 30));
        bg.add(spinnerbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 50, 30));
        bg.add(txttglkadaluarsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 230, 30));

        jLabel20.setText("Tanggal kadaluarsa");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnldashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnldashboardMouseClicked
        Dashboard xx = null;
        try {
            xx = new Dashboard();
        } catch (SQLException ex) {
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnldashboardMouseClicked

    private void pnlbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlbarangMouseClicked
        DataBarang xx = null;
        try {
            xx = new DataBarang();
        } catch (SQLException ex) {
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlbarangMouseClicked

    private void pnlkasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlkasirMouseClicked
        DataKasir xx = null;
        try {
            xx = new DataKasir();
        } catch (SQLException ex) {
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlkasirMouseClicked

    private void pnlsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlsupplierMouseClicked
        DataSupplier xx = null;
        try {
            xx = new DataSupplier();
        } catch (SQLException ex) {
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlsupplierMouseClicked

    private void pnllaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnllaporanMouseClicked
        Laporan xx;
        xx = new Laporan();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnllaporanMouseClicked

    private void pnllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnllogoutMouseClicked
        Logout xx;
        xx = new Logout();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnllogoutMouseClicked

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            sql = "INSERT INTO tb_barang (kode_barang,nama_barang,harga_barang,jumlah_barang,tgl_kadaluarsa)"
                    + "VALUES ('" + txtkodebarang.getText() + "','" + txtnamabarang.getText() + "','" + txthargaawal.getText() + "','" + txthargabarang.getText()+ "','" + txttglkadaluarsa.getText() + "');";
                int row = stat.executeUpdate(sql);
                if (row == 1) {
                    JOptionPane.showMessageDialog(null, "Data sudah ditambahkan ke database",
                            "infomasi", JOptionPane.INFORMATION_MESSAGE);
                    txtkodebarang.setText("");
                    txtnamabarang.setText("");
                    txthargaawal.setText("");
                    txthargabarang.setText("");
                    txttglkadaluarsa.setText("");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data tidak ditambahkan ke database ( Error - " + e.getMessage() + " )",
                        "Infomasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
        sql = "delete from tb_barang where kode_barang = '"+txtkodebarang.getText()+"' ";
        int row = stat.executeUpdate(sql);
                if (row == 1) {
                    JOptionPane.showMessageDialog(null, "Data sudah di hapus",
                            "infomasi", JOptionPane.INFORMATION_MESSAGE);
                    txtkodebarang.setText("");
                    txtnamabarang.setText("");
                    txthargaawal.setText("");
                    txthargabarang.setText("");
                    txttglkadaluarsa.setText("");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data tidak dihapus dari database",
                        "Infomasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
        sql = "UPDATE tb_barang SET Nama Barang ='"+txtnamabarang.getText()+"',Harga Barang = '"+txthargaawal.getText()
                    +"',Jumlah Barang='"+spinnerbarang.getModel()+"',Tanggal kadaluarsa = '"+txthargabarang.
                            getText()+ "WHERE kode_barang ='" + txtkodebarang.getText() + "';";
        int row = stat.executeUpdate(sql);
                if (row == 1) {
                    JOptionPane.showMessageDialog(null, "Data sudah di update",
                            "infomasi", JOptionPane.INFORMATION_MESSAGE);
                    txtkodebarang.setText("");
                    txtnamabarang.setText("");
                    txthargaawal.setText("");
                    spinnerbarang.getModel();
                    txthargabarang.setText("");
                    txttglkadaluarsa.setText("");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data tidak ditambahkan ke database",
                        "Infomasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btneditActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DataBarang().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnlbarang;
    private javax.swing.JPanel pnldashboard;
    private javax.swing.JPanel pnlkasir;
    private javax.swing.JPanel pnllaporan;
    private javax.swing.JPanel pnllogout;
    private javax.swing.JPanel pnlsupplier;
    private javax.swing.JPanel sidepane;
    private javax.swing.JSpinner spinnerbarang;
    private javax.swing.JTextField txthargaawal;
    private javax.swing.JTextField txthargabarang;
    private javax.swing.JTextField txtkodebarang;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txttglkadaluarsa;
    // End of variables declaration//GEN-END:variables
}
