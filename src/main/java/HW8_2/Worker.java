package HW8_2;

public class Worker extends Employee {

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
