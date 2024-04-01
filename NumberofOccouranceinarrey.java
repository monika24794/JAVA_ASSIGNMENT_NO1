//Count the number of occurrence of each element of an array.
public class NumberofOccouranceinarrey
{
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		
		for (int i = 0; i < arr.length; i++) 
		{    int count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println("the number of = " +arr[i]+ "  occurrence  " +count+ "   in array");
		}
		
	}

}
