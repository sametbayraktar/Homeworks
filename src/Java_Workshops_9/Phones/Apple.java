package Java_Workshops_9.Phones;

public class Apple extends Phone{

    @Override
    public int options(String str1, String str2) {

        int cartApple = 0;

        if (str1.contains("64") && str2.contains("5.5")){
            cartApple = 750;
        } else if (str1.contains("64") && str2.contains("6.5")) {
            cartApple = 850;
        } else if (str1.contains("128") && str2.contains("5.5")) {
            cartApple = 950;
        }
        else if (str1.contains("128") && str2.contains("6.5")){
            cartApple = 1200;
        }
        else
            System.out.println("There is no phone with these features.");

        return cartApple;
    }
}
