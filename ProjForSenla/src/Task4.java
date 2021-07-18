import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        float n = sc.nextFloat();
        double root = Math.sqrt(n);
        int i = 2;

        if (n > 0) {

            if (n % 1 == 0) {


                while (n > 1 && i <= root) {
                    if (n % i == 0) {
                        System.out.println(i + "");
                        n /= i;
                    } else if (i == 2) {
                        i++;
                    } else {
                        i += 2;
                    }
                }


                if (n != 1) {
                    System.out.print(Math.round(n));
                }

            } else {
                System.out.println("             ERROR      ");
                System.out.println(" P.S.Сказано же << Введите ЦЕЛОЕ >>  ");
            }
        } else { System.out.println("Целое число является положительным, т.е. должно быть > 0"); }
    }
}
