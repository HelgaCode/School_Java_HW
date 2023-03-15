package HW7;

public class Main {
    public static void main(String[] args) {
        String Name = "Olga";
        String Male = "Female";
        int age = 32;

        Person person = new Person(Name, Male, age);
        System.out.println(person.getName());

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Smith", "Male", 30,  140);
        employees[1] = new Employee("John", "Male", 35, 260);
        System.out.println(employees[0].isSameName(employees[1]));

        Salary salary = new Salary();
        System.out.println(salary.getSum(employees));
    }

}
