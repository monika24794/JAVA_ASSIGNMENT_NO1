import java.util.Scanner;

public class Downtriangle
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number to print rectangle pattern");
        int n=sc.nextInt();
		
        for(int i = 0; i< n; i++)
    	{
        for(int j = i; j <n; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    	}

    }
}
