package arrays;

import java.util.Scanner;

public class NinetyDegreeRotation {
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
		for (int i = 0; i < ar.length; i++) {
		    int start = 0;
		    int end = ar[i].length - 1;

		    while (start < end) {
		        int temp = ar[i][start];
		        ar[i][start] = ar[i][end];
		        ar[i][end] = temp;

		        start++;
		        end--;
		    }
		}

		System.out.println("Ninety degree rotation of an array:");
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
