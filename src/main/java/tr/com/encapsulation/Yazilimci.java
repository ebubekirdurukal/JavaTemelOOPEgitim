package tr.com.encapsulation;

public class Yazilimci {

    private String name;
    private String company;
    private String computerBrand;

    public Yazilimci() {
    }

    public Yazilimci(String name, String company, String computerBrand) {
        this.name = name;
        this.company = company;
        this.computerBrand = computerBrand;
    }

    public String kendiniTanit() {
        return "merhaba, ben bir yazılımcıyım.";
    }

    public String mesaiYap() {
        return "Onemi kalmadı";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company; // this bu sınıf demek, super ata sınıf demek
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }
}
