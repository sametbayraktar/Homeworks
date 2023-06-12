package Java_Workshops_9.Geometry;

public class Rectangle extends Data{
    @Override
    public double getArea() {

        double rectangleArea = getLength() * getWidth();

        return rectangleArea;

    }
}
