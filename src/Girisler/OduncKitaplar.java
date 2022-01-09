package Girisler;

import java.util.Date;

public class OduncKitaplar {
    private int kitapNo;
    private String ad;
    private String yazar;
    private int uyeNo;
    private String uyeAd;
    private String uyeSoyad;
    private Date verilisTarihi;
    private Date teslimTarihi;

    public OduncKitaplar(int kitapNo, String ad, String yazar, int uyeNo, String uyeAd, String uyeSoyad, Date verilisTarihi, Date teslimTarihi) {
        this.kitapNo = kitapNo;
        this.ad = ad;
        this.yazar = yazar;
        this.uyeNo = uyeNo;
        this.uyeAd = uyeAd;
        this.uyeSoyad = uyeSoyad;
        this.verilisTarihi = verilisTarihi;
        this.teslimTarihi = teslimTarihi;
    }
    
    public OduncKitaplar(int uyeNo, Date teslimTarihi){
        this.uyeNo = uyeNo;
        this.teslimTarihi = teslimTarihi;
    }

    public int getKitapNo() { return kitapNo; }

    public void setKitapNo(int kitapNo) { this.kitapNo = kitapNo; }
 
    public String getAd() { return ad; }

    public void setAd(String ad) { this.ad = ad; }

    public String getYazar() { return yazar; }

    public void setYazar(String yazar) { this.yazar = yazar; }

    public int getUyeNo() { return uyeNo; }

    public void setUyeNo(int uyeNo) { this.uyeNo = uyeNo; }

    public String getUyeAd() { return uyeAd; }

    public void setUyeAd(String uyeAd) { this.uyeAd = uyeAd; }

    public String getUyeSoyad() { return uyeSoyad; }

    public void setUyeSoyad(String uyeSoyad) { this.uyeSoyad = uyeSoyad; }

    public Date getVerilisTarihi() { return verilisTarihi; }

    public void setVerilisTarihi(Date verilisTarihi) { this.verilisTarihi = verilisTarihi; }

    public Date getTeslimTarihi() { return teslimTarihi; }

    public void setTeslimTarihi(Date teslimTarihi) { this.teslimTarihi = teslimTarihi; }
    
}
