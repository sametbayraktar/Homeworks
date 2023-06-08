package Java_Workshops_1;

import java.util.Scanner;


public class Java_Workshops_1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Question 1 : Write the sum of the 100 numbers entered.

        int total1 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Please enter a number = ");
            int number1 = read.nextInt();
            total1 = total1 + number1;
        }
        System.out.println("Total1 = " + total1);

        //Question 2 : Sum only the positive numbers from the 100 entered numbers.

        int total2 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Please enter a number = ");
            int number2 = read.nextInt();
            if (number2 >= 0)
                total2 = total2 + number2;
            else
                total2 = total2;
        }
        System.out.println("Total2 = " + total2);

        //Question 3 : Sum only the negative numbers from the 100 entered numbers.

        int total3 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Please enter a number = ");
            int number3 = read.nextInt();
            if (number3 < 0)
                total3 = total3 + number3;
            else
                total3 = total3;
        }
        System.out.println("Total3 = " + total3);

        // Question 4 : Write the sum of the numbers up to a number you will receive from the user.

        int total4 = 0;
        System.out.print("Please enter a number = ");
        int number4 = read.nextInt();

        for (int i = 0; i <= number4; i++) {
            total4 = total4 + i;
        }
        System.out.println("Total4 = " + total4);

    }
}
