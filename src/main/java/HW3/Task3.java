package HW3;

public class Task3 {


    public static void main(String[] args) {
        int a = 7;
        int b = 10;

        System.out.println("----------Task#1----------");
    // Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
    //a == b - если переменные равны
    //a < b - если переменная a меньше b
    //a > b - если переменная b меньше a
        if(a == b) {
            System.out.println("a == b");
        } else if(a < b){
            System.out.println("a < b");
        } else {
            System.out.println("a > b");}

        System.out.println("\n----------Task#2----------");
    // Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
    // maybe a and b are even - если сумма переменных четная
    //some variable is odd - если сумма переменных нечетная
        if((a + b) % 2 == 0) {
            System.out.println("Maybe a and b are even");
        } else {
            System.out.println("Some variable is odd");
        }

        System.out.println("\n----------Task#3----------");
        if(a > 10){
            System.out.println("Variable a > 10");
        }
        if(a < 100) {
            System.out.println("Variable a < 100");
        }
        if((a / 2) > 20) {
            System.out.println("a / 2 > 20");
        }
        if(5 < a && a < 40) {
            System.out.println("5 < a < 40");
        } else {
            System.out.println("5 > a > 40");
        }

    }
}
