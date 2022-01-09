
package DatabaseBaglanti;

import Girisler.OduncKitaplar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OduncKitapIslemleri extends AbstractDatabase implements Isil{
   
    private int kitapNo;
    private String ad;
    private String yazar;
    private int uyeNo;
    private String uyeAd;
    private String uyeSoyad;
    private String verilisTarihi;
    private String teslimTarihi;

    public OduncKitapIslemleri() {}    
    
    public OduncKitapIslemleri(int kitapNo, String ad, String yazar, int uyeNo, String uyeAd, String uyeSoyad, String verilisTarihi, String teslimTarihi) {
        super();
        this.kitapNo = kitapNo;
        this.ad = ad;
        this.yazar = yazar;
        this.uyeNo = uyeNo;
        this.uyeAd = uyeAd;
        this.uyeSoyad = uyeSoyad;
        this.verilisTarihi = verilisTarihi;
        this.teslimTarihi = teslimTarihi;
    }
        
    @Override
    void abstractMetodYaz() {
        System.out.println("Abstract Metod");
    }

    @Override
    public void ekle() {
        String sorgu = "Insert Into ODUNCKITAPLAR (KITAPNO, AD, YAZAR, UYENO, UYEAD, UYESOYAD, VERILISTARIHI, TESLIMTARIHI) VALUES(?,?,?,?,?,?,?,?)";
        
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        java.sql.Date verilisTarihiSql = null;
        java.sql.Date teslimTarihiSql = null;
        try {
            java.util.Date tarihJava = format.parse(verilisTarihi);
            java.util.Date tarihJava2 = format.parse(teslimTarihi);
            verilisTarihiSql = new java.sql.Date(tarihJava.getTime());
            teslimTarihiSql = new java.sql.Date(tarihJava2.getTime());           
            
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, kitapNo);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, yazar);
            preparedStatement.setInt(4, uyeNo);
            preparedStatement.setString(5, uyeAd);
            preparedStatement.setString(6, uyeSoyad);
            preparedStatement.setDate(7, verilisTarihiSql);
            preparedStatement.setDate(8, teslimTarihiSql);
            preparedStatement.executeUpdate();       
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void guncelle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void sil(int id) {
        String sorgu = "DELETE FROM ODUNCKITAPLAR WHERE KITAPNO = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
   
    public ArrayList<OduncKitaplar> oduncKitaplariGetir(){
        ArrayList<OduncKitaplar> cikti = new ArrayList<OduncKitaplar>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM ODUNCKITAPLAR";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int kitapNo = rs.getInt("KITAPNO");
                String ad = rs.getString("AD");
                String yazar = rs.getString("YAZAR");
                int uyeNo = rs.getInt("UYENO");
                String uyeAd = rs.getString("UYEAD");
                String uyeSoyad = rs.getString("UYESOYAD");
                Date verilisTarihi = rs.getDate("VERILISTARIHI");
                Date teslimTarihi = rs.getDate("TESLIMTARIHI");
                
                cikti.add(new OduncKitaplar(kitapNo, ad, yazar, uyeNo, uyeAd, uyeSoyad, verilisTarihi, teslimTarihi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   
    }

    public ArrayList<OduncKitaplar> araOduncKitap(String adi){ 
        ArrayList<OduncKitaplar> cikti = new ArrayList<OduncKitaplar>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM ODUNCKITAPLAR WHERE AD = '" + adi + "'";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int kitapNo = rs.getInt("KITAPNO");
                String ad = rs.getString("AD");
                String yazar = rs.getString("YAZAR");
                int uyeNo = rs.getInt("UYENO");
                String uyeAd = rs.getString("UYEAD");
                String uyeSoyad = rs.getString("UYESOYAD");
                Date verilisTarihi = rs.getDate("VERILISTARIHI");
                Date teslimTarihi = rs.getDate("TESLIMTARIHI");
                
                cikti.add(new OduncKitaplar(kitapNo, ad, yazar, uyeNo, uyeAd, uyeSoyad, verilisTarihi, teslimTarihi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    public static boolean teslimTarihiGectiMi(Date teslimTarihi){

        LocalDate now = LocalDate.now();
        Date dateNow = Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant());

        if(teslimTarihi.before(dateNow)){ return true; }
        else{ return false; }
        
    }

    public boolean araOKitap(int kitapNo){
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM ODUNCKITAPLAR";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int kitapNo2 = rs.getInt("KITAPNO");
                if(kitapNo2 == kitapNo){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
 
    public int kacKitapAlmis(int no){
        int say = 0;
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM ODUNCKITAPLAR";
            ResultSet rs = statement.executeQuery(sorgu);
        
            while(rs.next()){
                int uyeNo = rs.getInt("UYENO");
                if(no == uyeNo){
                    say ++;
                }
            }
            return say;
        } catch (SQLException ex) {
            Logger.getLogger(OduncKitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
