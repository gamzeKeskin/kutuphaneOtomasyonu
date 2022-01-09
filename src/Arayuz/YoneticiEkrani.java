package Arayuz;

import DatabaseBaglanti.YoneticiIslemleri;
import Girisler.Yonetici;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class YoneticiEkrani extends javax.swing.JFrame {
    
    DefaultTableModel model;
    YoneticiIslemleri islemler = new YoneticiIslemleri();

    public YoneticiEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) tablo.getModel();
        yoneticiGoruntule(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        yonetici_adi_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sifre_alani = new javax.swing.JTextField();
        ekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 300, 350, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablo.setBackground(new java.awt.Color(204, 255, 255));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Yönetici Adı", "Şifre"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jLabel1.setText("Yönetici Adı :");

        jLabel2.setText("Şifre :");

        ekle.setBackground(new java.awt.Color(0, 51, 255));
        ekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ekle.setText("Yönetici Ekle");
        ekle.setBorderPainted(false);
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        guncelle.setBackground(new java.awt.Color(0, 0, 255));
        guncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guncelle.setText("Yönetici Güncelle");
        guncelle.setBorderPainted(false);
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setBackground(new java.awt.Color(0, 0, 255));
        sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sil.setText("Yönetici Sil");
        sil.setBorderPainted(false);
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 153, 0));
        mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yonetici_adi_alani)
                                    .addComponent(sifre_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guncelle)
                            .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yonetici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(sifre_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int selectedRow = tablo.getSelectedRow();
        yonetici_adi_alani.setText(model.getValueAt(selectedRow, 1).toString());
        sifre_alani.setText(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_tabloMouseClicked

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        mesaj_yazisi.setText("");
        String ad = yonetici_adi_alani.getText();
        String sifre = sifre_alani.getText(); 
        islemler = new YoneticiIslemleri(0, ad, sifre);
        islemler.ekle();
        mesaj_yazisi.setText("Yeni Yönetici Başarıyla Eklendi.");
        yonetici_adi_alani.setText("");
        sifre_alani.setText("");
        yoneticiGoruntule();
    }//GEN-LAST:event_ekleActionPerformed

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        mesaj_yazisi.setText("");
      
        int selectedRow = tablo.getSelectedRow();
        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Yöneticiler Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Güncellenecek Bir Yönetici Seçin.");
            }
        }
        else{
            int id = (int) model.getValueAt(selectedRow, 0);
            String ad = yonetici_adi_alani.getText();
            String sifre = sifre_alani.getText();
            islemler = new YoneticiIslemleri(id, ad, sifre);
            islemler.guncelle();
            mesaj_yazisi.setText("Yönetici Başarıyla Güncellendi.");    
        }
        
        yonetici_adi_alani.setText("");
        sifre_alani.setText("");
        yoneticiGoruntule();
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        mesaj_yazisi.setText("");

        int selectedRow = tablo.getSelectedRow();
        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Yöneticiler Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Silinecek Bir Yönetici Seçin.");
            }
        }
        else{
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.sil(id);
        }   
        mesaj_yazisi.setText("Yönetici Başarıyla Silindi.");
        yonetici_adi_alani.setText("");
        sifre_alani.setText("");
        yoneticiGoruntule();
    }//GEN-LAST:event_silActionPerformed

    public void yoneticiGoruntule(){
        mesaj_yazisi.setText("");
        model.setRowCount(0); 
        
        ArrayList<Yonetici> yoneticiler = new ArrayList<Yonetici>();
        yoneticiler = islemler.yoneticiGetir();
        
        if(yoneticiler != null){
            for(Yonetici yonetici : yoneticiler){
                Object[] eklenecek = {yonetici.getId(),yonetici.getAd(),yonetici.getSifre()};
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
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yonetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekle;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sifre_alani;
    private javax.swing.JButton sil;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField yonetici_adi_alani;
    // End of variables declaration//GEN-END:variables
}
