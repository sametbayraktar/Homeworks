package Homework2;

import java.util.Locale;

public class homework2 {
    public static void main(String[] args) {

        // Question 1 : *I love java* Print the total number of characters for this sentence.

        String sentence1 = "I love java";
        System.out.println("Total character count of the sentence is = " + sentence1.length());

        // Question 2 : *Sprint planning* Print the total number of characters for this sentence.

        String sentence2 = "Sprint planning";
        System.out.println("Total character count of the sentence is = " + sentence2.length());

        // Question 3 : Create a string like "apple". Verify if the String contains **App**.

        String word1 = "Apple";
        System.out.println("word1.contains(\"App\") = " + word1.contains("App"));

        // Question 4 : Create a String of the word **orange**. Verify if String is equal to **Apple**.

        String word2 = "Orange";
        System.out.println("word2.equalsIgnoreCase(\"Apple\") = " + word2.equalsIgnoreCase("Apple"));

        // Question 5 : Create a String of the word **apple**. Verify if String is equal to **Apple**.

        String word3 = "apple";
        System.out.println("word3.equalsIgnoreCase(\"Apple\") = " + word3.equalsIgnoreCase("Apple"));

        // Question 6 : Create a String of the word **Florida**. Print the index with only the letter **'o'** in the word Florida.

        String word4 = "Florida";
        System.out.println("word4.indexOf('o') = " + word4.indexOf('o'));

        // Question 7 : Create a String of the word **Thank you**. Print the index with only the letter **'y'** in the Thank you.

        String word5 = "Thank you";
        System.out.println("word5.indexOf('y') = " + word5.indexOf('y'));

        // Question 8 : Create a String of the word **Mouse**. Print the character in the 3rd row of the **mouse** string.

        String word6 = "Mouse";
        System.out.println("word6.charAt(2) = " + word6.charAt(2));

        // Question 9 : Create a String of the word **paper**. To turn upper case the string and print it.

        String word7 = "paper";
        System.out.println("word7.toUpperCase(Locale.ROOT) = " + word7.toUpperCase(Locale.ROOT));

        // Question 10 : Create a String of the word **OraNge**. To turn lower case the string and print it.

        String word8 = "OraNge";
        System.out.println("word8.toLowerCase() = " + word8.toLowerCase());

        // Question 11 : Create a String of the word **New Jersey**. To turn upper case the string and print it.

        String word9 = "New Jersey";
        System.out.println("word9.toUpperCase() = " + word9.toUpperCase());

        // Question 12 : Create a String of the word **New York**. To turn lower case the string and print it.

        String word10 = "New York";
        System.out.println("word10.toLowerCase() = " + word10.toLowerCase());

        // Question 13 : Create a String of the word **PADDLE**. To turn lower case the string and print it.

        String word11 = "PADDLE";
        System.out.println("word11.toLowerCase() = " + word11.toLowerCase());
    }
}
