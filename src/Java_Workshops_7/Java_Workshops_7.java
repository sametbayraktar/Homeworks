package Java_Workshops_7;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Workshops_7 {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        //Question 1 : Create a method named **randomNum**. Parameter is **int max**. This method should return a random value between 0 and max. Print the random number.

        System.out.print("Please enter a number : ");
        int max = scanInt.nextInt();
        System.out.println("The random number is = " + randomNum(max));

        //Question 2 : Create a method named **middleWord**. This method must take String parameters. He must find the words in the middle of the sentence or string. Return the middle word.
        System.out.print("Please enter a sentence has at least 3 words. : ");
        String sentence2 = scanStr.nextLine();
        System.out.println("The middle word of this sentence is = " + middleWord(sentence2));

        //Question 3 : Create a method named **reverseString**. This method must take String parameters. This method must write String in reverse.

        System.out.print("Please enter a sentence : ");
        String sentence3 = scanStr.nextLine();
        System.out.println("The reverse of this sentence is = " + reverseString(sentence3));

        //Question 4 : Create a method named **reverseWord**. This method must take String parameters. This method must write String's words in reverse.
        System.out.print("Please enter a sentence : ");
        String sentence4 = scanStr.nextLine();
        System.out.println("The reverse of this sentence's words is = " + reverseString(sentence4));

        //Question 5 : Create a method named **EvenOddNum**. This method must take String parameters. There will be 10 digit numbers like "1234567890" in this String. Take each digit of the numbers and add if the digit is even, subtract if it is odd. Print the total result.

        System.out.print("Please enter a 10 digit numbers : ");
        String digitNumbers = scanStr.nextLine();
        System.out.println("Total of 10 digit numbers' members = " + EvenOddNum(digitNumbers));

        //Question 6 : Write a method that reverses an entered array.
        int[] numbers6 = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Please enter a number : ");
            int number6 = scanInt.nextInt();
            numbers6[i] = number6;
        }

        int[] reverseArray = reverseArray(numbers6);
        System.out.println("Reverse of array is : "+ Arrays.toString(reverseArray));

        //Question 7 : Create a method named **powerOfThree**. This method must take int parameters. This method should return boolean.

        System.out.print("Please enter a number : ");
        int number7 = scanInt.nextInt();
        System.out.println("Is "+number7+" one of the powers of 3 : "+powerOfThree(number7));

        //Question 8 : Create a method named **append**. This method must take two int[] parameters. This method should return a new array containing the result of appending the values of the second array to the end of the first array.

        int[] array1 = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Please enter a number : ");
            array1[i] = scanInt.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Please enter a number : ");
            array2[i] = scanInt.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(append(array1,array2)));

        //Question 9 : Create a method named **isUnique**. This method must take int[] parameter. This method should return a boolean value indicating whether the values in this array are unique.

        int[] array9 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number : ");
            array9[i] = scanInt.nextInt();
        }
        System.out.println(Arrays.toString(array9));
        System.out.println(isUnique(array9));
    }

    public static int randomNum(int max) {

        int rndm = (int) (Math.random() * max);

        return rndm;
    }

    public static String middleWord(String sentence2) {

        String[] words = sentence2.split(" ");
        String midWord = words[words.length / 2];

        return midWord;
    }

    public static String reverseString(String sentence3) {
        String reverseSentence = null;
        for (int i = sentence3.length() - 1; i >= 0; i--) {

        }
        return reverseSentence;
    }

    public static String reverseWord(String sentence4) {
        String reverseWords = null;

        return reverseWords;
    }

    public static int EvenOddNum(String digitNumbers) {

        int total = 0;

        String[] numbers5Str = digitNumbers.split("");
        int[] numbers5Int = new int[numbers5Str.length];

        for (int i = 0; i < numbers5Str.length; i++) {
            numbers5Int[i] = Integer.parseInt(numbers5Str[i]);
        }

        for (int j = 0; j < numbers5Int.length; j++) {

            if (numbers5Int[j] % 2 == 0)
                total += numbers5Int[j];
            else
                total -= numbers5Int[j];
        }

        return total;
    }

    public static int[] reverseArray(int[] numbers6) {

        int[] reverse = new int[numbers6.length];

        for (int i = numbers6.length; i >= 0; i--) {

            reverse[numbers6.length - i] = numbers6[i];

        }

        return reverse;
    }

    public static boolean powerOfThree(double number7) {

        boolean cubeRoot;

        int power = (int) Math.pow(number7, 1.0 / 3);

        if (power == 3)
            cubeRoot = true;
        else
            cubeRoot = false;

        return cubeRoot;
    }

    public static int[] append(int[] array1, int[] array2) {

        int[] appendedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            appendedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            appendedArray[array1.length + j] = array2[j];
        }
        return appendedArray;
    }

    public static boolean isUnique(int[] array9){
        boolean isUnique = false;
        int count = 1;
        for (int i = 0; i < array9.length; i++){
            for (int j = count; j < array9.length; j++ ){
                if (array9[i] != array9[j])
                    isUnique = true;
                else
                    isUnique = false;
            }
            count++;
        }

        return isUnique;
    }
}
