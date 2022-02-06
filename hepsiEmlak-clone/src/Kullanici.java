import java.util.*;

public class Kullanici {

    private KullaniciTuru kullaniciTipi;
    private String adSoyad;
    private String email;
    private Date dogumTarihi;
    private String fotograf;
    private String biyografi;
    private String vkn;

    Set<Ilan> favoriIlanlar;
    List<Ilan> yayinladigiIlanlar;
    List<Mesaj> mesajKutusu;

    public Kullanici(KullaniciTuru kullaniciTipi, String adSoyad, String email, Date dogumTarihi, String fotograf, String biyografi, String vkn) {
        this.kullaniciTipi = kullaniciTipi;
        this.adSoyad = adSoyad;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.fotograf = fotograf;
        this.biyografi = biyografi;
        this.vkn = vkn;
    }

    public Kullanici(KullaniciTuru kullaniciTipi, String adSoyad, String email, Date dogumTarihi, String vkn) {
        this.kullaniciTipi = kullaniciTipi;
        this.adSoyad = adSoyad;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.vkn = vkn;
    }

    public Kullanici(KullaniciTuru kullaniciTipi, String adSoyad, String email) {
        this.kullaniciTipi = kullaniciTipi;
        this.adSoyad = adSoyad;
        this.email = email;
    }

    public KullaniciTuru getKullaniciTipi() {
        return kullaniciTipi;
    }

    public void setKullaniciTipi(KullaniciTuru kullaniciTipi) {
        this.kullaniciTipi = kullaniciTipi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    public String getBiyografi() {
        return biyografi;
    }

    public void setBiyografi(String biyografi) {
        this.biyografi = biyografi;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public Set<Ilan> getFavoriIlanlar() {
        return favoriIlanlar;
    }

    public void setFavoriIlanlar(Set<Ilan> favoriIlanlar) {
        this.favoriIlanlar = favoriIlanlar;
    }

    public List<Ilan> getYayinladigiIlanlar() {
        return yayinladigiIlanlar;
    }

    public void setYayinladigiIlanlar(List<Ilan> yayinladigiIlanlar) {
        this.yayinladigiIlanlar = yayinladigiIlanlar;
    }

    public List<Mesaj> getMesajKutusu() {
        return mesajKutusu;
    }

    public void setMesajKutusu(List<Mesaj> mesajKutusu) {
        this.mesajKutusu = mesajKutusu;
    }
}
