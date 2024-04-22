package Homework7.ShapeAndItsSubclasses;

public abstract class Shape {
    public abstract double area();

    public String toString() {
        return "The area is " + area();
    }
}