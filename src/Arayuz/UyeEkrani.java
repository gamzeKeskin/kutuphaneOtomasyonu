package Arayuz;

import DatabaseBaglanti.UyeIslemleri;
import Girisler.Uyeler;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UyeEkrani extends javax.swing.JFrame {
    
    DefaultTableModel model;
    UyeIslemleri islemler = new UyeIslemleri();
    
    public UyeEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) uyeler_tablosu.getModel();
        uyeGoruntule();
        dogum_tarihi_alani.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uyeler_tablosu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        tel_alani = new javax.swing.JTextField();
        mail_alani = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        adres_alani = new javax.swing.JTextArea();
        dogum_tarihi_alani = new javax.swing.JTextField();
        uye_ekle = new javax.swing.JButton();
        uye_guncelle = new javax.swing.JButton();
        uye_sil = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        uye_adi = new javax.swing.JTextField();
        ara = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 50, 50, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        uyeler_tablosu.setBackground(new java.awt.Color(249, 220, 166));
        uyeler_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Üye No", "Ad", "Soyad", "Telefon", "Mail", "Adres", "Doğum Tarihi", "Üye Borç"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uyeler_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeler_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uyeler_tablosu);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/file.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Adı:");

        jLabel3.setText("Soyad :");

        jLabel4.setText("Telefon :");

        jLabel5.setText("Mail :");

        jLabel6.setText("Adres :");

        jLabel7.setText("Doğum Tarihi :");

        adres_alani.setColumns(20);
        adres_alani.setLineWrap(true);
        adres_alani.setRows(5);
        adres_alani.setToolTipText("");
        jScrollPane2.setViewportView(adres_alani);

        dogum_tarihi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogum_tarihi_alaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(mail_alani)
                            .addComponent(dogum_tarihi_alani)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tel_alani))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(soyad_alani))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tel_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(mail_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogum_tarihi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        uye_ekle.setBackground(new java.awt.Color(255, 153, 0));
        uye_ekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_ekle.setText("Üye Ekle");
        uye_ekle.setBorderPainted(false);
        uye_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_ekleActionPerformed(evt);
            }
        });

        uye_guncelle.setBackground(new java.awt.Color(255, 153, 0));
        uye_guncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_guncelle.setText("Üye Güncelle");
        uye_guncelle.setBorderPainted(false);
        uye_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_guncelleActionPerformed(evt);
            }
        });

        uye_sil.setBackground(new java.awt.Color(255, 153, 0));
        uye_sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_sil.setText("Üye Sil");
        uye_sil.setBorderPainted(false);
        uye_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_silActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Üye Adı :");

        ara.setBackground(new java.awt.Color(255, 153, 0));
        ara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ara.setText("Ara");
        ara.setBorderPainted(false);
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uye_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uye_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(uye_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(uye_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uye_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uye_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_ekleActionPerformed
        mesaj_yazisi.setText("");
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String telefon = tel_alani.getText();
        String mail = mail_alani.getText();
        String adres = adres_alani.getText();
        String dogumTarihi = dogum_tarihi_alani.getText();
        islemler = new UyeIslemleri(0, ad, soyad, telefon, mail, adres, dogumTarihi, 0);
        islemler.ekle();
        mesaj_yazisi.setText("Yeni Üye Başarıyla Eklendi.");
        ad_alani.setText("");
        soyad_alani.setText("");
        tel_alani.setText("");
        mail_alani.setText("");
        adres_alani.setText("");
        uye_adi.setText("");
        dogum_tarihi_alani.setText("");
        uyeGoruntule();
    }//GEN-LAST:event_uye_ekleActionPerformed

    private void uyeler_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeler_tablosuMouseClicked
            int selectedRow = uyeler_tablosu.getSelectedRow();
            ad_alani.setText(model.getValueAt(selectedRow, 1).toString());
            soyad_alani.setText(model.getValueAt(selectedRow, 2).toString());
            tel_alani.setText(model.getValueAt(selectedRow, 3).toString());
            mail_alani.setText(model.getValueAt(selectedRow, 4).toString());
            adres_alani.setText(model.getValueAt(selectedRow, 5).toString());
            dogum_tarihi_alani.setText(model.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_uyeler_tablosuMouseClicked

    private void uye_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_guncelleActionPerformed

        int selectedRow = uyeler_tablosu.getSelectedRow();

        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Üyeler Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Güncellenecek Bir Üye Seçin.");
            }
        }
        else{
            int uyeNo = (int) model.getValueAt(selectedRow, 0);
            String ad = ad_alani.getText();
            String soyad = soyad_alani.getText();
            String telefon = tel_alani.getText();
            String mail = mail_alani.getText();
            String adres = adres_alani.getText();
            String dogumTarihi = dogum_tarihi_alani.getText();
            islemler = new UyeIslemleri(uyeNo, ad, soyad, telefon, mail, adres, dogumTarihi, 0);
            islemler.guncelle();
            mesaj_yazisi.setText("Üye Başarıyla Güncellendi.");
        }
        ad_alani.setText("");
        soyad_alani.setText("");
        tel_alani.setText("");
        mail_alani.setText("");
        adres_alani.setText(""); 
        uye_adi.setText("");
        dogum_tarihi_alani.setText("");
        uyeGoruntule();
    }//GEN-LAST:event_uye_guncelleActionPerformed

    private void uye_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_silActionPerformed
        mesaj_yazisi.setText("");
        int selectedRow = uyeler_tablosu.getSelectedRow();

        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Üyeler Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Silinecek Bir Üye Seçin.");
            }
        }
        else if((double) model.getValueAt(selectedRow, 7) != 0){
            JOptionPane.showMessageDialog(this, "Seçili Üyenin Borcu Bulunmaktadır! Lütfen Borç Sil Ekranına Gidiniz.");
            setVisible(false);
        }
        else{
            int uyeNo = (int) model.getValueAt(selectedRow, 0);
            islemler.sil(uyeNo);
            mesaj_yazisi.setText("Üye Başarıyla Silindi."); 
        }
        ad_alani.setText("");
        soyad_alani.setText("");
        tel_alani.setText("");
        mail_alani.setText("");
        adres_alani.setText("");
        uye_adi.setText("");
        dogum_tarihi_alani.setText("");
        uyeGoruntule();
    }//GEN-LAST:event_uye_silActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        mesaj_yazisi.setText("");
        String adi = uye_adi.getText();
        model.setRowCount(0);
        ArrayList<Uyeler> uyeler = new ArrayList<Uyeler>();
        uyeler = islemler.araUye(adi);
        
        if(uyeler != null){
            for(Uyeler uye : uyeler){
                Object[] eklenecek = {uye.getUyeNo(),uye.getAd(),uye.getSoyad(),
                                      uye.getTelefon(),uye.getMail(),uye.getAdres(),
                                      uye.getDogumTarihi(),uye.getUyeBorc()};
                model.addRow(eklenecek);
            }
        }
    }//GEN-LAST:event_araActionPerformed

    private void dogum_tarihi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogum_tarihi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogum_tarihi_alaniActionPerformed
    public void uyeGoruntule(){
        model.setRowCount(0); 
        
        ArrayList<Uyeler> uyeler = new ArrayList<Uyeler>();
        uyeler = islemler.uyeleriGetir();
        
        if(uyeler != null){
            for(Uyeler uye : uyeler){
                Object[] eklenecek = {uye.getUyeNo(),uye.getAd(),uye.getSoyad(),
                                      uye.getTelefon(),uye.getMail(),uye.getAdres(),
                                      uye.getDogumTarihi(),uye.getUyeBorc()};
                model.addRow(eklenecek);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextArea adres_alani;
    private javax.swing.JButton ara;
    private javax.swing.JTextField dogum_tarihi_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mail_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JTextField tel_alani;
    private javax.swing.JTextField uye_adi;
    private javax.swing.JButton uye_ekle;
    private javax.swing.JButton uye_guncelle;
    private javax.swing.JButton uye_sil;
    private javax.swing.JTable uyeler_tablosu;
    // End of variables declaration//GEN-END:variables
}
