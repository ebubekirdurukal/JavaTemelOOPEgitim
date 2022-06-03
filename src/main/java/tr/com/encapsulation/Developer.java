package tr.com.encapsulation;

public class Developer extends Yazilimci {  // is-a ilişkisi

    private String developmentTool;

    public Developer(String name, String company, String computerBrand, String developmentTool) {
        super(name, company, computerBrand);  // üst sınıfı ifade ediyor.
        this.developmentTool = developmentTool;
    }


    public String getDevelopmentTool() {
        return developmentTool;
    }

    public void setDevelopmentTool(String developmentTool) {
        this.developmentTool = developmentTool;
    }
    @Override
    public String mesaiYap(){
        return "8-6";
    }

    @Override
    public String kendiniTanit(){
        return "Merhaba, ismim " + this.getName() + ", ben bir development görevlisiyim.";
    }
}
