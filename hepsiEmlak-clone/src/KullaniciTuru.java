public class KullaniciTuru {

    String kullaniciTurAdi;
    String aciklama;
    boolean aktifMi;

    public KullaniciTuru(String kullaniciTurAdi, String aciklama, boolean aktifMi) {
        this.kullaniciTurAdi = kullaniciTurAdi;
        this.aciklama = aciklama;
        this.aktifMi = aktifMi;
    }

    public KullaniciTuru(String kullaniciTurAdi, String aciklama) {
        this.kullaniciTurAdi = kullaniciTurAdi;
        this.aciklama = aciklama;
    }

    public KullaniciTuru() {
    }

    public String getKullaniciTurAdi() {
        return kullaniciTurAdi;
    }

    public void setKullaniciTurAdi(String kullaniciTurAdi) {
        this.kullaniciTurAdi = kullaniciTurAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }
}
