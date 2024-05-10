package Homework8.Tokenize;

import java.util.StringTokenizer;

public class Tokenize {
    public static void main(String[] args) {
        String s = "Java$is$100";
        StringTokenizer tokenizer = new StringTokenizer(s,"$",false);

        System.out.println("The total number of tokens is " + tokenizer.countTokens());

        String s1 = "";
        while (tokenizer.hasMoreTokens()){
            s1 = tokenizer.nextToken();
            System.out.println(s1);
        }
        int sum = Integer.parseInt(s1);
        System.out.println("The num is" + sum);
    }
}
