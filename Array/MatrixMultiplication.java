package arrays;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args)
	{
		int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][]b = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		if(isEqual(a,b))
		{
			int ans [][] = multiplication(a,b);
			for(int i = 0; i<ans.length;i++)
			{
				System.out.println(Arrays.toString(ans[i]));
			}
		}
	}	
	public static boolean isEqual(int[][]a , int[][]b)
	{
		if (a.length != b.length) 
			return false;

		for (int i = 0; i < a.length; i++) 
		{
			if (a[i].length != b[i].length) 
				return false;
			for (int j = 0; j < a[i].length; j++) 
			{
				if (a[i][j] != b[i][j]) 
					return false;
			}
		}
			return true;
	}

		
		
	public static int[][] multiplication(int[][]a , int[][]b)
	{
		int [][]c = new int[a.length][b[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				for(int k = 0; k<b.length;k++)
				{
					c[i][j]+= a[i][k]*b[k][j]; 
				}
			}
		}
		return c;
	}
}

