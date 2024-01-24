package Inheritance;

public class Company {
    private String companyName;
    private String initYear;
    private String address;
    private int employeeTotal;
    private String businessArea;
    private String CEO;

    public Company(String companyName, String initYear, String address, int employeeTotal, String businessArea, String CEO) {
        this.companyName = companyName;
        this.initYear = initYear;
        this.address = address;
        this.employeeTotal = employeeTotal;
        this.businessArea = businessArea;
        this.CEO = CEO;
    }
    public void showInfo(){
        System.out.println(companyName);
        System.out.println(initYear);
        System.out.println(address);
        System.out.println(employeeTotal);
        System.out.println(businessArea);
        System.out.println(CEO);
    }
}
