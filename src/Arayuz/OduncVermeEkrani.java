package Arayuz;

import Girisler.Uyeler;
import Girisler.Kitaplar;
import DatabaseBaglanti.OduncKitapIslemleri;
import DatabaseBaglanti.UyeIslemleri;
import DatabaseBaglanti.KitapIslemleri;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class OduncVermeEkrani extends javax.swing.JFrame {
    
    DefaultTableModel modelKitap;
    DefaultTableModel modelUye;
    KitapIslemleri islemKitap = new KitapIslemleri();
    UyeIslemleri islemUye = new UyeIslemleri();
    OduncKitapIslemleri islemOduncKitap;
    
    public OduncVermeEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        modelKitap = (DefaultTableModel) kitaplar_tablosu.getModel();
        modelUye = (DefaultTableModel) uyeler_tablosu.getModel();
        kitapGoruntule(); 
        uyeGoruntule();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kitap_no_alani = new javax.swing.JTextField();
        kitap_ad_alani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yazar_alani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uye_no_alani = new javax.swing.JTextField();
        uye_ad_alani = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uye_soyad_alani = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        odunc_ver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        verilis_tarihi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        teslim_tarihi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kitap_adi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        uye_adi = new javax.swing.JTextField();
        ara = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uyeler_tablosu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 20, 50, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/job-search (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/books (2).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Kitap No :");

        jLabel4.setText("Adı :");

        jLabel5.setText("Yazarı :");

        jLabel6.setText("Üye No :");

        jLabel7.setText("Üye Adı :");

        jLabel8.setText("Üye Soyadı :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitap_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitap_ad_alani))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yazar_alani))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uye_no_alani)
                            .addComponent(uye_ad_alani)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uye_soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kitap_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kitap_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(yazar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(uye_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(uye_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(uye_soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        odunc_ver.setBackground(new java.awt.Color(255, 153, 0));
        odunc_ver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        odunc_ver.setText("Ödünç Ver");
        odunc_ver.setBorderPainted(false);
        odunc_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odunc_verActionPerformed(evt);
            }
        });

        jLabel9.setText("Veriliş Tarihi :");

        verilis_tarihi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verilis_tarihiMouseClicked(evt);
            }
        });

        jLabel10.setText("Teslim Tarihi :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verilis_tarihi)
                            .addComponent(teslim_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(odunc_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(verilis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(teslim_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(odunc_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel11.setText("Kitap Adı :");

        jLabel12.setText("Üye Adı :");

        ara.setBackground(new java.awt.Color(255, 153, 0));
        ara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ara.setText("Ara");
        ara.setBorderPainted(false);
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });

        uyeler_tablosu.setBackground(new java.awt.Color(249, 220, 166));
        uyeler_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Üye No", "Üye Ad", "Üye Soyad"
            }
        ));
        uyeler_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeler_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uyeler_tablosu);

        kitaplar_tablosu.setBackground(new java.awt.Color(249, 220, 166));
        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kitap No", "Kitap Ad", "Yazar"
            }
        ));
        kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(kitaplar_tablosu);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 153, 0));
        mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(uye_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void verilis_tarihiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verilis_tarihiMouseClicked
        LocalDate now = LocalDate.now();
        verilis_tarihi.setText(now.toString());
        teslim_tarihi.setText(now.plusDays(1).toString());
    }//GEN-LAST:event_verilis_tarihiMouseClicked

    private void odunc_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odunc_verActionPerformed
        mesaj_yazisi.setText("");
        int kitapNo = Integer.valueOf(kitap_no_alani.getText());
        int uyeNo = Integer.valueOf(uye_no_alani.getText());
        islemOduncKitap = new OduncKitapIslemleri();
        int kacKitap = islemOduncKitap.kacKitapAlmis(uyeNo);        
        if(islemOduncKitap.araOKitap(kitapNo)){
            mesaj_yazisi.setText("Bu Kitap Şu An Başka Bir Üyede. Ödünç Verilemez!");
        }
        else if(kacKitap == 5){
            mesaj_yazisi.setText("Bu Üye Toplam 5 Kitap Almış. Daha fazla kitap alamaz.");
        }
        else{
            String kitapAd = kitap_ad_alani.getText();
            String yazar = yazar_alani.getText();
            String uyeAd = uye_ad_alani.getText();
            String uyeSoyad = uye_soyad_alani.getText();
            String verilisTarihi = verilis_tarihi.getText();
            String teslimTarihi = teslim_tarihi.getText();
            islemOduncKitap = new OduncKitapIslemleri(kitapNo, kitapAd, yazar, uyeNo, uyeAd, uyeSoyad, verilisTarihi, teslimTarihi);
            islemOduncKitap.ekle();
            mesaj_yazisi.setText("Kitap Ödünç Verildi.");  
        }
        
        kitap_adi.setText("");
        uye_adi.setText("");
        kitap_ad_alani.setText("");
        kitap_no_alani.setText("");
        yazar_alani.setText("");
        uye_no_alani.setText("");
        uye_ad_alani.setText("");
        uye_soyad_alani.setText("");
        verilis_tarihi.setText("");
        teslim_tarihi.setText("");
        kitapGoruntule();
        uyeGoruntule();
    }//GEN-LAST:event_odunc_verActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        mesaj_yazisi.setText("");
        
        String kitapAdi = kitap_adi.getText();
        String uyeAdi = uye_adi.getText();
        
        modelKitap.setRowCount(0);
        modelUye.setRowCount(0);
        
        ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
        ArrayList<Uyeler> uyeler = new ArrayList<Uyeler>();
        kitaplar = islemKitap.araKitap(kitapAdi);
        uyeler = islemUye.araUye(uyeAdi);
        
        if(kitaplar != null){
            for(Kitaplar kitap : kitaplar){
                Object[] eklenecek = {kitap.getKitapNumarasi(),kitap.getAdı(),kitap.getYazar()};
                modelKitap.addRow(eklenecek);
            }
        }
        if(uyeler != null){
            for(Uyeler uye : uyeler){
                Object[] eklenecek = {uye.getUyeNo(),uye.getAd(),uye.getSoyad()};
                modelUye.addRow(eklenecek);
            }
        }
    }//GEN-LAST:event_araActionPerformed

    private void kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosuMouseClicked
        int selectedRow = kitaplar_tablosu.getSelectedRow();
        mesaj_yazisi.setText("");
        kitap_no_alani.setText(modelKitap.getValueAt(selectedRow, 0).toString());
        kitap_ad_alani.setText(modelKitap.getValueAt(selectedRow, 1).toString());
        yazar_alani.setText(modelKitap.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_kitaplar_tablosuMouseClicked

    private void uyeler_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeler_tablosuMouseClicked
            int selectedRow = uyeler_tablosu.getSelectedRow();
            uye_no_alani.setText(modelUye.getValueAt(selectedRow, 0).toString());
            uye_ad_alani.setText(modelUye.getValueAt(selectedRow, 1).toString());
            uye_soyad_alani.setText(modelUye.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_uyeler_tablosuMouseClicked
   
    public void kitapGoruntule(){
        modelKitap.setRowCount(0); 
        
        ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
        kitaplar = islemKitap.kitaplariGetir();
        
        if(kitaplar != null){
            for(Kitaplar kitap : kitaplar){
                Object[] eklenecek = {kitap.getKitapNumarasi(),kitap.getAdı(),kitap.getYazar()};
                modelKitap.addRow(eklenecek);
            }
        }
    }
    
    public void uyeGoruntule(){
        modelUye.setRowCount(0); 
        
        ArrayList<Uyeler> uyeler = new ArrayList<Uyeler>();
        
        uyeler = islemUye.uyeleriGetir();
        
        if(uyeler != null){
            for(Uyeler uye : uyeler){
                Object[] eklenecek = {uye.getUyeNo(),uye.getAd(),uye.getSoyad()};
                modelUye.addRow(eklenecek);
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
            java.util.logging.Logger.getLogger(OduncVermeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OduncVermeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OduncVermeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OduncVermeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OduncVermeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kitap_ad_alani;
    private javax.swing.JTextField kitap_adi;
    private javax.swing.JTextField kitap_no_alani;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton odunc_ver;
    private javax.swing.JTextField teslim_tarihi;
    private javax.swing.JTextField uye_ad_alani;
    private javax.swing.JTextField uye_adi;
    private javax.swing.JTextField uye_no_alani;
    private javax.swing.JTextField uye_soyad_alani;
    private javax.swing.JTable uyeler_tablosu;
    private javax.swing.JTextField verilis_tarihi;
    private javax.swing.JTextField yazar_alani;
    // End of variables declaration//GEN-END:variables
}
