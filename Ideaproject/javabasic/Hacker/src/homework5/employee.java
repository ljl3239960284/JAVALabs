package homework5;

public class employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void printEmployeeInfo() {
        System.out.println(name + "\t\t\t" + yearOfJoining + "\t\t\t" + salary + "\t\t\t" + address);
    }

    public static void main(String[] args) {
        employee robert = new employee("Robert", 2004, 8000, "64C- Longdong Streat");
        employee sam = new employee("Sam", 2010, 6500, "68D- Tianfu Streat");
        employee john = new employee("John", 2017, 6000, "26B- Zhongshan Streat");

        System.out.println("Name\t\t\tYear of joining\t\tSalary\t\tAddress");
        robert.printEmployeeInfo();
        sam.printEmployeeInfo();
        john.printEmployeeInfo();
    }
}