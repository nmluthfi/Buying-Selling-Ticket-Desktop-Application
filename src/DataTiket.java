
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wisnu
 */
public class DataTiket extends javax.swing.JFrame {
    String s;
    /**
     * Creates new form admin
     */
    public DataTiket() {
        initComponents();
        load_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        artisTF = new javax.swing.JTextField();
        temaTF = new javax.swing.JTextField();
        lokasiTF = new javax.swing.JTextField();
        tglTF = new javax.swing.JTextField();
        pukulTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTicketTbl = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        hargaTF = new javax.swing.JTextField();
        kuotaTF = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        posterL = new javax.swing.JLabel();
        unggahPosterBtn = new javax.swing.JButton();
        tambahBtn = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        eksporExcelBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descTA = new javax.swing.JTextArea();
        resfreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pembelian");
        setPreferredSize(new java.awt.Dimension(1095, 950));

        jPanel2.setBackground(new java.awt.Color(20, 34, 73));
        jPanel2.setToolTipText("Data Tiket");
        jPanel2.setPreferredSize(new java.awt.Dimension(1090, 950));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Data Konser");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Artis");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tema");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lokasi");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tanggal");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pukul");

        dataTicketTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Event", "Artis", "Tema", "Deskripsi", "Lokasi", "Tanggal", "Pukul", "Kuota", "Harga", "Poster"
            }
        ));
        dataTicketTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTicketTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTicketTbl);
        if (dataTicketTbl.getColumnModel().getColumnCount() > 0) {
            dataTicketTbl.getColumnModel().getColumn(9).setMinWidth(0);
            dataTicketTbl.getColumnModel().getColumn(9).setPreferredWidth(0);
            dataTicketTbl.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Harga");

        hargaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargaTFKeyTyped(evt);
            }
        });

        kuotaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kuotaTFKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Kuota");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Poster");

        posterL.setForeground(new java.awt.Color(240, 240, 240));

        unggahPosterBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unggahPosterBtn.setText("Unggah Poster");
        unggahPosterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unggahPosterBtnActionPerformed(evt);
            }
        });

        tambahBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Perbaharui");
        Update.setToolTipText("");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        hapusBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        eksporExcelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eksporExcelBtn.setText("Ekspor Excel");
        eksporExcelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksporExcelBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Deskripsi");

        descTA.setColumns(20);
        descTA.setRows(5);
        jScrollPane2.setViewportView(descTA);

        resfreshBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resfreshBtn.setText("Segarkan Tabel");
        resfreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resfreshBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel28)
                            .addComponent(jLabel13)
                            .addComponent(jLabel27)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(artisTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(temaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lokasiTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tglTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pukulTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kuotaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hargaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(unggahPosterBtn)
                                            .addComponent(posterL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tambahBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(Update)
                                        .addGap(18, 18, 18)
                                        .addComponent(hapusBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(resetBtn))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(resfreshBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(eksporExcelBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(backBtn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(artisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lokasiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tglTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pukulTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kuotaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posterL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahBtn)
                            .addComponent(Update)
                            .addComponent(hapusBtn)
                            .addComponent(resetBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resfreshBtn)
                            .addComponent(eksporExcelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(unggahPosterBtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
        try {
            if(artisTF.getText().equals("") || temaTF.getText().equals("") || descTA.getText().equals("") || tglTF.getText().equals("") || 
                pukulTF.getText().equals("") ||  kuotaTF.getText().equals("") ||  hargaTF.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Form Harus diising dengan lengkap");
            } else {
                InputStream is = new FileInputStream(new File(s));    
                String sql = "INSERT INTO tiket (artis, tema, deskripsi, poster, lokasi, tanggal, pukul, kuota, harga)"
                        + "VALUES (?, ?, ?, ?, ?,"
                        + "?, ?, ?, ?)";
                java.sql.Connection conn = ((Connection) Config.configDB());
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, artisTF.getText());
                pst.setString(2, temaTF.getText());
                pst.setString(3, descTA.getText());
                pst.setString(5, lokasiTF.getText());
                pst.setString(6, tglTF.getText());
                pst.setString(7, pukulTF.getText());
                pst.setString(8, kuotaTF.getText());
                pst.setString(9, hargaTF.getText());
                pst.setBinaryStream(4, is);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Tiket");
                load_table();
                reset_table();
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void unggahPosterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unggahPosterBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            posterL.setIcon(ResizeImage(path));
            s = path;
        } else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
       }    
    }//GEN-LAST:event_unggahPosterBtnActionPerformed

    private void dataTicketTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTicketTblMouseClicked
        // TODO add your handling code here:
        int selectedRow = dataTicketTbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) dataTicketTbl.getModel();
        artisTF.setText(model.getValueAt(selectedRow, 1).toString());
        temaTF.setText(model.getValueAt(selectedRow, 2).toString());
        descTA.setLineWrap(true);
        descTA.setText(model.getValueAt(selectedRow, 3).toString());
        lokasiTF.setText(model.getValueAt(selectedRow, 4).toString());
        tglTF.setText(model.getValueAt(selectedRow, 5).toString());
        pukulTF.setText(model.getValueAt(selectedRow, 6).toString());
        kuotaTF.setText(model.getValueAt(selectedRow, 7).toString());
        hargaTF.setText(model.getValueAt(selectedRow, 8).toString());
        ImageIcon image1 = (ImageIcon)dataTicketTbl.getValueAt(selectedRow, 9);
        Image image2 = image1.getImage().getScaledInstance(posterL.getWidth(), posterL.getHeight()
            , Image.SCALE_SMOOTH);
        ImageIcon image3 = new ImageIcon(image2);
        posterL.setIcon(image3);
//        try {
//            String sql = "SELECT * FROM tiket WHERE idTiket = '"+selectedRow+"'";
//            java.sql.Connection conn = ((Connection) Config.configDB());
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            if (res.next()) {
//                byte [] img = res.getBytes("poster");  
//                ImageIcon image = new ImageIcon(img);
//                Image im = image.getImage();
//                Image myImg = im.getScaledInstance(300, 300,Image.SCALE_SMOOTH);
//                ImageIcon icon = new ImageIcon(myImg);
//                posterL.setIcon(icon);      
//            }
//        } catch(Exception e) {
//            
//        }
    }//GEN-LAST:event_dataTicketTblMouseClicked

    private void resfreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resfreshBtnActionPerformed
        // TODO add your handling code here:
        load_table();
    }//GEN-LAST:event_resfreshBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
       reset_table();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        try {            
            if(artisTF.getText().equals("") || temaTF.getText().equals("") || descTA.getText().equals("") || tglTF.getText().equals("") || 
                pukulTF.getText().equals("") ||  kuotaTF.getText().equals("") ||  hargaTF.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Form Harus diising dengan lengkap");
            } else {
                int selectedRow = dataTicketTbl.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) dataTicketTbl.getModel();
                String idTiket = model.getValueAt(selectedRow, 0).toString();
                InputStream is = new FileInputStream(new File(s));
                String konfirm = "UPDATE tiket SET artis = ?, tema = ?, deskripsi = ?, poster = ?, lokasi = ?, tanggal = ?, pukul = ?, kuota = ?, harga = ? "
                    + "WHERE idTiket = '"+idTiket+"'";
                java.sql.Connection conn = ((Connection) Config.configDB());
                java.sql.PreparedStatement pst = conn.prepareStatement(konfirm);
                pst.setString(1, artisTF.getText());
                pst.setString(2, temaTF.getText());
                pst.setString(3, descTA.getText());
                pst.setString(5, lokasiTF.getText());
                pst.setString(6, tglTF.getText());
                pst.setString(7, pukulTF.getText());
                pst.setString(8, kuotaTF.getText());
                pst.setString(9, hargaTF.getText());
                pst.setBinaryStream(4, is);
                pst.executeUpdate();
                load_table();
                reset_table();
                JOptionPane.showMessageDialog(null, "Berhasil Memperbaharui Data");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        // TODO add your handling code here:
         try {
            int selectedRow = dataTicketTbl.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) dataTicketTbl.getModel();
            String idTiket = model.getValueAt(selectedRow, 0).toString();
            String sql ="DELETE FROM tiket WHERE idTiket ='"+idTiket+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
            load_table();
            reset_table();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data buku"
            + e.getMessage());
        }      
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void kuotaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kuotaTFKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_kuotaTFKeyTyped

    private void hargaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaTFKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_hargaTFKeyTyped

    private void eksporExcelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksporExcelBtnActionPerformed
        // TODO add your handling code here:
        FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                TableModel tModel = dataTicketTbl.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
            // write header
                for(int i = 0; i < tModel.getColumnCount(); i++){
                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
            // write record
                for(int i=0; i < tModel.getRowCount(); i++) {
                for(int j=0; j < tModel.getColumnCount(); j++) {
                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_eksporExcelBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuAdmin().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

//    public void mengambildatatablepo(){
//        try {  
//            java.sql.Connection conn=(Connection)Config.configDB();
//            
//        } catch(Exception e) {
//            
//        }
//    }
    
    public void reset_table() {
        artisTF.setText("");
        temaTF.setText("");
        descTA.setText("");
        lokasiTF.setText("");
        tglTF.setText("");
        pukulTF.setText("");
        kuotaTF.setText("");
        hargaTF.setText("");
        posterL.setIcon(null);
    }
    
    public void load_table() {
        try {
            DefaultTableModel model = (DefaultTableModel) dataTicketTbl.getModel();
            int baris = dataTicketTbl.getRowCount();
                for (int i = 0; i < baris; i++) {
                    model.removeRow(i);
            }
            String sql = "SELECT * FROM tiket";
            java.sql.Connection conn = ((Connection) Config.configDB());
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);            
            while (res.next()) {    
                byte [] img = res.getBytes("poster");  
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(300, 300,Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(myImg);
                model.addRow(new Object[] {res.getString("idTiket"), res.getString("artis"), res.getString("tema"), res.getString("deskripsi"), 
                res.getString("lokasi"), res.getString("tanggal"), res.getString("pukul"),  res.getString("kuota"), res.getString("harga"), icon});
            }
            dataTicketTbl.setModel(model);
        } catch(Exception e) {
            
        }
    }
    
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(posterL.getWidth(), posterL.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
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
            java.util.logging.Logger.getLogger(DataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JTextField artisTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable dataTicketTbl;
    private javax.swing.JTextArea descTA;
    private javax.swing.JButton eksporExcelBtn;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kuotaTF;
    private javax.swing.JTextField lokasiTF;
    private javax.swing.JLabel posterL;
    private javax.swing.JTextField pukulTF;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton resfreshBtn;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JTextField temaTF;
    private javax.swing.JTextField tglTF;
    private javax.swing.JButton unggahPosterBtn;
    // End of variables declaration//GEN-END:variables
}
