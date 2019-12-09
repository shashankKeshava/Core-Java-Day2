package Inheritance;

//Manager is an Employee
//derived class
//sub class
public class Manager extends Employee {
    private int stockOptions;

    //Derived class should call
    //the base class constructor
    public Manager(String name,
                   double salary,
                   int stockOptions) {
        super(name, salary);
        this.stockOptions = stockOptions;
    }

    //Method Overriding
    public void work(int hours) {
        //super.work(hours);
        System.out.println("Manager: " + getName() + " works for " + hours + " hours");
    }

    @Override
    public String getName() {
        return "Hi " + super.getName();
    }

}