import java.util.Date;

public class Mesaj {

    private String mesajBaslik;
    private String mesajIcerigi;
    private Kullanici gonderenKullanici;
    private Kullanici alanKullanici;
    private Date gonderilmeTarihi;
    private Date iletilmeTarihi;
    private boolean geriAlindiMi;

    public Mesaj(String mesajBaslik, String mesajIcerigi, Kullanici gonderenKullanici, Kullanici alanKullanici, Date gonderilmeTarihi) {
        this.mesajBaslik = mesajBaslik;
        this.mesajIcerigi = mesajIcerigi;
        this.gonderenKullanici = gonderenKullanici;
        this.alanKullanici = alanKullanici;
        this.gonderilmeTarihi = gonderilmeTarihi;
    }

    private boolean sil;

    public String getMesajBaslik() {
        return mesajBaslik;
    }

    public void setMesajBaslik(String mesajBaslik) {
        this.mesajBaslik = mesajBaslik;
    }

    public String getMesajIcerigi() {
        return mesajIcerigi;
    }

    public void setMesajIcerigi(String mesajIcerigi) {
        this.mesajIcerigi = mesajIcerigi;
    }

    public Kullanici getGonderenKullanici() {
        return gonderenKullanici;
    }

    public void setGonderenKullanici(Kullanici gonderenKullanici) {
        this.gonderenKullanici = gonderenKullanici;
    }

    public Kullanici getAlanKullanici() {
        return alanKullanici;
    }

    public void setAlanKullanici(Kullanici alanKullanici) {
        this.alanKullanici = alanKullanici;
    }

    public Date getGonderilmeTarihi() {
        return gonderilmeTarihi;
    }

    public void setGonderilmeTarihi(Date gonderilmeTarihi) {
        this.gonderilmeTarihi = gonderilmeTarihi;
    }

    public Date getIletilmeTarihi() {
        return iletilmeTarihi;
    }

    public void setIletilmeTarihi(Date iletilmeTarihi) {
        this.iletilmeTarihi = iletilmeTarihi;
    }

    public boolean isGeriAlindiMi() {
        return geriAlindiMi;
    }

    public void setGeriAlindiMi(boolean geriAlindiMi) {
        this.geriAlindiMi = geriAlindiMi;
    }

    public boolean isSil() {
        return sil;
    }

    public void setSil(boolean sil) {
        this.sil = sil;
    }
}
