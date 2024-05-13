package Homework8.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\JAVA\\JAVAproject\\Ideaproject\\javabasic\\Hacker\\src\\Homework8\\File\\hello.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
