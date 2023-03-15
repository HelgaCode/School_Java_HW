package HW7;

public class Salary {
    double sum = 0.0;
    public double getSum(Employee[] employeeArray){
        for(Employee employees : employeeArray){
            sum += employees.getSelary();
        }
        return sum;
    }
}
