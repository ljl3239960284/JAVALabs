package Homework4;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String args[]) {
        String[] myStringArray = { "Alice", "Bob", "Tom", "John", "Tim", "Denice" };
        String elementToRemove = "Alice";
        String[] newStringArray = removeElement(myStringArray,elementToRemove);


        // 打印原始数组
        System.out.println("Old array is: " + Arrays.toString(myStringArray));

        // 创建并打印新数组
        // ...
        System.out.println("New array is: ");
        for (int i = 0; i < newStringArray.length;i++){
            System.out.println(newStringArray[i]);
        }
    }

    //创建移除元素的函数
    public static String[] removeElement(String[] myStringArray, String elementToRemove) {

        for (int i = 0; i < myStringArray.length; i++) {
            if (myStringArray[i].equals(elementToRemove)){
                // 移除元素
                for (int j=i+1; j < myStringArray.length; j++){
                    myStringArray[j-1] = myStringArray[j];
                }
                myStringArray[myStringArray.length-1] = null;
            }else{
                System.out.print("NO find element");
            }
        }
        return myStringArray;
    }
}