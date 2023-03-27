package HW8_1;

public class Employee {
    private String name;
    private int age;
    private String male;
    private double salaryInDay;

    public Employee(String name, int age, String male, double salaryInDay) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.salaryInDay = salaryInDay;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getMale(){
        return male;
    }

    public double getSalaryInDay(){
        return salaryInDay;
    }

    public double getSalary(int days){
        return getSalaryInDay() * days;
    }
}
