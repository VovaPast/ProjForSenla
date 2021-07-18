import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

         System.out.print("Ведите предложение: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();


            String vowels = "aeiouAEIOU"; // подсчёт гласных
            int vowelCount = 0;

            String s2 = "";
            s2 = s2 + str.substring(0, 0).toUpperCase(); // начало кода по изменеию буквы
        for (int i = 1; i < str.length(); i++) {

            { char currentChar = str.charAt(i);        // идет поиск и подсчёт гласных в строке
                if (vowels.indexOf(currentChar)>=0)
                    vowelCount++;

            if (" ".equals(str.substring(i-1, i)) && vowels.indexOf(currentChar)>=0){ // проверка первой буквы
                s2 = s2 + str.substring(i, i + 1).toUpperCase();
            }else{
                s2 = s2 + str.substring(i, i+1);
            }
        }}

        System.out.println("Гласных в предложении: " + vowelCount);
       // System.out.println("сортировка по кол-ву гласных:" );
        System.out.println("Предложение: " + s2);

    }


}
