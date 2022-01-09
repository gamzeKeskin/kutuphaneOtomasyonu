package Arayuz;

import DatabaseBaglanti.UyeIslemleri;
import Girisler.Uyeler;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BorcSilEkrani extends javax.swing.JFrame {
    
    DefaultTableModel model;
    UyeIslemleri islemler = new UyeIslemleri();

    public BorcSilEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) uyeler_tablosu.getModel();
        uyeGoruntule();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uyeler_tablosu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soyad_alani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tel_alani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mail_alani = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        borc_alani = new javax.swing.JTextField();
        borc_sil = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ara = new javax.swing.JButton();
        arama_cubugu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 50, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        uyeler_tablosu.setBackground(new java.awt.Color(204, 255, 255));
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
        ));
        uyeler_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeler_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uyeler_tablosu);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ad :");

        jLabel3.setText("Soyad :");

        jLabel4.setText("Telefon :");

        jLabel5.setText("Mail :");

        jLabel7.setText("Üye Borç :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ad_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(mail_alani)
                    .addComponent(borc_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(tel_alani)
                    .addComponent(soyad_alani))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tel_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mail_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(borc_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        borc_sil.setBackground(new java.awt.Color(102, 204, 255));
        borc_sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borc_sil.setText("Borç Sil");
        borc_sil.setBorderPainted(false);
        borc_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borc_silActionPerformed(evt);
            }
        });

        mesaj_yazisi.setBackground(new java.awt.Color(255, 255, 255));
        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 153, 0));

        jLabel1.setText("Üye Adı :");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/pay.png"))); // NOI18N

        ara.setBackground(new java.awt.Color(102, 204, 255));
        ara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ara.setText("Ara");
        ara.setBorderPainted(false);
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(borc_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(borc_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uyeler_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeler_tablosuMouseClicked
            int selectedRow = uyeler_tablosu.getSelectedRow();
            ad_alani.setText(model.getValueAt(selectedRow, 1).toString());
            soyad_alani.setText(model.getValueAt(selectedRow, 2).toString());
            tel_alani.setText(model.getValueAt(selectedRow, 3).toString());
            mail_alani.setText(model.getValueAt(selectedRow, 4).toString());
            borc_alani.setText(model.getValueAt(selectedRow, 7).toString());
    }//GEN-LAST:event_uyeler_tablosuMouseClicked
    
    private void borc_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borc_silActionPerformed
        mesaj_yazisi.setText("");
        int selectedRow = uyeler_tablosu.getSelectedRow();
        if((double) model.getValueAt(selectedRow, 7) == 0){
            mesaj_yazisi.setText("Üyenin Borcu Bulunmamaktadır!");
        }
        else{
            islemler.borcSil((int) model.getValueAt(selectedRow, 0));
            mesaj_yazisi.setText("Üyenin Borcu Silindi.");     
        }
        ad_alani.setText("");
        soyad_alani.setText("");
        tel_alani.setText("");
        mail_alani.setText("");
        borc_alani.setText(""); 
        uyeGoruntule();
    }//GEN-LAST:event_borc_silActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        mesaj_yazisi.setText("");
        String adi = arama_cubugu.getText();
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorcSilEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JButton ara;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTextField borc_alani;
    private javax.swing.JButton borc_sil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mail_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JTextField tel_alani;
    private javax.swing.JTable uyeler_tablosu;
    // End of variables declaration//GEN-END:variables
}
