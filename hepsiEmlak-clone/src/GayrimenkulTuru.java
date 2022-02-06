public class GayrimenkulTuru {

    private String turAdi;
    private Boolean aktifMi;
    private String aciklama;

    public String getTurAdi() {
        return turAdi;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }

    public Boolean getAktifMi() {
        return aktifMi;
    }

    public void setDurum(Boolean aktifMi) {
        this.aktifMi = aktifMi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public GayrimenkulTuru(String turAdi, Boolean aktifMi, String aciklama) {
        this.turAdi = turAdi;
        this.aktifMi = aktifMi;
        this.aciklama = aciklama;
    }

    public GayrimenkulTuru(String turAdi, Boolean aktifMi) {
        this.turAdi = turAdi;
        this.aktifMi = aktifMi;
    }

    public GayrimenkulTuru() {
    }
}
