import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int liczba = 5;
//        int liczba2 = 2;
////        System.out.print("Hello world"+liczba);
////
////        System.out.println(liczba%liczba2);
////
////        String name = "Zuza ";
////        int age = 30;
////        System.out.println("My name is " + name + "and i am "+ age);
////
////
////
//        String account = " ZuzaWarminska ";
//        account.length();
//        System.out.println(account.length());
//
//        System.out.println(account.indexOf('r'));
//
//        System.out.println(account.substring(0,5));
//
//        System.out.println(account.trim());
//
//        System.out.println(account.length());
//
//        char a = 'a';
//        char alpha = '\u03B1';
//        System.out.println(alpha);
//
//        char[] witaj = {'w','i','t','a','j'};
//        System.out.println(witaj);
//        Character.isDigit(a);
//        System.out.println(Character.isDigit(a));
//
//        if (liczba>liczba2 | liczba2==liczba){
//            System.out.println("program_dziala");
//        }else{
//            System.out.println("program_niedziala");
//            if (liczba==liczba2){
//                System.out.println("system_dziala");
//            }
//        }
// }
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String userInputName = skaner.nextLine();
        System.out.println("Podaj nazwisko");
        String userInputSurname = skaner.nextLine();
        System.out.println("Witaj" + userInputName + " " + userInputSurname +"!");


    }
}
