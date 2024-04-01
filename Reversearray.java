import java.util.Scanner;

//Reverse a given Array and print.
public class Reversearray {

	public static void main(String[] args)
	{ 
		Scanner sc =new Scanner(System.in);
	
		int array[]= {1,2,3,5,6,8,9,7,10};
		int array2[]=new int[10];
	    int j = 0;
	    
		 for (int i = array.length-1; i >=0; i--)
		 {
				 array2[j]=array[i];
				 j++;
		 }
	    
		 for (int i = 0; i < array2.length; i++) 
		 {
			System.out.print("\t"+array2[i]);
		}
	}

}
