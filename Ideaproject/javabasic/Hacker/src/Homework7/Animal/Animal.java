package Homework7.Animal;

public abstract class Animal {
    protected Animal(int legs){
        this.legs = legs;
    }
    protected int legs;

    abstract void eat();

    public void walk(){
        System.out.println("Animal is walking"+legs);
    }

}
