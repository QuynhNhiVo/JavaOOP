package Inheritance;

public class Employee extends Company{
    public Employee(String companyName, String initYear, String address, int employeeTotal, String businessArea, String CEO) {
        super(companyName, initYear, address, employeeTotal, businessArea, CEO);
    }
    public void showInfo(){
        System.out.println("Class Employee (ham trung ham class cha)");
        super.showInfo();//Goi tu class Company
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Viettel", "1950", "Ha Noi", 2415, "Technology", "CEO" );
        employee.showInfo();

    }
}
