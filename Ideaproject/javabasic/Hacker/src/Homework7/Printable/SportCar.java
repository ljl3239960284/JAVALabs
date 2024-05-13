package Homework7.Printable;

public class SportCar implements Printable {
    private String name;
    private int num;

    public SportCar(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName(){
        return name;
    }

    public int getNum(){
        return num;
    }

    @Override
    public void print(){
         System.out.println("This is a sport car named " + getName() + " with " + getNum() + " doors.");
    }

}
