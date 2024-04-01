//2. Find the Maximum Element and Average of Elements in an Array.
public class Maxelement 
{
 public static void main(String[] args)
 	{
	 int array[]= {1,2,3,5,6,8,9,7,10};
	 int avrage,max=0,sum=0;
	 for (int i = 0; i< array.length; i++) 
	 {
		 for (int j = 1; j < array.length; j++) 
		 {
			 sum=sum+array[i];
			 if(array[i]>array[j])
				 max=array[i];
		 }
	 }
	 System.out.println("MAXIMUM ELEMENT="+max);
	 avrage= sum/9;
	 System.out.println("Average of Elements in an Array"+avrage);
}
}
