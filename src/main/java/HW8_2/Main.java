package HW8_2;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setBaseSalary(100);
        System.out.println("Worker`s salary is " + w1.getSalary());

        Manager m1 = new Manager();
        m1.setBaseSalary(1000);
        m1.setNumberOfSubordinates(2);
        System.out.println("Manager`s salary is " + m1.getSalary());

        Director d1 = new Director();
        d1.setBaseSalary(10000);
        d1.setNumberOfSubordinates(2);
        System.out.println("Director`s salary is " + d1.getSalary());
    }
}
