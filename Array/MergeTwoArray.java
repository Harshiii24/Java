package arrays;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args)
	{
		int[]ar1= {10,20,30};
		int []ar2 = {40,50,60,70};
		int []ans = new int[ar1.length + ar2.length];
		System.out.println(Arrays.toString(mergeArray(ar1,ar2,ans)));
	}
	public static int[] mergeArray(int[]ar1,int[]ar2,int[]ans)
	{
		int mem = 0;
		for(int i = 0; i<ans.length;i++,mem++)
		{
			if(i<ar1.length)
			{
				ans[mem]=ar1[i];
			}
			else
			{
				ans[mem]=ar2[i-ar1.length];
			}
		}
		return ans;
	}
	
		
}
