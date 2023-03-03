package HW4;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("----------Task#1----------");
        // Необходимо вывести числа от 0 до 15.
        for(int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n\n----------Task#2----------");
        //Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        int a = 5;
        int result = 5;
        for(int i = 1; result < 10000; i++){
            System.out.println("5 in power " + i + " = " + result);
            result *= a;
        }

        System.out.println("\n----------Task#3----------");
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).
        System.out.println("Multiples of 4 between 40 and 60 \n\nVar 1 (using IF construction):");
        for(int i = 40; i <=60; i++){
            if(i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nVar 2 (without IF):");
        for(int i = 40; i <= 60; i = i + 4){
            System.out.print(i + " ");
        }
    }
}
