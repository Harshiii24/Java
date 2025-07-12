package arrays;

import java.util.Arrays;

public class MinElement {
	public static void main(String[] args)
	{
		int[] ar= {23,4,52,89,2,3,4,5};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(min);
	}
}
