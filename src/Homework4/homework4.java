package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Question 1 : Create this String. "Removes white space from both ends of a string". Print the number of words in the String.

        String sentence1 = "Removes white space from both ends of a string.";

        String[] words = sentence1.split(" ");
        int count1 = 0;

        for (int i = 0; i <= words.length; i++) {
            count1=i;
        }

        System.out.println("Word count of the sentence is : "+count1);

        //Question 2 : Create a String : "Hello World". Reverse the string and print it.

        String sentence2 = "Hello World";


        for (int i = sentence2.length()-1; i >= 0; i--) {
            System.out.print(sentence2.charAt(i));
        }

        //Question 3 : Create an Int Array and its elements: 25,30,30,35,100 Print the sum of the elements of the Array.

        int[] numbers1 = {25, 30, 30, 35, 100};
        int total = 0;

        for (int i=0; i < numbers1.length; i++) {
            total = total+numbers1[i];
        }

        System.out.println("Numbers total is " +total);

        //Question 4 : Create an int Array and its elements : 13, 15,14,16,16. Print the elements of the array.

        int[] numbers2 = {13,15,14,16,16};

        for (int i = 0; i < numbers2.length; i++){
            System.out.println("Numbers "+i+" element is : " +numbers2[i]);
        }

        //Question 5 : Create a string array and its elements: "New Jersey", "New York", "Boston", "California". Print the number of elements in the Array.

        String[] words5 = {"New Jersey", "New York", "Boston", "California"};
        int count2 = 0;
        for (int i = 0; i < words5.length; i++){
            count2++;
        }
        System.out.println("Words count is :"+count2);

        //Question 6 : Create a String Array and its elements : {Apple, Orange , Babana, Kiwi}. Print all the elements of the array.

        String[] words6 = {"Apple", "Orange", "Banana", "Kiwi"};

        for (int i = 0; i < words6.length; i++){
            System.out.println("Words "+i+" element is : " +words6[i]);
        }

        //Question 7 : Create an int Array and its elements : {12, 14 , 21 ,23 , 10 ,4}. Take the average of the array.

        int[] numbers7 = {12, 14, 21, 23, 10, 4};
        int total7 = 0;

        for (int i = 0; i < numbers7.length; i++) {
            total7 = total7 + numbers7[i];
        }

        System.out.println("Numbers total is " +total7);
        System.out.println("Numbers average is " + (total7 / (numbers7.length)));

        //Question 8 : Create an int Array and its elements : {5,6,8,12,14,19}. Add if the number is even, subtract if it is odd.

        int[] numbers8 = {5, 6, 8, 12, 14, 19};
        int total8 = 0;

        for (int i = 0; i < numbers8.length; i++) {

            if (numbers8[i] % 2 == 0)
                total8 = total8 + numbers8[i];
            else
                total8 = total8 - numbers8[i];
        }
        System.out.println("Numbers total is " + total8);

        //Question 9 : Create an int Array and its elements : {15 , 25, 22, 18, 30}. Write a program that prints the 2nd largest element in the array.

        int[] numbers9 = {15, 25, 22, 18, 30};
        Arrays.sort(numbers9);
        System.out.println("2nd largest element is : "+numbers9[numbers9.length-2]);

        //Question 10 : Create an int Array and its elements : {14 , 19 , 5 , 21}. Print the smallest number.

        int[] numbers10 = {14, 19, 5, 21};
        Arrays.sort(numbers10);
        System.out.println("Smallest number is : "+numbers10[0]);

        //Question 11 : Create an int Array and its elements : {12,2,5,15,8}. Print the largest value.

        int[] numbers11 = {12, 2, 5, 15, 8};
        Arrays.sort(numbers11);
        System.out.println("Largest number is : "+numbers11[numbers11.length-1]);

        //Question 12 : Create a string array and its elements: {Apple , Orange , Banana , Pineapple}. Check if apple element belongs to this Array. Turn "true" if it belongs. Use loops.

        String[] words12 = {"Apple", "Orange", "Banana", "Pineapple"};
        for (int i = 0; i < words12.length; i++){
            boolean isEqual = words12[i].equals("Apple");
            System.out.println("This array contains is Apple : "+isEqual);
            break;
        }
        //System.out.println(Arrays.binarySearch(words12,"Apple"));

        //Question 13 : Create a String like this: {"$12 $23 $10 $2 $5 $2"}. Remove the $ signs and add the numbers. Print the sum of the numbers.

        String dollars = "$12 $23 $10 $2 $5 $2";
        String dollarsRep = dollars.replace("$","");
        String dollarsSpa = dollarsRep.replace(" ", ",");
        String[] dollarsStrArray = dollarsSpa.split(",");
        System.out.println(Arrays.deepToString(dollarsStrArray));
        System.out.println(dollarsStrArray[0]);

        int total13 = 0;
        int[] dollarsIntArray = new int[dollarsStrArray.length];

        for (int i = 0; i < dollarsStrArray.length; i++){
            dollarsIntArray[i] = Integer.parseInt((dollarsStrArray[i]));
        }
        for (int j = 0; j < dollarsStrArray.length; j++) {
            total13 = total13 + dollarsIntArray[j];
        }
        System.out.println("Dollars total is : " + total13);

    }
}
