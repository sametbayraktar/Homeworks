package Java_Workshops_5;

import java.util.Scanner;

public class Java_Workshops_5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Question 1 : Write a code to print all even numbers between 0 and 100. Note: 0 to 100 is also included.

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers = " + i);
            }
        }

        //Question 2 : Write a code to print all odd numbers between 0 and 100.

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers = " + i);
            }
        }

        //Question 3 : Write a code to print all odd numbers from 100 to 0.

        for (int i = 100; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers = " + i);
            }
        }

        //Question 4 : Write a code to calculate the sum of the first 10 natural numbers.

        int total4 = 0;

        for (int i = 0; i <= 10; i++) {
            total4 = total4 + i;
        }
        System.out.println("The sum of the first 10 natural numbers = " + total4);

        //Question 5 : Write a code that covers the numbers between 0 and 100. This code should be a code that can determine whether these numbers are odd or even.

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is a even number = " + i);
            }
            else
                System.out.println("This is a odd number = " + i);
        }

        //Question 6 : Print all numbers between 0 and 100 that are divisible by both 5 and 4.

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 == 0) {
                System.out.println("This number is divisible by both 5 and 4 = " + i);
            }
        }

        //Question 7 : Write a code in which you can create # whole, whose length and width are determined by the person who wrote it.

        System.out.print("Write a number for length : ");
        int length = read.nextInt();
        System.out.print("Write a number for width : ");
        int width = read.nextInt();

        for (int row = 0; row <= length; row++){
            for (int column = 0; column <= width; column++){
                System.out.print("#");
            }
            System.out.println("");
        }

        //Question 8 : Write a code where you can create a pyramid with asterisks (*).

        System.out.print("Write a number for tree : ");
        int tree = read.nextInt();

        for (int i = 1; i <= tree; i++){
            for (int j = i; j < tree; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Question 9 : Write a code where you can create equilateral pyramid with asterisks (*).

        System.out.print("Write a number for tree : ");
        int treeRow = read.nextInt();

        for (int i = 1; i <= treeRow; i++){
            for (int j = i; j < treeRow; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        //Question 10 : Print all even numbers between 0 and 30 using the Do While loop.

        int range = 0;

        do {
            if ( range % 2 != 0) {
                System.out.println("Odd numbers = " + range);
            }
            range++;
        }while (range<30);
    }
}
