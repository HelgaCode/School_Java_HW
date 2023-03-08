package HW5;

import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("\"----------Task#1----------\"");
        for(int j = 9; j>= 0; j--){
            for(int i = 0; i <= j; i++){
                System.out.print(i + " ");
                }
            System.out.println();
        }

        System.out.println("\n\"----------Task#2----------\"");
        int k = 0;
        for (int j = 9; j >= 0; j--) {
            for(int a = 1; a <= k; a++){
                System.out.print("  ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print(" "+ i);
            }
            k = k+1;
            System.out.println();
        }

        System.out.println("\n\"----------Task#3----------\"");
            int b = 0;
            for(int i = 9; i >= 0; i--){
                for(int a = 1; a <= b; a++){
                    System.out.print("  ");
                }

                for(int y = i; y >= 1; y--){
                    System.out.print(" "+ y);
                }

                for(int x = 0; x <= i; x++){
                    System.out.print(" " + x);
                }
                System.out.println();
                b = b + 1;
            }

    }
}
