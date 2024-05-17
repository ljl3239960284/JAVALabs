package Homework10;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        System.out.println(str1.contentEquals(sb1));
    }
}
