package Java_Workshops_9.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        int number1 = scanInt.nextInt();
        System.out.print("Please enter second number : ");
        int number2 = scanInt.nextInt();

        Sum sum = new Sum();
        System.out.println("Solution of sum : " + sum.calculating(number1, number2));

        Substract minus = new Substract();
        System.out.println("Solution of substract : " + minus.calculating(number1, number2));

        Multiply multiple = new Multiply();
        System.out.println("Solution of multiply : " + multiple.calculating(number1, number2));

        Divide divided = new Divide();
        System.out.println("Solution of divide : " + divided.calculating(number1, number2));


    }
}
