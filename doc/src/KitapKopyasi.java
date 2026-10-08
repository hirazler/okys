public class KitapKopyasi {
    private int kopyaId;
    private kitap kitap; // Kitap sınıfı ile ilişki
    private String durum; // Örneğin: "Rafta" veya "Ödünçte"

    // Constructor (Kurucu Metot)
    public KitapKopyasi(int kopyaId, kitap kitap, String durum) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.durum = durum;
    }

    // Getters ve Setters
    public int getKopyaId() { return kopyaId; }
    public void setKopyaId(int kopyaId) { this.kopyaId = kopyaId; }

    public kitap getKitap() { return kitap; }
    public void setKitap(kitap kitap) { this.kitap = kitap; }

    public String getDurum() { return durum; }
    public void setDurum(String durum) { this.durum = durum; }
}