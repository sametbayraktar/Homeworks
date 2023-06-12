package Java_Workshops_9.Geometry;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Circle's area is : " + circle.getArea());

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle's area is : " + rectangle.getArea());
    }
}
