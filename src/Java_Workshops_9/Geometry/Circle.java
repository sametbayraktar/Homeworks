package Java_Workshops_9.Geometry;

public class Circle extends Data{
    @Override
    public double getArea() {

        double circleArea = pi * getRadius() * getRadius();

        return circleArea;

    }
}
