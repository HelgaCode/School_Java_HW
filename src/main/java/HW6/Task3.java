package HW6;

public class Task3 {
    public static void main(String[] args) {
        //Need to swap rows and columns in a two-dimensional array

        int[][] arr = {{1, 2}, {3, 4}};
        int[][] arr1 = new int[2][2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr1[j][i] = arr[i][j];
            }
        }

        System.out.println("Original array:");
        for(int[] row : arr){
            for(int elements: row){
                System.out.print(elements + " ");
            }
            System.out.println();
        }

        System.out.println("Array with changes:");
        for(int[] row : arr1){
            for(int elements : row){
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }

}
