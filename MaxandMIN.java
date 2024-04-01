//Find the second maximum and second minimum Elements of an array.
public class MaxandMIN 
{

	 public static void main(String[] args)
	 	{
		 int temp;
		 int array[]= {7,5,3,6,8,9,4,2,1,10};
		
		 for (int i = 0; i< array.length; i++) 
		 {
			 for (int j = 1; j < array.length; j++) 
			 {
				 if(array[j]>array[i]) 
				 {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
				 }
				 
			 }
		 }
		 System.out.println(" SECOND MINIMUM ELEMENT="+array[2]);
		 System.out.println(" SECOND MAXIMUM ELEMENT="+array[array.length-1]);
	}

}
