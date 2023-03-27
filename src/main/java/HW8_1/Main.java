package HW8_1;

public class Main {
    public static void main(String[] args) {
        int days = 3;
        double onePercent = 0.01;

        Employee employee1 = new Employee("Ivan", 33, "male", 39.5);
        System.out.println("Employee Salary = " + employee1.getSalary(days) + "$");

        Manager manager1 = new Manager("Olga", 31, "female", 40, 3);
        System.out.println("Manager salary = " + manager1.getSalary(days) + "$");

    }
}
