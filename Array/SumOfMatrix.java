package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfMatrix {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[2][3];
		System.out.println("Enter elements of array A :"); 
		int b[][]=new int[2][3];
		for(int i= 0; i<a.length;i++)
		{
			for(int j = 0; j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of array B :"); 
		for(int i= 0; i<b.length;i++)
		{
			for(int j = 0; j<b[i].length;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		if(a.length == b.length)
		{
			int i;
			for(i = 0;i<a.length;i++)
			{
				if(a[i].length!=b[i].length)
					break;		
			}
			if(i==a.length)
			{
				int c[][]=new int[a.length][a[0].length];
				for(int j=0;j<a.length;j++)
				{
					for(int j2 = 0; j2<a[j].length;j2++)
					{
						c[j][j2] = a[j][j2]+b[j][j2];
					}
				}
				for(int j = 0;j<c.length;j++)
				{
					System.out.println(Arrays.toString(c[j]));
				}
			}
		}
		else
			System.out.println("Can not perform array addition (Both array size is not same)");
	}
}
