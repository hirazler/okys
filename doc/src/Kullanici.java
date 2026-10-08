public class Kullanici {
    private int kullaniciId;
    private String adSoyad;
    private String eposta;

    // Constructor (Kurucu Metot)
    public Kullanici(int kullaniciId, String adSoyad, String eposta) {
        this.kullaniciId = kullaniciId;
        this.adSoyad = adSoyad;
        this.eposta = eposta;
    }

    // Getters ve Setters
    public int getKullaniciId() { return kullaniciId; }
    public void setKullaniciId(int kullaniciId) { this.kullaniciId = kullaniciId; }

    public String getAdSoyad() { return adSoyad; }
    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }

    public String getEposta() { return eposta; }
    public void setEposta(String eposta) { this.eposta = eposta; }
}