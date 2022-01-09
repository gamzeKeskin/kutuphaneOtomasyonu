package Arayuz;

import Girisler.Kitaplar;
import DatabaseBaglanti.KitapIslemleri;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class KitapEkrani extends javax.swing.JFrame {
    
    DefaultTableModel model;
    KitapIslemleri islemler;

    public KitapEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) kitaplar_tablosu.getModel();
        kitapGoruntule();        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        yazar_alani = new javax.swing.JTextField();
        tur_alani = new javax.swing.JTextField();
        sayfa_sayisi_alani = new javax.swing.JTextField();
        basım_tarihi_alani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kitap_ekle = new javax.swing.JButton();
        kitap_guncelle = new javax.swing.JButton();
        kitap_sil = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ara = new javax.swing.JButton();
        ad_alani = new javax.swing.JTextField();
        yayinevi_alani = new javax.swing.JTextField();
        kitap_adi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 10, 50, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/books (3).png"))); // NOI18N

        jLabel2.setText("Adı : ");

        jLabel3.setText("Yazarı :");

        jLabel4.setText("Türü :");

        jLabel5.setText("Yayınevi :");

        jLabel6.setText("Sayfa Sayısı :");

        jLabel7.setText("Basım Tarihi :");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kitap_ekle.setBackground(new java.awt.Color(255, 153, 0));
        kitap_ekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_ekle.setText("Kitap Ekle");
        kitap_ekle.setBorderPainted(false);
        kitap_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ekleActionPerformed(evt);
            }
        });

        kitap_guncelle.setBackground(new java.awt.Color(255, 153, 0));
        kitap_guncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_guncelle.setText("Kitap Güncelle");
        kitap_guncelle.setBorderPainted(false);
        kitap_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_guncelleActionPerformed(evt);
            }
        });

        kitap_sil.setBackground(new java.awt.Color(255, 153, 0));
        kitap_sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kitap_sil.setText("Kitap Sil");
        kitap_sil.setBorderPainted(false);
        kitap_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kitap_guncelle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(kitap_ekle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(kitap_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kitap_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kitap_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kitap_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        mesaj_yazisi.setBackground(new java.awt.Color(255, 255, 255));
        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 153, 0));
        mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setText("Kitap Adı :");

        ara.setBackground(new java.awt.Color(255, 153, 0));
        ara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ara.setText("Ara");
        ara.setBorderPainted(false);
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });

        kitaplar_tablosu.setBackground(new java.awt.Color(249, 220, 166));
        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kitap No", "Ad", "Yazar", "Tür", "Yayınevi", "Sayfa Sayısı", "Basım Tarihi"
            }
        ));
        kitaplar_tablosu.setToolTipText("");
        kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitaplar_tablosu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(yazar_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(tur_alani)
                                            .addComponent(sayfa_sayisi_alani)
                                            .addComponent(basım_tarihi_alani)
                                            .addComponent(ad_alani)
                                            .addComponent(yayinevi_alani))
                                        .addGap(89, 89, 89)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ara)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yazar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tur_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(yayinevi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sayfa_sayisi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(basım_tarihi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
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

    private void kitap_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ekleActionPerformed
        mesaj_yazisi.setText("");
        kitap_adi.setText("");
        
        String ad = ad_alani.getText();
        String yazar = yazar_alani.getText();
        String tur = tur_alani.getText();
        String yayinevi = yayinevi_alani.getText();
        int sayi = Integer.valueOf(sayfa_sayisi_alani.getText());
        String tarih = basım_tarihi_alani.getText();
        
        islemler = new KitapIslemleri(0, ad, yazar, tur, yayinevi, sayi, tarih);
        islemler.ekle();
        
        mesaj_yazisi.setText("Yeni Kitap Başarıyla Eklendi.");
        ad_alani.setText("");
        yazar_alani.setText("");
        tur_alani.setText("");
        yayinevi_alani.setText("");
        sayfa_sayisi_alani.setText("");
        basım_tarihi_alani.setText("");
 
        kitapGoruntule();
    }//GEN-LAST:event_kitap_ekleActionPerformed

    private void kitap_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_guncelleActionPerformed
        mesaj_yazisi.setText("");
        kitap_adi.setText("");
        
        int selectedRow = kitaplar_tablosu.getSelectedRow();

        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Kitaplar Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Güncellenecek Bir Kitap Seçin.");
            }
        }
        else{
            int id = (int) model.getValueAt(selectedRow, 0);
            String ad = ad_alani.getText();
            String yazar = yazar_alani.getText();
            String tur = tur_alani.getText();
            String yayinevi = yayinevi_alani.getText();
            int sayi = Integer.valueOf(sayfa_sayisi_alani.getText());
            String tarih = basım_tarihi_alani.getText();            
            islemler = new KitapIslemleri(id, ad, yazar, tur, yayinevi, sayi, tarih);
            islemler.guncelle();
            mesaj_yazisi.setText("Kitap Başarıyla Güncellendi.");    
        }
        
        ad_alani.setText("");
        yazar_alani.setText("");
        tur_alani.setText("");
        yayinevi_alani.setText("");
        sayfa_sayisi_alani.setText("");
        basım_tarihi_alani.setText("");
        kitapGoruntule();
    }//GEN-LAST:event_kitap_guncelleActionPerformed

    private void kitap_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_silActionPerformed
        mesaj_yazisi.setText("");
        kitap_adi.setText("");
        
        int selectedRow = kitaplar_tablosu.getSelectedRow();

        if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Kitaplar Tablosu Şu Anda Boş.");
            }
            else{
                mesaj_yazisi.setText("Lütfen Silinecek Bir Kitap Seçin.");
            }
        }
        else{
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler = new KitapIslemleri();
            islemler.sil(id);
            mesaj_yazisi.setText("Kitap Başarıyla Silindi.");
        }     
        ad_alani.setText("");
        yazar_alani.setText("");
        tur_alani.setText("");
        yayinevi_alani.setText("");
        sayfa_sayisi_alani.setText("");
        basım_tarihi_alani.setText("");
        kitapGoruntule();
    }//GEN-LAST:event_kitap_silActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        mesaj_yazisi.setText("");
        String adi = kitap_adi.getText();
        model.setRowCount(0);
        ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
        islemler = new KitapIslemleri();
        kitaplar = islemler.araKitap(adi);
        
        if(kitaplar != null){
            for(Kitaplar kitap : kitaplar){
                Object[] eklenecek = {kitap.getKitapNumarasi(),kitap.getAdı(),kitap.getYazar(),
                                      kitap.getTur(),kitap.getYayınevi(),kitap.getSayfaSayisi(),kitap.getBaskıTarihi()};
                model.addRow(eklenecek);
            }
        }
    }//GEN-LAST:event_araActionPerformed

    private void kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosuMouseClicked
        int selectedRow = kitaplar_tablosu.getSelectedRow();
        mesaj_yazisi.setText("");

        ad_alani.setText(model.getValueAt(selectedRow, 1).toString());
        yazar_alani.setText(model.getValueAt(selectedRow, 2).toString());
        tur_alani.setText(model.getValueAt(selectedRow, 3).toString());
        yayinevi_alani.setText(model.getValueAt(selectedRow, 4).toString());
        sayfa_sayisi_alani.setText(model.getValueAt(selectedRow, 5).toString());
        basım_tarihi_alani.setText(model.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_kitaplar_tablosuMouseClicked

    
    public void kitapGoruntule(){
        mesaj_yazisi.setText("");
        model.setRowCount(0); 
        
        ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
        islemler = new KitapIslemleri();
        kitaplar = islemler.kitaplariGetir();
        
        if(kitaplar != null){
            for(Kitaplar kitap : kitaplar){
                Object[] eklenecek = {kitap.getKitapNumarasi(),kitap.getAdı(),kitap.getYazar(),kitap.getTur(),kitap.getYayınevi(),kitap.getSayfaSayisi(),kitap.getBaskıTarihi()};
                model.addRow(eklenecek);
            }
        }
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JButton ara;
    private javax.swing.JTextField basım_tarihi_alani;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kitap_adi;
    private javax.swing.JButton kitap_ekle;
    private javax.swing.JButton kitap_guncelle;
    private javax.swing.JButton kitap_sil;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sayfa_sayisi_alani;
    private javax.swing.JTextField tur_alani;
    private javax.swing.JTextField yayinevi_alani;
    private javax.swing.JTextField yazar_alani;
    // End of variables declaration//GEN-END:variables
}
