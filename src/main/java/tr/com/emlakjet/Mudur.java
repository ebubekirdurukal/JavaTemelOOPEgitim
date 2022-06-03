package tr.com.emlakjet;

public class Mudur {

    String ad;
    String soyad;

    boolean iyiBirOgretmentMi;

    static String ulke;


    static String meslek;


    public Mudur() {  // default constructor, eğer hiç bir constructor yoksa java sizin için ekler. Ama başka yazarsanız bunu eklemez.
        // yazılışları normal metod standartlarına uymaz. Özel bir tip metoddur.
    }

    public Mudur(String ad, String soyad){  // Parametreli bir constructor
        this.ad = ad;   // this o nesneyi ifade eder.
        this.soyad = soyad;
    }

    public Mudur(String ad, String soyad, boolean iyiBirOgretmentMi) {
        this.ad = ad;
        this.soyad = soyad;
        this.iyiBirOgretmentMi = iyiBirOgretmentMi;
    }

    public static void dersVerme(){
        System.out.println("Derse girildi.");
    }

    @Override
    protected void finalize(){
        System.out.println(" garbage collector çalıştı. ");
    }



}
