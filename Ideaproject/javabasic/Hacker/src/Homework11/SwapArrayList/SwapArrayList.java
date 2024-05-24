package Homework11.SwapArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>(5);
        alist.add("Red");
        alist.add("Green");
        alist.add("Black");
        alist.add("White");
        alist.add("Pink");

        System.out.println("Array list before Swap: ");
        for(String s : alist){
            System.out.println(s);
        }

        Collections.swap(alist,0,2);

        System.out.println("Array list after swap: ");
        for(String s : alist){
            System.out.println(s);
        }


    }
}
