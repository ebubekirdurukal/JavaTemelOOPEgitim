package tr.com.testinium;

public class EduThree {
    public static void main(String[] args) {
//
//        int benimParam = 100;
//        int biletFiyati = 200;
//
//        if (benimParam < biletFiyati) {
//            System.out.println("Paranız yeterli değil.");
//        } else {
//            System.out.println("Bilet alabilirsiniz.");
//        }
//
//        int not = 75;
//
//        if (not > 0 && not < 49) {
//            System.out.println("F aldınız, maalesef ders tekrarı.");
//        } else if (not >= 49 && not <= 60) {
//            System.out.println("D aldınız.");
//        } else if (not >= 61 && not <= 70) {
//            System.out.println("C aldınız.");
//        } else if (not >= 71 && not <= 80) {
//            System.out.println("B aldınız.");
//        } else if (not >= 81 && not <= 100) {
//            System.out.println("A aldınız. Tebrikler");
//        }
//
//        int x = 5;
//        switch(x){
//            case 1:
//                System.out.println("x değeri 1' dir");
//                break;
//            case 2:
//                System.out.println("x değeri 2' dir");
//                break;
//            case 3:
//                System.out.println("x değeri 3' tür");
//                break;
//            case 4:
//                System.out.println("x değeri 4' tür");
//                break;
//            default:
//                System.out.println("başka bir değerdir.");
//        }

        // switch case if else e çok benzerdir. Ama olduğu değere direkt gittiği için daha avantajlı olabilir.


//        for (int i = 0; i <= 100; i = i + 2) {
//            System.out.println(i);
//        }

//        int[] arr = {1, 2, 3};
//        for (int i : arr) {
//            System.out.println(i);  // for-each
//        }

//        for(;;){
//            System.out.println("deneme");  // sonsuz döngü
//        }

//        while (a < 100) {
//            System.out.println(a);
//            a = a + 7;
//        }
//
//        int a = 100;
//
//        do {
//            System.out.println(a);  // Kesinlikle en az bir kere çalışır.
//            a--;
//        } while (a > 0);

//        test:   // döngülere isim verebilirsiniz.
//        for (int j = 0; j <= 10; j++) {
//            for (int i = 0; i <= 10; i++) {
//                System.out.print(i * j + "  ");
//                if (j == 4) {
//                    break test; //break  tek başına olursa en içteki döngüyü kırar
//                }
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <= 10; i++) {
//            if (i == 7) {
//                break;
//            }
//            System.out.print(i + "  ");
//        }

        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                continue;  // o adım için yapacağını yapma, sonraki adımdan devam et.
            }
            System.out.print(i + "  ");
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                break;  
            }
            System.out.print(i + "  ");
        }


    }
}
