package HW6;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum_arr1 = 0;
        int sum_arr2 = 0;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int count2 = 0;

        //-------------Work with array 1---------------
        for(int i = 0; i < array1.length; i++){
            sum_arr1 = sum_arr1 + array1[i];
            count += 1;
        }
        System.out.println("Array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6} ");
        System.out.println("Sum of array1 elements = " + sum_arr1);
        System.out.println("Average value of the array1 = " + (sum_arr1 / (double)count));

        for(int i = 0; i < array1.length; i++){
            if(array1[i] > max){
                max = array1[i];
            }
        }
        System.out.println("Maximum value of array1= " + max);

        for(int i = 0; i < array1.length; i++){
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("Minimum value of array1 = " + min);

        //-------------Work with array 2---------------
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                sum_arr2 = sum_arr2 + array2[i][j];
            }
        }
        System.out.println("\nArray2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};");
        System.out.println("Sum of array2 elements = " + sum_arr2);

        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                if(array2[i][j] > max2){
                    max2 = array2[i][j];
                }
                count2 += 1;
            }
        }
        System.out.println("Max value of array2 = " + max2);
        System.out.println("Count of array2 elements = " + count2);
    }
}
