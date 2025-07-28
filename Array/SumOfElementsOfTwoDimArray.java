package arrays;
import java.util.Scanner;

public class SumOfElementsOfTwoDimArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][]ar = new int[3][3];
		System.out.println("Enter the elements : ");
		int sum = 0; 
		for(int i = 0; i<ar.length;i++)
		{
			for(int j = 0;j<ar[i].length;j++)
			{
				ar[i][j] = sc.nextInt();
				sum+=ar[i][j];
			}
		}
		System.out.println(sum);
	}
}
