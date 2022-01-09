package Girisler;

public class Kitaplar {
    private int kitapNumarasi;
    private String adı;
    private String yazar;
    private String tur;
    private String yayınevi;
    private int sayfaSayisi;
    private String baskıTarihi;

    public Kitaplar(int kitapNumarasi, String adı, String yazar, String tur, String yayınevi, int sayfaSayisi, String baskıTarihi) {
        this.kitapNumarasi = kitapNumarasi;
        this.adı = adı;
        this.yazar = yazar;
        this.tur = tur;
        this.yayınevi = yayınevi;
        this.sayfaSayisi = sayfaSayisi;
        this.baskıTarihi = baskıTarihi;
    }

    public int getKitapNumarasi() { return kitapNumarasi; }

    public void setKitapNumarasi(int kitapNumarasi) { this.kitapNumarasi = kitapNumarasi; }
 
    public String getAdı() { return adı; }

    public void setAdı(String adı) { this.adı = adı; }

    public String getYazar() { return yazar; }

    public void setYazar(String yazar) { this.yazar = yazar; }

    public String getTur() { return tur; }

    public void setTur(String tur) { this.tur = tur; }

    public String getYayınevi() { return yayınevi; }

    public void setYayınevi(String yayınevi) { this.yayınevi = yayınevi; }

    public int getSayfaSayisi() { return sayfaSayisi; }

    public void setSayfaSayisi(int sayfaSayisi) { this.sayfaSayisi = sayfaSayisi; }

    public String getBaskıTarihi() { return baskıTarihi; }

    public void setBaskıTarihi(String baskıTarihi) { this.baskıTarihi = baskıTarihi; }
    
}
