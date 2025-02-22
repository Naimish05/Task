import java.util.Scanner;

class Sum{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number :-");
        int Num1 = scanner.nextInt();

        System.out.println("Enter Second Number :-");
        int Num2 = scanner.nextInt();

        int Sum = Num1 + Num2 ;

        System.out.println("Sum Of " + Num1 + " & " + Num2 + " Is " + Sum);
    }
}