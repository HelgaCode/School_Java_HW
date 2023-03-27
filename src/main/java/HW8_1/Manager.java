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

    public double getSalaryManager(int days) {
        double salary = getSalaryInDay() * days;
        if(getNumbersEmployee() > 0) {
            return (salary + salary * ((getNumbersEmployee() / 100.0) * 3));
        } else {return salary;}
    }

}
