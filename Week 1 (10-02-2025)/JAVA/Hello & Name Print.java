// Write a Java program to print 'Hello' on screen and your name on a separate line.
// Expected Output :
// Hello
// Alexandra Abramov

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name :-");

        String Name = scanner.nextLine();

        System.out.println("Hello");

        System.out.println(Name);
    }
}