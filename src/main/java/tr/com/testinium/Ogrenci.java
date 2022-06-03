package tr.com.testinium;

public class Ogrenci {

    String ad;   // Field' lar, attribute' lar
    String soyad;
    int yas;
    int numara;
    Adres adres;
    Okul okul;

    int not;

    boolean kaldi;


//    public int topla(int x, int y){
//        return x + y;
//    }
//
//    public double topla(int x, double y){
//        return x + y;
//    }
//
//    public int topla(int x, int y, int z){  // Method overloading
//        return x + y + z;
//    }
//
//    public int topla(int x, int y, int z, int t){
//        return x + y + z + t;
//    }

    public int topla(int... args){
        int result = 0;
        for(int i: args){
            result+=i;
        }
        return result;
    }

    public void yazdir(String str){
        System.out.println(str + topla(3,5));
    }

    public void yazdir(Ogrenci ogrenci){
        System.out.println(ogrenci.ad);
    }

    public Ogrenci ogrenciIsmi(Ogrenci ogrenci){
        System.out.println(ogrenci.ad);
        return new Ogrenci();
    }




    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.ad = "Ahmet";
        ogr1.soyad = "Durukal";
        ogr1.yas = 22;
        ogr1.numara = 1234;
        Okul okul1 = new Okul();
        okul1.ad = "ITU";
        okul1.kurulusYili = 1890;
        ogr1.okul = okul1;
        ogr1.okul.sinifSayisi = 500;
        Adres adres1 = new Adres();
        ogr1.adres = adres1;
        ogr1.adres.mahalle = "Barbaros Mah.";
        ogr1.adres.kapiNo = 12;



        Ogrenci ogr2 = new Ogrenci();
        ogr2.ad = "Ayşe";
        ogr2.not = 45;
        ogr2.kaldi = false;

        KayitSistemi kayitSistemi = new KayitSistemi();
        String harf = kayitSistemi.harfHesapla(ogr2);
        System.out.println(harf);
        kayitSistemi.devamsizlikSorgula(ogr2);




    }

    @Override
    protected void finalize(){
        System.out.println(" garbage collector çalıştı." + ad);
    }

}
