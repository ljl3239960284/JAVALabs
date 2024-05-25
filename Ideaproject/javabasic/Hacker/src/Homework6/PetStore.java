package Homework6;
class Animals{
    public double price = 0;
    public void move(){
        System.out.println("Animals move");
    }
    public void makeSound(){
        System.out.println("Animals makeSound");
    }
}
class Dog extends Animals{
    @Override
    public void makeSound() {
        System.out.println("dog barks");
    }
}
class Cat extends Animals{
    public void move(){
        System.out.println("cat moves");
    }
    public void makeSound(){
        System.out.println("cat meows");
    }
}
class Hamster extends Animals{
    public void makeSound(){
        System.out.println("Hamsters squeak");
    }
}

public class PetStore {

    public static void main(String[] arg){
        Animals aniList[] = {new Dog(),new Cat(),new Hamster(),new Dog()};
        aniList[0].price = 1000;
        aniList[1].price = 2000;
        aniList[2].price = 80;
        aniList[3].price = 3899;

        for(int i=0;i<aniList.length;i++){
            aniList[i].move();
            aniList[i].makeSound();
        }
    }

}
