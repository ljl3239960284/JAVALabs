package Homework11.Swap;

public class GenericSwap {
    public static <T> void swap(T[] array,int i,int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 0, 3);
        System.out.println("Swapped array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
