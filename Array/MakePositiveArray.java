package arrays;

import java.util.Arrays;

public class MakePositiveArray {
	public static void main(String[] args)
	{
		int[] ar= {3,5,6,-9,-3,-6,8,10,-100};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ar[i]=-1*ar[i];
			}
			else
				ar[i]=ar[i];
		}
		System.out.println("Positive Array: "+Arrays.toString(ar));
	}
}
