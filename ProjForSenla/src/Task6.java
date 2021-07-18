import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String n = sc.nextLine();
        int l = n.length( );

            for (int i = 0; i < l; i++) {
                char Char = n.charAt(i);
                String num0 = "0";
                String num1 = "1";
                String num2 = "2";
                String num3 = "3";
                String num4 = "4";
                String num5 = "5";
                String num6 = "6";
                String num7 = "7";
                String num8 = "8";
                String num9 = "9";

                if(num0.indexOf(Char)>=0 ){
                   number0();
                }else if (num1.indexOf(Char)>=0){
                    number1();
                }else if (num2.indexOf(Char)>=0){
                    number2();
                }else if (num3.indexOf(Char)>=0){
                    number3();
                }else if (num4.indexOf(Char)>=0){
                    number4();
                }else if (num5.indexOf(Char)>=0){
                    number5();
                }else if (num6.indexOf(Char)>=0){
                    number6();
                }else if (num7.indexOf(Char)>=0){
                    number7();
                }else if (num8.indexOf(Char)>=0){
                    number8();
                }else if (num9.indexOf(Char)>=0){
                    number9();
                }
            }
    }

    static void number0(){
        System.out.println("            ");
        System.out.println("   "+0+0+0+0);
        System.out.println(" "+0+"     0"+0);
        System.out.println(" "+0+"    0 "+0);
        System.out.println(" "+0+"   0  "+0);
        System.out.println(" "+0+"  0   "+0);
        System.out.println(" "+0+" 0    "+0);
        System.out.println("   "+0+0+0+0);
        System.out.println("            ");
    }
    static void number1(){
        System.out.println("            ");
        System.out.println(""+1111111);
        System.out.println("   "+1);
        System.out.println("   "+1);
        System.out.println("   "+1);
        System.out.println("   "+1);
        System.out.println("   "+1);
        System.out.println(""+1111111);
        System.out.println("            ");
    }
    static void number2(){
        System.out.println("            ");
        System.out.println(""+2222222);
        System.out.println(" "+2+"   "+2);
        System.out.println(" "+2+"   "+2);
        System.out.println(" "+2+"   "+2);
        System.out.println(" "+2+"   "+2);
        System.out.println(" "+2+"   "+2);
        System.out.println(""+2222222);
        System.out.println("            ");
    }

    static void number3(){
        System.out.println("            ");
        System.out.println(3333333);
        System.out.println(" "+3+" "+3+" "+3);
        System.out.println(" "+3+" "+3+" "+3);
        System.out.println(" "+3+" "+3+" "+3);
        System.out.println(" "+3+" "+3+" "+3);
        System.out.println(" "+3+" "+3+" "+3);
        System.out.println(3333333);
        System.out.println("            ");
    }
    static void number4(){
        System.out.println("            ");
        System.out.println("4444444444");
        System.out.println(" "+4+"  "+4+"   "+4);
        System.out.println(" "+4+"  "+4+"   "+4);
        System.out.println(" "+4+"   "+4+" "+4);
        System.out.println(" "+4+"   "+4+" "+4);
        System.out.println(" "+4+"    "+4);
        System.out.println("4444444444");
        System.out.println("            ");
    }
    static void number5(){
        System.out.println("            ");
        System.out.println("555555555");
        System.out.println(" "+5+"     "+5);
        System.out.println(" "+5+"     "+5);
        System.out.println("  "+5+"   "+5);
        System.out.println("   "+5+" "+5);
        System.out.println("    "+5);
        System.out.println("555555555");
        System.out.println("            ");
    }
    static void number6(){
        System.out.println("            ");
        System.out.println("66666666666");
        System.out.println(" "+6+"     "+6+" "+ 6);
        System.out.println(" "+6+"     "+6+" "+ 6);
        System.out.println("  "+6+"   "+6+"  "+ 6);
        System.out.println("   "+6+" "+6+"   "+ 6);
        System.out.println("    "+6+"    "+ 6);
        System.out.println("66666666666");
        System.out.println("            ");
    }
    static void number7(){
        System.out.println("            ");
        System.out.println("7777777777777");
        System.out.println(" "+7+"     "+7+" "+ 7+" "+ 7);
        System.out.println(" "+7+"     "+7+" "+ 7+" "+ 7);
        System.out.println("  "+7+"   "+7+"  "+ 7+" "+ 7);
        System.out.println("   "+7+" "+7+"   "+ 7+" "+ 7);
        System.out.println("    "+7+"    "+ 7+" "+ 7);
        System.out.println("7777777777777");
        System.out.println("            ");
    }
    static void number8(){
        System.out.println("            ");
        System.out.println("888888888888888");
        System.out.println(" "+8+"     "+8+" "+ 8+" "+ 8+" "+ 8);
        System.out.println(" "+8+"     "+8+" "+ 8+" "+ 8+" "+ 8);
        System.out.println("  "+8+"   "+8+"  "+ 8+" "+ 8+" "+ 8);
        System.out.println("   "+8+" "+8+"   "+ 8+" "+ 8+" "+ 8);
        System.out.println("    "+8+"    "+ 8+" "+ 8+" "+ 8);
        System.out.println("888888888888888");
        System.out.println("            ");
    }
    static void number9(){
        System.out.println("            ");
        System.out.println("9999999999");
        System.out.println(" "+9+"  "+9+"   "+9);
        System.out.println(" "+9+"   "+9+" "+9);
        System.out.println(" "+9+"    "+9);
        System.out.println(" "+9+"   "+9+" "+9);
        System.out.println(" "+9+"  "+9+"   "+9);
        System.out.println("9999999999");
        System.out.println("            ");
    }
}
