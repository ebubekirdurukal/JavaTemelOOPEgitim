package tr.com.testinium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {

        /*

                    ARRAY
         */

        int[] xDizisi = new int[3]; // Tek boyutlu bir array
        String[] stringDizisi = {"aa", "bv", "cv"}; // bu şekilde de tanımlanabilir.
        String[] secondString = new String[10];
        secondString[0] = "ilk";
        // tek tip tutabilirler.
        // size'ları bellidir. Daha sonra değişmez.
        // Performansları hızlıdır.


        xDizisi[0] = 50;
        xDizisi[1] = 30;
        xDizisi[2] = 12;

        Arrays.sort(xDizisi); // Sorting için

        for (int i = 0; i < xDizisi.length; i++) {
            // System.out.println(xDizisi[i]);
        }

        stringDizisi[0] = "abc";

        // System.out.println(xDizisi[9]);
        // System.out.println("şu an burada");
        // System.out.println(xDizisi.length);

        for (int i : xDizisi) {
            // System.out.println(i);  // for-each
        }

        for (String s : secondString) {
            //System.out.println(s);
        }


        int[][] matris = new int[3][3];
        int[][][] matris2 = new int[3][3][3];

        matris[0][0] = 3;


        /*

        ARRAYLIST
         */

        List<String> sehirList = new ArrayList<>(); // poşet gibidir. İstediğiniz kadar ekleme yapabilirsiniz. Generic içindeki tipi kabul eder.
        // List<Ogrenci> ogrenciList = new ArrayList<>();

        List ogrenciListesi = new ArrayList();  // bu şlekilde istediğiniz tipte yerleştirirsiniz
        ogrenciListesi.add("Ahmet");
        ogrenciListesi.add(12);  // int değil Integer
        ogrenciListesi.add(new Ogrenci().ad);
        ogrenciListesi.add(new Boolean(true));

        for (int i = 0; i < ogrenciListesi.size(); i++) {
            System.out.println(ogrenciListesi.get(i));
        }


        sehirList.add("İstanbul");
        sehirList.add("Ankara");
        sehirList.add("Ankara");  // elemanların unique olma zorunluluğu yok, boyut yok. Primitive tip tutamazsınız.
        sehirList.add("Kırıkkale");
        sehirList.add("Trabzon");
        sehirList.remove(0);
        System.out.println(sehirList.get(0));

        System.out.println(sehirList.size());  // size almak için

        for (String s : sehirList) {
            //System.out.println(s);
        }

        if (sehirList.contains("Kırıkkale")) {
            System.out.println("Evet Kırıkale mevcut");
        }


        // performansı array e göre düşüktür.


         /*
            HASHMAP
         */
        System.out.println("***********************");

        Map<Integer, String> sehirMap = new HashMap<>();
        // key value yapısındadır.
        // eklemek için put kullanılır.
        // key ler unique dir.
        // sıra yoktur.
        // TC kimlik isim
        sehirMap.put(34, "İstanbul");
        sehirMap.put(1, "Adana");
        sehirMap.put(71, "Kırıkkale");
        sehirMap.put(71, "Ankara");
        sehirMap.put(88, "Adana");


        // remove metodu vardır.
        sehirMap.remove(71);
        sehirMap.containsKey(34);
        sehirMap.containsValue("Kırıkkale");

        sehirMap.get(71);
        for (Map.Entry sehir : sehirMap.entrySet()) {
            System.out.println(sehir.getKey() + " " + sehir.getValue());
        }

                 /*
            SET
         */

        System.out.println("***********************");

        Set<String> setOrnek = new HashSet<>();

        setOrnek.add("Melih");
        setOrnek.add("Ayşe");
        setOrnek.add("Melih"); // bunu almayacak. çünkü değerler unique, index tutmazlar

    }


}
