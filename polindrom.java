public class Main {

    public static void main(String[] args) {
        String sonuc ="";

        for(int i = 10; i<=100; i++) {
            Long sayi = Long.parseLong(String.valueOf(i));
            String tmpSonuc = "";

            tmpSonuc += "İlk Sayı: " + sayi;
            while(!sayi.equals(tersiniBul(sayi))) {
                tmpSonuc += "\nTersi: " + tersiniBul(sayi);
                sayi += tersiniBul(sayi);
                tmpSonuc += "\nYeni Sayı: " + sayi;
            }

            if(tmpSonuc.length() > sonuc.length())
                sonuc = tmpSonuc;
        }

        System.out.println(sonuc);
    }

    private static Long tersiniBul(Long sayi) {

        Long tersSayi = Long.valueOf(0);
        while (sayi > 0) {
            tersSayi = (tersSayi * 10) + (sayi % 10);
            sayi /= 10;
        }
        return tersSayi;
    }
}
