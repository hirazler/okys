public class kitap {
    private String isbn;
    private String baslik;
    private String yazar;

    // Constructor (Kurucu Metot)
    public kitap(String isbn, String baslik, String yazar) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
    }

    // Getters ve Setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getBaslik() { return baslik; }
    public void setBaslik(String baslik) { this.baslik = baslik; }

    public String getYazar() { return yazar; }
    public void setYazar(String yazar) { this.yazar = yazar; }
}