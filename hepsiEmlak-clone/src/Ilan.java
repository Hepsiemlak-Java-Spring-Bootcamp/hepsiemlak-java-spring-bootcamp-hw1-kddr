import java.math.BigDecimal;
import java.util.Date;

public class Ilan {

    private String baslik;
    private String altBaslik;
    private IlanTuru ilanTuru;
    private Gayrimenkul gayrimenkul;
    private Kullanici kullanici;
    private String[] resimAdresList = new String[5];
    private BigDecimal fiyat;
    private Date olusturulmaTarihi;
    private Date yayinlanmaTarihi;
    private int ılanSuresi;
    private Double iskonto;
    private boolean oneCikarilacakMi;
    private boolean aktifMi;
    private boolean incelendiMi;

    public Ilan()
    {

    }

    public Ilan(Gayrimenkul gayrimenkul, Kullanici kullanici, String[] resimAdresList)
    {
        this.gayrimenkul = gayrimenkul;
        this.kullanici = kullanici;
        this.resimAdresList = resimAdresList;
    }

    public Ilan(String baslik, String altBaslik, Gayrimenkul gayrimenkul, Kullanici kullanici,
                String[] resimAdresList, BigDecimal fiyat, Date olusturulmaTarihi, Date yayinlanmaTarihi,
                int ılanSuresi, Double iskonto, boolean oneCikarilacakMi, boolean aktifMi, boolean incelendiMi) {
        this.baslik = baslik;
        this.altBaslik = altBaslik;
        this.gayrimenkul = gayrimenkul;
        this.kullanici = kullanici;
        this.resimAdresList = resimAdresList;
        this.fiyat = fiyat;
        this.olusturulmaTarihi = olusturulmaTarihi;
        this.yayinlanmaTarihi = yayinlanmaTarihi;
        this.ılanSuresi = ılanSuresi;
        this.iskonto = iskonto;
        this.oneCikarilacakMi = oneCikarilacakMi;
        this.aktifMi = aktifMi;
        this.incelendiMi = incelendiMi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAltBaslik() {
        return altBaslik;
    }

    public void setAltBaslik(String altBaslik) {
        this.altBaslik = altBaslik;
    }

    public Gayrimenkul getGayrimenkul() {
        return gayrimenkul;
    }

    public void setGayrimenkul(Gayrimenkul gayrimenkul) {
        this.gayrimenkul = gayrimenkul;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String[] getResimAdresList() {
        return resimAdresList;
    }

    public void setResimAdresList(String[] resimAdresList) {
        this.resimAdresList = resimAdresList;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Date getYayinlanmaTarihi() {
        return yayinlanmaTarihi;
    }

    public void setYayinlanmaTarihi(Date yayinlanmaTarihi) {
        this.yayinlanmaTarihi = yayinlanmaTarihi;
    }

    public int getIlanSuresi() {
        return ılanSuresi;
    }

    public void setIlanSuresi(int ılanSuresi) {
        this.ılanSuresi = ılanSuresi;
    }

    public Double getIskonto() {
        return iskonto;
    }

    public void setIskonto(Double iskonto) {
        this.iskonto = iskonto;
    }

    public boolean isOneCikarilacakMi() {
        return oneCikarilacakMi;
    }

    public void setOneCikarilacakMi(boolean oneCikarilacakMi) {
        this.oneCikarilacakMi = oneCikarilacakMi;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }

    public boolean isIncelendiMi() {
        return incelendiMi;
    }

    public void setIncelendiMi(boolean incelendiMi) {
        this.incelendiMi = incelendiMi;
    }

}
