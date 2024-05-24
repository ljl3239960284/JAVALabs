package Homework11.ClassTest;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        /* Vector of initial capacity (size) of 2 */
        Vector<String> vec = new Vector<>(2);

        /* Adding elements to a vector */
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /* Check size and default capacity increment */
        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");

        /* Size and capacityIncrement after two insertions */
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());

        /* Display Vector elements */
        Enumeration<String> en = vec.elements();
        System.out.println("Elements are:");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
    }
}