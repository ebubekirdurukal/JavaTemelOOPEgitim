package tr.com.testinium;

public class Matematik {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        // topla(4,7); olmaz çünkü başka sınıftan çağırmak için instance yaratmalıyız.
        ogrenci.topla(3,5,3,4,1,3,4,5,2,21,3,5,3,2,12,1,2,3,4,5,56,6,67);
        //ogrenci.topla(3,5.2);




    }


}
