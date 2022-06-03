package tr.com.testinium;

public class EduTwo {


    byte a = 1;
    short b = 45;
    int c = 32;
    long d = 90L;
    float e = 43.6f;
    double f = 43.6;
    char g = 'i';
    boolean h = true;
    String deneme = "bu bir cumle";

    int x, y, z; // yapılabilir ama tavsiye edilmez.

    Integer i = 5;
    Integer j = new Integer(5);

    Boolean bl = true;  // default null


    public static void main(String[] args) {
        int i = 5;
        long l = i; // automatic
        i = (int) l; //manuel type casting

        //System.out.println(i);

        byte by = 10;
        int in = 130;
        by = (byte) in; // Byte en fazla +128 tutabildiği için taştı.

        // System.out.println(by); // -126

        // System.out.println(5 % 3); 2

//        int a = 5;
//        a++; // a = a + 1;
//        System.out.println(a); // 6
//        System.out.println(a * 5); // 30
//
//        a += 3; // a = a + 3;
//        System.out.println(a);
//
//        int x = 5;
//        int y = x++; // bu satır çalıştıktan sonra artırır
//        System.out.println(x);
//        System.out.println(y);
//
//        int z = 4;
//        int t = ++z; // bu satır bitmeden artırır.
//        System.out.println(t);
//
//        int p = 7;
//        System.out.println("p = " + ++p); // 8
//        System.out.println(p); // 8
//
//
//        System.out.println(p == 8); //true
//        System.out.println(p != 8); // false
//        System.out.println(p > 8); // false
//        System.out.println(p < 8); // false
//        System.out.println(p >= 8); // true
//
//        boolean bool = true;
//        System.out.println(bool == false);
//        System.out.println(!bool);
//
//        int xl = 3;
//        int yl = 5;
//        System.out.println(xl == yl); // false
//        System.out.println(xl != yl); // true
//        System.out.println(xl >= yl); // false
//        System.out.println(xl <= yl); // true
//        System.out.println(xl > yl);  // false


        boolean deger = true;
        boolean deger2 = false;

        System.out.println(deger == deger2); // false
        System.out.println(deger != deger2); // true
        System.out.println(deger & deger2); // false
        System.out.println(deger | deger2); // true
        System.out.println(deger && deger2); // kısa devre and false
        System.out.println(deger || deger2); // kısa devre or true

        // + işareti Java' da eğer iki taraf da sayı ise toplama,
        // eğer iki taraf da String ise birleştirme anlamına gelir.
        System.out.println(3 + 5);
        System.out.println("Ebubekir" + "Durukal");
        System.out.println("Ebubekir" + 2 + 3); // string' e denk gelince geri kalanı da string alır
        System.out.println(2 + 3 + "Java" + 5 + 6);

        String part1 = "Emlak";
        String part2 = "Jet";
        part1 += part2; // part1 = part1 + part2
        System.out.println(part1);

        String ad = "Ebubekir";
        String soyad = "Durukal";
        String adres = "Kadikoy";
        String sehir = "Istanbul";
        System.out.println("Adım: " + ad + " Soyadım: " + soyad + " adresim: " + adres);


    }

}
