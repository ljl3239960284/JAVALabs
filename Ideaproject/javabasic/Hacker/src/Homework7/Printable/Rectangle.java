package Homework7.Printable;

public class Rectangle implements Printable {
    private double num;
    private int name;

    public Rectangle(int name,double num){
        this.name=name;
        this.num=num;
    }

    public int getname(){
        return name;
    }
    public double getnum(){
        return num;
    }

    @Override
    public void print() {
        System.out.println("Rectangle"+getname()+getnum());
    }
}
