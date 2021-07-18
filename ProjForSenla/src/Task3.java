import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Введите координаты для первого вектора x1 и y1 затем x2 и y2 (начальные и конечные)");
        int x11 = sc.nextInt();
        int y11 = sc.nextInt();
        int x12 = sc.nextInt();
        int y12 = sc.nextInt();

        System.out.println("Введите координаты для второго вектора x1 и y1 затем x2 и y2  (начальные и конечные)");
        int x21 = sc.nextInt();
        int y21 = sc.nextInt();
        int x22 = sc.nextInt();
        int y22 = sc.nextInt();

        double a1 =   (x12 - x11)*(x12 - x11) + (y12 - y11)*(y12 - y11);
        double a2 =   (x22 - x21)*(x22 - x21) + (y22 - y21)*(x22 - x21);

        System.out.println("Длинна первого вектора " + Math.sqrt(a1) );
        System.out.println("Длинна второго вектора " + Math.sqrt(a2) );

        int a1VecX = (x12 - x11); // первый вектор
        int a1VecY = (y12 - y11);

        int a2VecX = (x22 - x21); // второй вектор
        int a2VecY = (y22 - y21);

        // c = x31*x32 + y31*y32 ...  ab=x1x2+y1y2 -> c==d

        int c = a1VecX * a2VecX + a1VecY * a2VecY;
        int d = a2VecX * a1VecX + a2VecY * a1VecY;

        System.out.println("Вектор произведения первого вектора на второй " + c );
        System.out.println("Вектор произведения второго вектора на первый " + d );

        int x31 = a1VecX;
        int y31 = a1VecY;
        int x32 = a2VecX;
        int y32 = a2VecY;

        int x41 = a1VecY;
        int y41 = a1VecX;
        int x42 = a2VecY;
        int y42 = a2VecX;

        System.out.println("Первый вектор, его " + "начало ("+x11+","+y11+")"+" и конец ("+x12+","+y12+ ")");
        System.out.println("Второй вектор, его " + "начало ("+x21+","+y21+")"+" и конец ("+x22+","+y22+ ")");
        System.out.println("Третий вектор (1*2), его " + "начало ("+x31+","+y31+")"+" и конец ("+x32+","+y32+ ")");
        System.out.println("Четвертый вектор (2*1), его " + "начало ("+x41+","+y41+")"+" и конец ("+x42+","+y42+ ")");




    }

}
