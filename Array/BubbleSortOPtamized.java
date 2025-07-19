package arrays;

import java.util.Arrays;

public class BubbleSortOPtamized {
	public static void main(String[] args)
	{
		int[]ar= {100,20,30,33,2};
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void bubbleSort(int[]ar)
	{
		int swap=0;
		for(int i = 0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					swap++;
				}
			}
			if(swap==0)
			{
				break;
			}
		}
		System.out.println(swap);
		
	}
}
