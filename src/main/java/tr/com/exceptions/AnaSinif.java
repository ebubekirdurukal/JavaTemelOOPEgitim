package tr.com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaSinif {

    public static void main(String[] args) throws YeniIcadEttigimizException, InterruptedException {
        String[] stringDizisi = {"aa", "bv", "cv"}; // sizeı 3 en son indisi 2.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaçıncı indisi yazdırmak istersiniz?");
        try {
            int input = scanner.nextInt();
            System.out.println(stringDizisi[input]);
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu: " + e);  // exception gelirse yakalama
        } finally {
            System.out.println("her türlü çalışır");
        }


        int benimParam = 100;
        int borc = 200;
        YeniIcadEttigimizException yeniIcadEttigimizException = new YeniIcadEttigimizException("Paranız bitmiştir");


        Thread.sleep(1000);


        if (borc > benimParam) {
            throw yeniIcadEttigimizException;
        }


        System.out.println("Programın devamı");
    }
}
