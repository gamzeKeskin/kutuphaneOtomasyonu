package Arayuz;

public class IslemlerEkrani extends javax.swing.JFrame {
    
    public IslemlerEkrani() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kitap_egs = new javax.swing.JButton();
        kitap_listele = new javax.swing.JButton();
        odunc_kitap_listele = new javax.swing.JButton();
        kitap_ver = new javax.swing.JButton();
        kitap_al = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        uye_egs = new javax.swing.JButton();
        uye_listele = new javax.swing.JButton();
        uye_borc_sil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        yonetici_islemleri = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 50, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        kitap_egs.setBackground(new java.awt.Color(255, 255, 255));
        kitap_egs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_egs.setText("Kitap Ekle / Güncelle / Sil");
        kitap_egs.setBorderPainted(false);
        kitap_egs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_egsActionPerformed(evt);
            }
        });

        kitap_listele.setBackground(new java.awt.Color(255, 255, 255));
        kitap_listele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_listele.setText("Kitap Listele");
        kitap_listele.setBorderPainted(false);
        kitap_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_listeleActionPerformed(evt);
            }
        });

        odunc_kitap_listele.setBackground(new java.awt.Color(255, 255, 255));
        odunc_kitap_listele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        odunc_kitap_listele.setText("Ödünç Kitapları Listele");
        odunc_kitap_listele.setBorderPainted(false);
        odunc_kitap_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odunc_kitap_listeleActionPerformed(evt);
            }
        });

        kitap_ver.setBackground(new java.awt.Color(255, 255, 255));
        kitap_ver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_ver.setText("Ödünç Kitap Ver");
        kitap_ver.setBorderPainted(false);
        kitap_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_verActionPerformed(evt);
            }
        });

        kitap_al.setBackground(new java.awt.Color(255, 255, 255));
        kitap_al.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_al.setText("Kitap Teslim Al");
        kitap_al.setBorderPainted(false);
        kitap_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_alActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kitap_ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kitap_listele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kitap_egs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odunc_kitap_listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kitap_al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kitap_egs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kitap_listele, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(odunc_kitap_listele, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kitap_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kitap_al, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        uye_egs.setBackground(new java.awt.Color(255, 255, 255));
        uye_egs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_egs.setText("Üye Ekle / Güncelle / Sil");
        uye_egs.setBorderPainted(false);
        uye_egs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_egsActionPerformed(evt);
            }
        });

        uye_listele.setBackground(new java.awt.Color(255, 255, 255));
        uye_listele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_listele.setText("Üye Listele");
        uye_listele.setBorderPainted(false);
        uye_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_listeleActionPerformed(evt);
            }
        });

        uye_borc_sil.setBackground(new java.awt.Color(255, 255, 255));
        uye_borc_sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uye_borc_sil.setText("Üye Borç Sil");
        uye_borc_sil.setBorderPainted(false);
        uye_borc_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_borc_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uye_egs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uye_listele, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uye_borc_sil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(uye_egs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uye_listele, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uye_borc_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/kitap.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/uye.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KİTAP İŞLEMLERİ");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ÜYE İŞLEMLERİ");
        jLabel4.setOpaque(true);

        yonetici_islemleri.setBackground(new java.awt.Color(51, 204, 255));
        yonetici_islemleri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yonetici_islemleri.setForeground(new java.awt.Color(0, 0, 204));
        yonetici_islemleri.setText("Yönetici İşlemleri");
        yonetici_islemleri.setBorderPainted(false);
        yonetici_islemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_islemleriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(yonetici_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yonetici_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void kitap_egsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_egsActionPerformed
        KitapEkrani kitapEkrani = new KitapEkrani();
        kitapEkrani.setVisible(true);
    }//GEN-LAST:event_kitap_egsActionPerformed

    private void kitap_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_listeleActionPerformed
        KitapListele kitapListele = new KitapListele();
        kitapListele.setVisible(true);
    }//GEN-LAST:event_kitap_listeleActionPerformed

    private void odunc_kitap_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odunc_kitap_listeleActionPerformed
        OduncKitapEkrani oduncKitapEkrani = new OduncKitapEkrani();
        oduncKitapEkrani.setVisible(true);
    }//GEN-LAST:event_odunc_kitap_listeleActionPerformed

    private void kitap_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_verActionPerformed
        OduncVermeEkrani oduncVermeEkrani = new OduncVermeEkrani();
        oduncVermeEkrani.setVisible(true);
    }//GEN-LAST:event_kitap_verActionPerformed

    private void kitap_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_alActionPerformed
        TeslimAlEkrani teslimAlEkrani = new TeslimAlEkrani();
        teslimAlEkrani.setVisible(true);
    }//GEN-LAST:event_kitap_alActionPerformed

    private void uye_egsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_egsActionPerformed
        UyeEkrani uyeEkrani = new UyeEkrani();
        uyeEkrani.setVisible(true);
    }//GEN-LAST:event_uye_egsActionPerformed

    private void uye_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_listeleActionPerformed
        UyeListele uyeListele = new UyeListele();
        uyeListele.setVisible(true);
    }//GEN-LAST:event_uye_listeleActionPerformed

    private void uye_borc_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_borc_silActionPerformed
        BorcSilEkrani borcSilEkrani = new BorcSilEkrani();
        borcSilEkrani.setVisible(true);
    }//GEN-LAST:event_uye_borc_silActionPerformed

    private void yonetici_islemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_islemleriActionPerformed
        YoneticiEkrani yoneticiEkrani = new YoneticiEkrani();
        yoneticiEkrani.setVisible(true);
    }//GEN-LAST:event_yonetici_islemleriActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IslemlerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton kitap_al;
    private javax.swing.JButton kitap_egs;
    private javax.swing.JButton kitap_listele;
    private javax.swing.JButton kitap_ver;
    private javax.swing.JButton odunc_kitap_listele;
    private javax.swing.JButton uye_borc_sil;
    private javax.swing.JButton uye_egs;
    private javax.swing.JButton uye_listele;
    private javax.swing.JButton yonetici_islemleri;
    // End of variables declaration//GEN-END:variables
}
