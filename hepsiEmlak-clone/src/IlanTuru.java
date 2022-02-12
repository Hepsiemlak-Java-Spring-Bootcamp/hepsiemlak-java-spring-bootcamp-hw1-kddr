public class IlanTuru {
    String IlanTurAdi;
    String Aciklama;
    boolean aktifMi;

    public IlanTuru(String ilanTurAdi, String aciklama, boolean aktifMi) {
        IlanTurAdi = ilanTurAdi;
        Aciklama = aciklama;
        this.aktifMi = aktifMi;
    }

    public IlanTuru(String ilanTurAdi, String aciklama) {
        IlanTurAdi = ilanTurAdi;
        Aciklama = aciklama;
    }

    public IlanTuru() {
    }

    public String getIlanTurAdi() {
        return IlanTurAdi;
    }

    public void setIlanTurAdi(String ilanTurAdi) {
        IlanTurAdi = ilanTurAdi;
    }

    public String getAciklama() {
        return Aciklama;
    }

    public void setAciklama(String aciklama) {
        Aciklama = aciklama;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }
}
