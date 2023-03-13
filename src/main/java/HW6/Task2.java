package HW6;

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "Перестановочный алгоритм быстрого действия";
        String s2 = "Перевыборы выбранного президента";
        String s3 = "Посмотрите как Рите нравится ритм";
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        int count2 = 0;

        //Output all "о" letters in the string
        System.out.println("1. Output all 'o' letters in the string s1 = \"Перестановочный алгоритм быстрого действия\"");
        System.out.print("Result: ");
        for(int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == 'о'){
                System.out.print(s1.charAt(i));
            }
        }

        //Output amount of the  "e" letters in the string
        System.out.println("\n\n2. Given String s2 = \"Перевыборы выбранного президента\"");
        for (int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) == 'е'){
                count += 1;
            }
        }
        System.out.println("Amount of 'e' letters in the string = " + count);


        //Find all index of the substring 'рит' in the string
        System.out.println("\n\n3. Find all index of the substring 'рит' in the string s3 = \"Посмотрите как Рите нравится ритм\"");
        int n = -1;
        s3 = s3.toLowerCase();
        while (( n = s3.indexOf("рит", n+1)) >= 0) {
            System.out.println(n);
        }

        // To calculate the number of strings without 'e' character in the given 2D array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j].contains("е")){
                } else {
                    count2++;
                }
            }
        }
        System.out.println("\n4. The number of strings without 'e' character in thr array of strings = {{\"Привет\", \"всем\", \"кто\"}, {\"изучает\", \"язык\", \"программирования\"}, {\"java\"}}");
        System.out.print("Result = " + count2);
    }
}
