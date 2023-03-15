package HW7;

public class Employee extends Person {
    private double selary;

    public Employee(String Name, String Male, int age, double selary){
        super(Name, Male, age);
        this.selary = selary;
    }

    public boolean isSameName(Employee employee){
        return this.getName().equals(employee.getName());
    }

    public double getSelary() {
        return selary;
    }

}
