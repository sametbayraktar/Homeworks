package SpecialQuestions1;

import java.util.Locale;
import java.util.Scanner;

public class specialQuestions1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Question 1 : Combine the names and surnames entered separately by putting a space between them.

        System.out.print("Please enter your name : ");
        String name1 = read.nextLine();
        System.out.print("Please enter your surname : ");
        String surname1 = read.nextLine();
        System.out.println("Name and surname : " +name1 + " " + surname1);

        // Question 2 : Print whether a entered word is empty or not.
        
        System.out.print("Please enter a word : ");
        String word1 = read.nextLine();
        System.out.println("word1.equals(\"\") = " + word1.equals(""));

        // Question 3 : Find the number of letters A in a sentence entered. (Without case distinction)

        System.out.print("Please enter a sentence : ");
        String sentence1 = read.nextLine();
        String sentence1Lower = sentence1.toLowerCase(Locale.ROOT);
        String sentence1Justa = sentence1Lower.replace("a", "");
        System.out.println("This sentence contains \"a\" : "+ ((sentence1Lower.length())-(sentence1Justa.length())));

        // Question 4 : Find the first and last letter of a entered word.

        System.out.print("Please enter a word : ");
        String word2 = read.nextLine();
        System.out.println("First and last letters of this word is : "+word2.charAt(0)+", "+word2.charAt(word2.length()-1));
        
        // Question 5 : Print the first word in an entered sentence.

        System.out.print("Please enter a sentence : ");
        String sentence2 = read.nextLine();
        int indexSpace = sentence2.indexOf(" ");
        System.out.println("indexSpace = " + indexSpace);
        System.out.println("First word of this sentence is : "+sentence2.substring(0,indexSpace));

        // Question 6 : Print the first two words in a sentence of at least 3 words entered.

        System.out.print("Please enter a sentence : ");
        String sentence3 = read.nextLine();
        int indexSpace1 = sentence3.indexOf(" ");
        System.out.println("indexSpace1 = " + indexSpace1);
        int indexSpace2 = sentence3.indexOf(" ", indexSpace1+1);
        System.out.println("indexSpace2 = " + indexSpace2);
        System.out.println("First two words of this sentence is : " + sentence3.substring(0, indexSpace2));

        // Question 7 : Find how many words are in a given sentence.

        System.out.print("Please enter a sentence : ");
        String sentence4 = read.nextLine();
        String sentence4NoSpace = sentence4.replace(" ","");
        System.out.println("This sentence has "+(sentence4.length()-sentence4NoSpace.length()+1)+" words.");

        // Question 8 : Print first letters (A.B.C.) of name that is 3 words.

        System.out.print("Please enter your full name : ");
        String sentence5 = read.nextLine();
        int indexSpace3 = sentence5.indexOf(" ");
        int indexSpace4 = sentence5.indexOf(" ", indexSpace3+1);
        System.out.println("First two words of this sentence is : " + sentence5.substring(0, 1)+"."+sentence5.substring(indexSpace3+1,indexSpace3+2)+"."+sentence5.substring(indexSpace4+1,indexSpace4+2));

    }
}
