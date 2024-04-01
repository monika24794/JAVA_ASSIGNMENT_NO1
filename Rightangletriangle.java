import java.util.Scanner;

public class Rightangletriangle
{


	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number to print rectangle pattern");
        int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for (int space=i;space<n;space++)
			{
				System.out.print("  ");
			}
			for (int j = 0; j<i; j++) 
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}
 