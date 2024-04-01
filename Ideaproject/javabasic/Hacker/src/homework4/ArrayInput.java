package homework4;
import java.util.Scanner;

public class ArrayInput 
{
	
	public static void main(String[] args) 
	{
	   Scanner input = new Scanner(System.in);	
		int index =0;
		int []arr = new int[10];
		
		while(index<10)
		{
			System.out.print("Pls enter an integer>>>");
			arr[index] = input.nextInt();
			index++;
		}
	   
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
			sum = sum + arr[i];
		}
		
		System.out.println("The average = "+sum/arr.length);
	}

}
