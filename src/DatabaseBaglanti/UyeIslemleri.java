
package DatabaseBaglanti;

import Girisler.Uyeler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UyeIslemleri extends AbstractDatabase implements Isil{
    
    private int uyeNo;
    private String ad;
    private String soyad;
    private String telefon;
    private String mail;
    private String adres;
    private String dogumTarihi;
    private double uyeBorc;

    public UyeIslemleri() {}
    
    public UyeIslemleri(int uyeNo, String ad, String soyad, String telefon, String mail, String adres, String dogumTarihi, double uyeBorc) {
        super();
        this.uyeNo = uyeNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.mail = mail;
        this.adres = adres;
        this.dogumTarihi = dogumTarihi;
        this.uyeBorc = uyeBorc;
    }
    
    @Override
    void abstractMetodYaz() {
        System.out.println("Abstract Metod");
    }
   
    @Override
    public void ekle() {
        String sorgu = "INSERT INTO UYELER (AD, SOYAD, TELEFON, MAIL, ADRES, DOGUMTARIHI, UYEBORC) VALUES(?,?,?,?,?,?,?)";

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        java.sql.Date tarihSql = null;
        try {
            java.util.Date date = format.parse(dogumTarihi);
            tarihSql = new java.sql.Date(date.getTime()); 

            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, telefon);
            preparedStatement.setString(4, mail);
            preparedStatement.setString(5, adres);
            preparedStatement.setDate(6, tarihSql);
            preparedStatement.setDouble(7, 0);
            preparedStatement.executeQuery();
            connection.commit();

        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void guncelle() {
        String sorgu = "UPDATE UYELER SET AD = ? , SOYAD = ? , TELEFON = ? , MAIL = ? , ADRES = ? , DOGUMTARIHI = ? WHERE UYENO = ?";
        
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        java.sql.Date tarihSql = null;
        try {
            java.util.Date date = format.parse(dogumTarihi);
            tarihSql = new java.sql.Date(date.getTime()); 

            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, telefon);
            preparedStatement.setString(4, mail);
            preparedStatement.setString(5, adres);
            preparedStatement.setDate(6, tarihSql);
            preparedStatement.setInt(7, uyeNo);
            
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void sil(int id) {
        String sorgu = "DELETE FROM UYELER WHERE UYENO = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, uyeNo);
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }

    public ArrayList<Uyeler> uyeleriGetir(){
        ArrayList<Uyeler> cikti = new ArrayList<Uyeler>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM UYELER";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int uyeNo = rs.getInt("UYENO");
                String ad = rs.getString("AD");
                String soyad = rs.getString("SOYAD");
                String telefon = rs.getString("TELEFON");
                String mail = rs.getString("MAIL");
                String adres = rs.getString("ADRES");
                Date dogumTarihi = rs.getDate("DOGUMTARIHI");
                double uyeBorc = rs.getDouble("UYEBORC");
                
                cikti.add(new Uyeler(uyeNo, ad, soyad, telefon, mail, adres, dogumTarihi, uyeBorc));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }          
    }    
    
    public ArrayList<Uyeler> araUye(String adi){ 
        ArrayList<Uyeler> cikti = new ArrayList<Uyeler>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM UYELER WHERE AD = '" + adi + "'";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int uyeNo = rs.getInt("UYENO");
                String ad = rs.getString("AD");
                String soyad = rs.getString("SOYAD");
                String telefon = rs.getString("TELEFON");
                String mail = rs.getString("MAIL");
                String adres = rs.getString("ADRES");
                Date dogumTarihi = rs.getDate("DOGUMTARIHI");
                double uyeBorc = rs.getDouble("UYEBORC");
                
                cikti.add(new Uyeler(uyeNo, ad, soyad, telefon, mail, adres, dogumTarihi, uyeBorc));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    public void borcSil(int uyeNo){
        String sorgu = "UPDATE UYELER SET UYEBORC = ? WHERE UYENO = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setDouble(1, 0.0);
            preparedStatement.setInt(2, uyeNo);
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
  
}
