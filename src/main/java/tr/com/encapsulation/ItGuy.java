package tr.com.encapsulation;

public class ItGuy extends Yazilimci {

    public ItGuy(String name, String company, String computerBrand) {
        super(name, company, computerBrand);
    }

    @Override
    public String mesaiYap() {
        return "20-5";
    }

    @Override
    public String kendiniTanit() {
        return super.kendiniTanit();
    }

}
