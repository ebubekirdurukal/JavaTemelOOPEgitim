package tr.com.testinium;

public class KayitSistemi {


    public String harfHesapla(Ogrenci ogrenci) {
        int not = ogrenci.not;
        if (not > 0 && not < 49) {
            return "F";
        } else if (not >= 49 && not <= 60) {
            return "D";
        } else if (not >= 61 && not <= 70) {
            return "C";
        } else if (not >= 71 && not <= 80) {
            return "B";
        } else {
            return "A";
        }
    }

    public void devamsizlikSorgula(Ogrenci ogrenci){
        if(ogrenci.kaldi){
            System.out.println("sinita kaldiniz");
        }
        else{
            System.out.println("geçtiniz");
        }
    }


}
