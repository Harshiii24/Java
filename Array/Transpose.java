package arrays;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][]ar = new int[3][3];
		System.out.println("Enter the elements: ");
		for(int i= 0; i<ar.length;i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original array : ");
		for(int i = 0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of an array:");
		for(int i= 0; i<ar.length;i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				int temp;
				if(j>i)
				{
					temp= ar[i][j];
					ar[i][j]=ar[j][i];
					ar[j][i]=temp;
				}
			}
		}
		for(int i = 0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
