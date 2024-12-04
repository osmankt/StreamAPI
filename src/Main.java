import java.util.*;
import java.util.stream.*;

class Urun {
    private int id;
    private String ad;
    private double fiyat;

    public Urun(int id, String ad, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}

public class AkisYontemleriOrnek {
    public static void main(String[] args) {
        // Örnek 1: dropWhile()
        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> sonucDropWhile = sayilar.stream()
                .dropWhile(n -> n < 5)
                .collect(Collectors.toList());
        System.out.println("dropWhile sonucu: " + sonucDropWhile);


        List<String> isimler = Arrays.asList("Ali", "Veli", "Ayşe", "Fatma", "Mehmet");
        List<String> sonucSkip = isimler.stream()
                .skip(2) // İlk 2 elemanı atla
                .collect(Collectors.toList());
        System.out.println("skip sonucu: " + sonucSkip);


        List<Urun> urunler = Arrays.asList(
                new Urun(1, "Laptop", 1200.00),
                new Urun(2, "Telefon", 800.00),
                new Urun(3, "Tablet", 400.00),
                new Urun(4, "Monitör", 200.00)
        );


        List<Urun> pahaliUrunler = urunler.stream()
                .dropWhile(p -> p.getFiyat() < 500.00)
                .collect(Collectors.toList());
        System.out.println("dropWhile sonrası ürünler: " + pahaliUrunler);


        List<Urun> ilkUrunAtlandi = urunler.stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("skip sonrası ürünler: " + ilkUrunAtlandi);
    }
}
