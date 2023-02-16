package specialQuestions2;

import java.util.Scanner;

public class specialQuestions2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Question 1 : Find the ones, tens and hundreds digits of a 3 digits number entered.

        System.out.print("Please enter a 3 digits number : ");
        int number1 = read.nextInt();

        do {
            int digits = number1%10;
            number1=number1/10;
            System.out.print("Digit is " + digits + ", ");
        }while (number1!=0);

        // Question 2 : Find how many digits a given number has.

        System.out.print("Please enter a number : ");
        int number2 = read.nextInt();
        int count2 = 0;

        do {
            int digits = number2 % 10;
            number2 = number2 / 10;
            count2++;
        } while (number2 != 0);
        System.out.print("Digit count is " + count2);

        // Question 3 : Find the opposite number of an entered number, that is, if 124 is entered, the number 421 will be obtained.

        System.out.print("Please enter a number : ");
        int number3 = read.nextInt();

        do {
            System.out.print(number3%10);
            number3 /= 10;

        } while (number3 != 0);

        // Question 4 : Find whether a given number is the same as its inverse. So check if it is a symmetric number.

        int smtrcNum = 0;

        System.out.print("Please enter a number : ");
        int number4 = read.nextInt();
        int orginalNum = number4;

        do {
            smtrcNum *= 10;
            smtrcNum += number4%10;
            number4 /= 10;

        } while (number4 != 0);

        if (orginalNum == smtrcNum)
            System.out.println("Number is simetric! => "+orginalNum+ " = "+smtrcNum);
        else
            System.out.println("Number is not simetric! => "+orginalNum+ " != "+smtrcNum);
    }
}
