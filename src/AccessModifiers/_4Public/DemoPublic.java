package AccessModifiers._4Public;

public class DemoPublic {
    public String name = "Selenium";
    public int version = 4;
    public String getName(){
        return name;
    }
    public void showInfo(){
        System.out.println("Library: "+ name);
        System.out.println("version: " + version);
    }

    public static void main(String[] args) {
        DemoPublic demoPublic = new DemoPublic();
        demoPublic.showInfo();
    }
}
