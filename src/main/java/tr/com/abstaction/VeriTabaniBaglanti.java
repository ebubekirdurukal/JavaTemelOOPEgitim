package tr.com.abstaction;

public abstract class VeriTabaniBaglanti {
    /*
    Abstract sınıflar içine abstract metod yazabilirsiniz.
    Abstract sınıflar içine normal body'li metod yazabilirsiniz.
    Nesne oluşturamazsınız. Child sınıflar oluşturabilirsiniz.
     */


    public abstract void connect();


    public int topla(int x, int y) {
        return x + y;
    }


}
