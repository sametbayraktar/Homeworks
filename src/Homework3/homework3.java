package Homework3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Question 1 : Find the sum of the odd numbers out of the 20 numbers that the user will enter.

        int count1 = 0;
        int total1 = 0;
        do{
            System.out.print("Enter a number : ");
            int number1 = read.nextInt();

            if (number1%2 != 0){
                total1=total1+number1;
            }

            count1++;

        }while(count1<20);

        System.out.println("Total is : "+total1);

        //Question 2 : Find out how many of the 20 numbers the user will enter are odd.

        int count2 = 0;
        int countOdd = 0;

        do {
            System.out.print("Enter a number : ");
            int number2 = read.nextInt();

            if (number2 % 2 != 0) {
                countOdd++;
            }

            count2++;

        } while (count2 < 20);

        System.out.println("Count of odd number is : " + countOdd);

        //Question 3 : Find the sum of the numbers up to a number entered by the user.

        int total3 = 0;
        int number3;
        do{
            System.out.print("Enter a number : ");
            number3 = read.nextInt();
            total3=total3+number3;

        }while(number3 != 0);

        System.out.println("Total is : "+total3);

        //Question 4 : Find the sum of the numbers between 10 and 30 of the 20 numbers that the user will enter.

        int count4 = 0;
        int total4 = 0;
        do{
            System.out.print("Enter a number : ");
            int number4 = read.nextInt();

            if (number4>=10 && number4<=30){
                total4=total4+number4;
            }

            count4++;

        }while(count4<20);

        System.out.println("Total is : "+total4);

        //Question 5 : Find out how many of the numbers up to 100 have a ones digit of 5.

        int count5 = 1;
        int countFive = 0;

        do {

            if (count5 % 10 == 5) {
                countFive++;
            }

            count5++;

        } while (count5 <= 100);

        System.out.println("Count of five numbers is : " + countFive);

        //Question 6 : Let's make a number puzzle game! Let the computer pick a number between 10-20 and the user try to find this number.
        // The user has 3 rights to find this number.
        // If he can't know at the end of the 3 rights, he should write "you didn't know" and report the number held. If he knows, write "congratulations".

        int guess = (int) (Math.random()*11+10);
        int count6 = 0;
        System.out.println(guess);

        while(count6<3){
            System.out.print("Enter a number : ");
            int number6 = read.nextInt();
            if (number6 == guess){
                System.out.println("Congratulations!");
                break;}
            count6++;
        }
        System.out.println("You didn't guess! Number is : " + guess);
    }

}
