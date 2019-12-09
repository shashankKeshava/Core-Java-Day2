package Inheritance;

//base class
//super class
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work(int hours) {
        System.out.println("Employee: " + name + " works for " + hours + " hours");
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


}