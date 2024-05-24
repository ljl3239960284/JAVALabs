package Homework11.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>(5);
        alist.add("Red");
        alist.add("Green");
        alist.add("Orange");
        alist.add("White");
        alist.add("Black");
        System.out.println(alist);
    }
}
