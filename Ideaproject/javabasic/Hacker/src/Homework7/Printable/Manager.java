package Homework7.Printable;

public class Manager implements Printable {
    private String name;
    private int age;

    public Manager(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public void print(){
        System.out.println("Manager" + getName()+ getAge());
    }

}
