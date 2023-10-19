package HW8_2;

public class EmployeeUtils {

    public Employee findByName(Employee[] employees, String name){
        for(int i = 0; i < employees.length; i++){
            Employee e = employees[i];
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public Employee findBySubname(Employee[] employees, String substring){
        for(int i = 0; i < employees.length; i++){
            Employee e = employees[i];
            if(e.getName().contains(substring)){
                return e;
            }
        }
        return null;
    }

    public double getTotalSalary(Employee[] employees){
        double sum = 0;
        for(int i = 0; i < employees.length; i++){
            Employee e = employees[i];
            sum += e.getSalary();
        }
        return sum;
    }

    public double getMaxSalary(Employee[] employees){
        double max = 0;
        for (int i = 0; i < employees.length; i++){
            double salary = employees[i].getSalary();
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

    public double getMinSalary(Employee[] employees){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++){
            double salary = employees[i].getSalary();
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }

    public int getMinNumSubordinates(Manager[] managers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++){
            int numSubordinates = managers[i].getNumberOfSubordinates();
            if (numSubordinates < min) {
                min = numSubordinates;
            }
        }
        return min;
    }

    public int getMaxNumSubordinates(Manager[] managers){
        int max = 0;
        for (int i = 0; i < managers.length; i++){
            int numSubordinates = managers[i].getNumberOfSubordinates();
            if (numSubordinates > max) {
                max = numSubordinates;
            }
        }
        return max;
    }

    public double getMaxPremium(Manager[] managers){
        double max = 0;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double premium = m.getSalary() - m.getBaseSalary();
            if (premium > max){
                max = premium;
            }
        }
        return max;
    }

    public double getMinPremium(Manager[] managers){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double premium = m.getSalary() - m.getBaseSalary();
            if (premium < min){
                min = premium;
            }
        }
        return min;
    }
}
