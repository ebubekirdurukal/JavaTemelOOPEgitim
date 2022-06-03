package tr.com.abstaction;

public class PCOyunIslemleri implements OyunIslemleri {

    // Eğer bir interface implement ediyorsanız tüm metodları ezmelisiniz.
    // birden fazla interface den miras alabilir.
    @Override
    public String oyunIndir() {
        return "Bilgisayara oyun indirme başladı.";
    }
}
