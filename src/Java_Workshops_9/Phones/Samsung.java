package Java_Workshops_9.Phones;

public class Samsung extends Phone{
    @Override
    public int options(String str3, String str4) {

        int cartSamsung = 0;

        if (str3.contains("256") && str4.contains("5.5")){
            cartSamsung = 1000;
        } else if (str3.contains("256") && str4.contains("6.5")) {
            cartSamsung = 1200;
        } else if (str3.contains("512") && str4.contains("5.5")) {
            cartSamsung = 1300;
        }
        else if (str3.contains("512") && str4.contains("6.5")){
            cartSamsung = 1400;
        }
        else
            System.out.println("There is no phone with these features.");

        return cartSamsung;
    }
}
