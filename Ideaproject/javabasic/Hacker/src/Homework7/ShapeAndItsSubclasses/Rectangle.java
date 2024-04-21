package Homework7.ShapeAndItsSubclasses;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double area()
    {
        return length * width;
}
public abstract class Shape
{
    public abstract double area();
    public String toString()
    {
        return “The area is ” + area();
    }
}
