package homework4;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String args[]) {
        String[] myStringArray = { "Alice", "Bob", "Tim", "John", "Denice" };

        // 使用自定义方法复制数组
        String[] copiedArray1 = copyArray(myStringArray);

        // 使用Arrays.copyOf方法复制数组
        String[] copiedArray2 = Arrays.copyOf(myStringArray, myStringArray.length);

        // 打印原始和复制的数组
        System.out.println("Original Array: " + Arrays.toString(myStringArray));
        System.out.println("Copied Array 1: " + Arrays.toString(copiedArray1));
        System.out.println("Copied Array 2: " + Arrays.toString(copiedArray2));
    }

    // 自定义复制数组的方法
    public static String[] copyArray(String[] original) {
        String[] copy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}