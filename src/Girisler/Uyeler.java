package Girisler;

import java.util.Date;

public class Uyeler {
    private int uyeNo;
    private String ad;
    private String soyad;
    private String telefon;
    private String mail;
    private String adres;
    private Date dogumTarihi;
    private double uyeBorc;

    public Uyeler(int uyeNo, String ad, String soyad, String telefon, String mail, String adres, Date dogumTarihi, double uyeBorc) {
        this.uyeNo = uyeNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.mail = mail;
        this.adres = adres;
        this.dogumTarihi = dogumTarihi;
        this.uyeBorc = uyeBorc;
    }

    public int getUyeNo() { return uyeNo; }
    

    public void setUyeNo(int uyeNo) { this.uyeNo = uyeNo; }

    public String getAd() { return ad; }

    public void setAd(String ad) { this.ad = ad; }

    public String getSoyad() { return soyad; }

    public void setSoyad(String soyad) { this.soyad = soyad; }

    public String getTelefon() { return telefon; }

    public void setTelefon(String telefon) { this.telefon = telefon; }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }

    public String getAdres() { return adres; }

    public void setAdres(String adres) { this.adres = adres; }

    public Date getDogumTarihi() { return dogumTarihi; }

    public void setDogumTarihi(Date dogumTarihi) { this.dogumTarihi = dogumTarihi; }

    public double getUyeBorc() { return uyeBorc; }

    public void setUyeBorc(double uuyeBorc) { this.uyeBorc = uuyeBorc; }    
    
}
