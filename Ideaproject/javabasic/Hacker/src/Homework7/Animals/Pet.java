package Homework7.Animals;

public interface Pet {
    String getname();
    default String setName(String name){
        return name;
    }
    void play();
}
