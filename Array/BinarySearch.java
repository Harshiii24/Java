package arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args)
	{
		int[]ar= {1,6,8,2,3,5,11,91,9};
		sort(ar);
		System.out.println("Element present at: "+binarySearch(ar,100));
		System.out.println(Arrays.toString(ar));
	}
	public static void sort(int[] ar)
	{
		for(int i =0;i<ar.length-1;i++)
		{
			for(int j =0 ; j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	public static int binarySearch(int[]ar,int ele)
	{
		int start = 0, end =ar.length-1, mid = (start+end)/2;
		while(start<=end)
		{
			if(ar[mid]==ele)
				return mid;
			else if(ele>ar[mid])
				start = mid+1;
			else if(ele<ar[mid])
				end = mid-1;
			mid=(start+end)/2;
		}
		return -1;
	}
}
