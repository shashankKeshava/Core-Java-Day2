package Inheritance;

public class EmployeeUser {

    public static void main(String[] args) {
        Employee empSam = new Employee("Sam", 20000);
        empSam.work(8);

        Manager manRam = new Manager("Ram", 40000, 100);
        manRam.work(12);
    }


}