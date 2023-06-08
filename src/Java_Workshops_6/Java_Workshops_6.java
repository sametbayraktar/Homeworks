package Java_Workshops_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java_Workshops_6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Question 1 : Create a 2D int Array that looks like this. [{2,3,2} , {4,1,5} , {7,2,5}] Replace all 2's with 6. Print the array.

        int[][] array2D1 = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};

        for (int i = 0; i < array2D1.length; i++) {

            for (int j = 0; j < array2D1[i].length; j++) {

                if (array2D1[i][j] == 2) {
                    array2D1[i][j] = 6;
                }
            }
        }
        System.out.println(Arrays.deepToString(array2D1));

        //Question 2 : Create a 2D int Array that looks like this. [{5,2,1} , {10,2,3,6} , {1,2}] Sum the elements in 2D array. Print the total.

        int[][] array2D2 = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int total = 0;


        for (int i = 0; i < array2D2.length; i++) {

            for (int j = 0; j < array2D2[i].length; j++) {

                total += array2D2[i][j];
            }
        }
        System.out.println("Total of the elements in array2D2 : " + total);

        //Question 3 : Create a 2D String Array as below. [{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"}, {"ohio","new york"}]. Replace all ohio with Florida. Print the array.

        String[][] array2D3 = {{"New Jersey", "Atlanta", "Ohio"}, {"Pittsburgh", "Ohio", "New York", "Ohio"}, {"Ohio", "New York"}};

        for (int i = 0; i < array2D3.length; i++) {

            for (int j = 0; j < array2D3[i].length; j++) {

                if (array2D3[i][j].equalsIgnoreCase("Ohio")) {

                    array2D3[i][j] = "Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(array2D3));

        //Question 4 : Create a 2d array [][] and its elements = [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ] . Load an arrayList of all elements and print that arrayList.

        int[][] array2D4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> array4 = new ArrayList<>();
        //int[] array5 = new int[6];
        for (int i = 0; i < array2D4.length; i++) {

            for (int j = 0; j < array2D4[i].length; j++) {

                //Arrays.fill(array5, array2D4[i][j]);
                array4.add(array2D4[i][j]);
            }
        }
        System.out.println(array4);
        //System.out.println(Arrays.toString(array5));

        //Question 5 : Create a method that is called getCount(). One String ArrayList and one String as parameters. Return type must be int. Specify how many times a value in ArrayList is repeated and return.

        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Kiwi", "Orange", "Mango"));

        String str = "Orange";

        System.out.println(getCount(strArray, str));

        int result = getCount(strArray, str);
        System.out.println(result);

        //Question 6 : Create a method that is called getSum(). One Arraylist as parameters. Return tipi int olmalı. ArrayList teki tüm sayıları birbiri ile toplayın. return olarak toplam sonucu döndürün.

        ArrayList<Integer> array6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(getSum(array6));

        //Question 7 :

        ArrayList<String> array7 = new ArrayList<>(Arrays.asList("Istanbul", "Bursa", "Ankara", "Trabzon", "Izmir"));

        System.out.println(getLength(array7));

        //Question 8 :

        ArrayList<String> array8 = new ArrayList<>(Arrays.asList("Blue", "Yellow", "Red", "Brown", "Blue"));

        String str1 = "Blue";

        String str2 = "Purple";

        System.out.println(changeArrayList(array8, str1, str2));

        //Special Question

        int xalt = -2;
        int xust = 8;
        int yalt = 1;
        int yust = 4;

        System.out.print("Lütfen x koordinatını giriniz : ");
        int x = read.nextInt();
        System.out.print("Lütfen y koordinatını giriniz : ");
        int y = read.nextInt();

        if (x > xalt && x < xust && y > yalt && y < yust){
            System.out.println("İçinde");
        } else if ((x < xalt || x > xust || y < yalt || y > yust)) {
            System.out.println("Dışında");
        }
        else
            System.out.println("Üzerinde");
    }

    public static int getCount(ArrayList<String> strArray, String str) {

        int count = 0;

        for (String s : strArray) {

            if (s.equals(str))
                count++;
        }

        return count;
    }

    public static int getSum(ArrayList<Integer> array6) {

        int total = 0;

        for (int i : array6)
            total += i;

        return total;
    }

    public static ArrayList<Integer> getLength(ArrayList<String> array7) {

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String s : array7)
            lengths.add(s.length());

        return lengths;
    }

    public static ArrayList<String> changeArrayList(ArrayList<String> array8, String str1, String str2) {

        ArrayList<String> finalList = new ArrayList<>();

        for (String s : array8) {
            if (s.equals(str1)) {
                s = str2;
            }
            finalList.add(s);
        }
        return finalList;
    }
}
