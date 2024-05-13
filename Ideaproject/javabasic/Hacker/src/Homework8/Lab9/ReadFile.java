package Homework8.Lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        System.out.print("Enter the directory address: ");
        Scanner sc = new Scanner(System.in);

        String address;
        address = sc.nextLine();

        File currentdirectory = new File(address);

        String[] filelist = currentdirectory.list();

        if (filelist!= null) {
            System.out.println("Files in current directory: ");
            System.out.println(Arrays.toString(filelist));
        }else{
            System.out.println("No files in current directory");
        }
        
        try(BufferedReader fr = new BufferedReader(new FileReader(address))){
            String line;
            while ((line = fr.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());//To handle the exception if any
        }
    }

}
