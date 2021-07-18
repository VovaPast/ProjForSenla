import java.util.Scanner;

public class Task1 {
    public int Triples(String str)  {

            int len = str.length();
            int k = 0;
            for (int i = 0; i < len-2; i++)
            {
                char tmp = str.charAt(i);
                if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                    k++;
            }
            return k;
    }

        public static void main (String[] args)
        {
            Task1 m= new Task1();
            System.out.println("Введите строку ");
            Scanner sc  = new Scanner(System.in);
            String str1 = sc.nextLine();
            System.out.println("Введённая строка: "+str1);
            System.out.println("Количество ''троек'' в строке: "+m.Triples(str1));
        }
}

