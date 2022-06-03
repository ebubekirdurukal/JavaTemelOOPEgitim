package tr.com.emlakjet;

public class AnaSinif {

    class InnerClass{  // default access modifier

    }

    public static void main(String[] args) throws InterruptedException {

        //tr.com.testinium.Mudur  mudur = new tr.com.testinium.Mudur(); // aynı projede olduğu için importa gerek yok. Ama aynı class ismi olduğu için Java'Nın bunu
        // ayırt edebilmesi için böyle tanımlıyoruz.


        Mudur.dersVerme(); // static metodlar instance yaratmadan çağrılabilir.


        Mudur bizimOkulMuduru = new Mudur();
        bizimOkulMuduru.ad = "Ahmet";
        bizimOkulMuduru.soyad = "Siyah";
        bizimOkulMuduru.iyiBirOgretmentMi = true;
        Mudur digerMudur = new Mudur("Mehmet", "Beyaz", false);
        Mudur ucuncu = new Mudur("Zeynep", "Kırmızı", true);

        Mudur.ulke = "Turkiye";  // tüm instance'lar için değişiyor.

        for (int i = 0; i < 100000; i++) {
            Mudur bizimOkulMuduru2 = new Mudur();
            Thread.sleep(10);
        }

    }
}
