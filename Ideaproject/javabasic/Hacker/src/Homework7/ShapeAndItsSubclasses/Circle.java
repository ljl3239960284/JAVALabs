package Homework7.ShapeAndItsSubclasses;

class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
