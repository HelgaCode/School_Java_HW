package HW8_1;

public class Manager extends Employee{
    private int numbersEmployee;

    public Manager(String name, int age, String male, double salaryInDay, int numbersEmployee){
        super(name, age, male, salaryInDay);
        this.numbersEmployee = numbersEmployee;
    }

    public int getNumbersEmployee(){
        return numbersEmployee;
    }

    @Override
    public double getSalary(int days) {
        double salary = getSalaryInDay() * days;
        return salary + salary * (getNumbersEmployee()/100);
    }

}
