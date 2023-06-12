package Java_Workshops_9.Phones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.print("How many GB of Apple are you requesting? (64 GB / 128 GB) : ");
        String str1 = str.nextLine();
        System.out.print("How many inches of Apple are you requesting? (5.5 inch / 6.5 inch) : ");
        String str2 = str.nextLine();

        Apple applePhone = new Apple();
        int applePrice = applePhone.options(str1, str2);

        System.out.print("How many GB of Samsung are you requesting? (256 GB / 512 GB) : ");
        String str3 = str.nextLine();
        System.out.print("How many inches of Samsung are you requesting? (5.5 inch / 6.5 inch) : ");
        String str4 = str.nextLine();

        Samsung samsungPhone = new Samsung();
        int samsungPrice = samsungPhone.options(str3, str4);

        System.out.println("The total price of the products you add to your cart: " + Phone.getSum(applePrice, samsungPrice));

    }

}
