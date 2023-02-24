package HW2;

public class Task1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println("Input data :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("-------------Task #1-------------");
        System.out.println("Сумма \t\t|\tа + b = " + (a + b));
        System.out.println("Умножение \t|\tа * b = " + (a * b));
        System.out.println("Вычитание \t|\tа - b = " + (a - b));
        System.out.println("Деление \t|\tа / b = " + (a / b));

        System.out.println("-------------Extra Task-------------");
        System.out.println("Деление с приведением типов |\tа / b = " + (double) a / b);
        System.out.println("Остаток от деление \t\t\t|\tа % b = " + (a % b));

        if(a % 2 == 0){ System.out.println("Переменная а - четная"); }
        else { System.out.println("Переменная а - нечетная");}
        if(b % 2 == 0){ System.out.println("Переменная b - четная"); }
        else { System.out.println("Переменная b - нечетная");}
        System.out.println("\n\uD83D\uDC97 " + "---- Well done! I'm good! ----" + " \uD83D\uDC97");

    }
}
