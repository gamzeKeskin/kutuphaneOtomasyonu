
package DatabaseBaglanti;

import Girisler.Kitaplar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KitapIslemleri extends AbstractDatabase implements Isil{
    
    private int id;
    private String ad;
    private String yazar;
    private String tur;
    private String yayinevi;
    private int sayi;
    private String tarih;
    private DatabaseBaglanti closeConnection;
    public KitapIslemleri() {}
    
    public KitapIslemleri(int id, String ad, String yazar, String tur, String yayinevi, int sayi, String tarih) {
        super();
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.tur = tur;
        this.yayinevi = yayinevi;
        this.sayi = sayi;
        this.tarih = tarih;
    }
    
    @Override
    void abstractMetodYaz() {
        System.out.println("Abstract Metod");
    }
    
    @Override
  
       public void ekle() {
        String sorgu = "INSERT INTO KITAPLAR (AD, YAZAR, TUR, YAYINEVI, SAYFASAYISI, BASIMTARIHI) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            // preparedStatement = connection.prepareStatement( " INSERT INTO KITAPLAR (KITAPNO, AD, YAZAR, TUR, YAYINEVI, SAYFASAYISI, BASIMTARIHI) VALUES(?,?,?,?,?,?,?) " );
           // preparedStatement.setInt(1,30);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, yazar);
            preparedStatement.setString(3, tur);
            preparedStatement.setString(4, yayinevi);
            preparedStatement.setInt(5, sayi);
            preparedStatement.setString(6, tarih);
            preparedStatement.executeQuery();
            connection.commit();  
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void guncelle() {
        String sorgu = " UPDATE KITAPLAR SET AD = ? , YAZAR = ? , TUR = ? , YAYINEVI = ? , SAYFASAYISI = ? , BASIMTARIHI = ? WHERE KITAPNO = ? ";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, yazar);
            preparedStatement.setString(3, tur);
            preparedStatement.setString(4, yayinevi);
            preparedStatement.setInt(5, sayi);
            preparedStatement.setString(6, tarih);
            preparedStatement.setInt(7, id);
            preparedStatement.executeQuery();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
     
    @Override
    public void sil(int id) {
        String sorgu = "DELETE FROM KITAPLAR WHERE KITAPNO = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
 
    public ArrayList<Kitaplar> kitaplariGetir(){
        ArrayList<Kitaplar> cikti = new ArrayList<Kitaplar>();
        
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM KITAPLAR";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int kitapNumarasi = rs.getInt("KITAPNO");
                String ad = rs.getString("AD");
                String yazar = rs.getString("YAZAR");
                String tur = rs.getString("TUR");
                String yayınevi = rs.getString("YAYINEVI");
                int sayfa = rs.getInt("SAYFASAYISI");
                String baskiTarihi = rs.getString("BASIMTARIHI");
               
                cikti.add(new Kitaplar(kitapNumarasi, ad, yazar, tur, yayınevi, sayfa, baskiTarihi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   
    }
    
    public ArrayList<Kitaplar> araKitap(String adi){
        ArrayList<Kitaplar> cikti = new ArrayList<Kitaplar>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM KITAPLAR WHERE AD = '" + adi + "'";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int kitapNumarasi = rs.getInt("KITAPNO");
                String ad = rs.getString("AD");
                String yazar = rs.getString("YAZAR");
                String tur = rs.getString("TUR");
                String yayınevi = rs.getString("YAYINEVI");
                int sayfa = rs.getInt("SAYFASAYISI");
                String baskiTarihi = rs.getString("BASIMTARIHI");
                
                cikti.add(new Kitaplar(kitapNumarasi, ad, yazar, tur, yayınevi, sayfa, baskiTarihi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }    
    
}
