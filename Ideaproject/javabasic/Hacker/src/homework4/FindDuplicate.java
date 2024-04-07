package homework4;

public class FindDuplicate 
{
	
	public static void main(String[] args) 
	{
		String []nameList = {"Alice", "Bob", "Tim", "John", "Tim","Denice"};
		boolean isDupFound = false;
		
		for(int i=0;i<nameList.length;i++)
		{
			String name = nameList[i];
			
			for(int j =i+1;j<nameList.length;j++)
			{
				if(name.equals(nameList[j]))
				{
					isDupFound = true;
					System.out.println("Found duplicate for "+name);
				}
			}		
		 }
		
		if(!isDupFound)
		{
			System.out.println("No duplicate found");
		}
		
	}

}
