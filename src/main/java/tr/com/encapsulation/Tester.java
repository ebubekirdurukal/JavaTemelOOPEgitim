package tr.com.encapsulation;

public class Tester extends Yazilimci {

    private String testTool;


    public Tester() {
    }

    public Tester(String name, String company, String computerBrand, String testTool) {
        super(name, company, computerBrand);
        this.testTool = testTool;
    }


    public String getTestTool() {
        return testTool;
    }

    public void setTestTool(String testTool) {
        this.testTool = testTool;
    }

    @Override
    public String mesaiYap(){
        return "5-12";
    }

    @Override
    public String kendiniTanit(){
        return "Merhaba, ismim " + this.getName() + ", ben bir Test görevlisiyim.";
    }
}
