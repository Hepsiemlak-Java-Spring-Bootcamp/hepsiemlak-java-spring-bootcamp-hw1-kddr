public class Gayrimenkul {

    private GayrimenkulTuru gayrimenkulTuru;
    private String il;
    private String ilce;
    private String AcikAdres;
    private String konutTipi;
    private String odaSayisi;
    private String salonSayisi;
    private Integer bulunduguKat;
    private Double brutAlan;
    private Double netAlan;

    public Gayrimenkul() {
    }

    public Gayrimenkul(GayrimenkulTuru gayrimenkulTuru, String il, String ilce, String acikAdres, String konutTipi, Double brutAlan, Double netAlan) {
        this.gayrimenkulTuru = gayrimenkulTuru;
        this.il = il;
        this.ilce = ilce;
        AcikAdres = acikAdres;
        this.konutTipi = konutTipi;
        this.brutAlan = brutAlan;
        this.netAlan = netAlan;
    }

    public GayrimenkulTuru getGayrimenkulTuru() {
        return gayrimenkulTuru;
    }

    public void setGayrimenkulTuru(GayrimenkulTuru gayrimenkulTuru) {
        this.gayrimenkulTuru = gayrimenkulTuru;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getAcikAdres() {
        return AcikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        AcikAdres = acikAdres;
    }

    public String getKonutTipi() {
        return konutTipi;
    }

    public void setKonutTipi(String konutTipi) {
        this.konutTipi = konutTipi;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public String getSalonSayisi() {
        return salonSayisi;
    }

    public void setSalonSayisi(String salonSayisi) {
        this.salonSayisi = salonSayisi;
    }

    public Integer getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(Integer bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }

    public Double getBrutAlan() {
        return brutAlan;
    }

    public void setBrutAlan(Double brutAlan) {
        this.brutAlan = brutAlan;
    }

    public Double getNetAlan() {
        return netAlan;
    }

    public void setNetAlan(Double netAlan) {
        this.netAlan = netAlan;
    }
}