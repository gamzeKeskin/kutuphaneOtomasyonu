package Girisler;

public class Yonetici {
    private String ad;
    private String sifre;
    private int id;

    public Yonetici( int id,String ad, String sifre) {
        this.ad = ad;
        this.sifre = sifre;
        this.id = id;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
    
    public String getAd() { return ad; }

    public void setAd(String ad) { this.ad = ad; }

    public String getSifre() { return sifre; }

    public void setSifre(String sifre) { this.sifre = sifre; }
 
}
