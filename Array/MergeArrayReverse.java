package arrays;
import java.util.Arrays;
public class MergeArrayReverse {
	public static void main(String[] args)
	{
		int[] ar1 = {10,20,30,40};
		int[]ar2 = {50,60,70,80,90};
		int[]ans = new int[ar1.length + ar2.length];
		System.out.println("Array 1: "+Arrays.toString(ar1));
		System.out.println("Array 2: "+Arrays.toString(ar2));
		System.out.println("Reverse array 1: "+Arrays.toString(reverseAr1(ar1,ar2,ans)));
		System.out.println("Reverse Array 2: "+Arrays.toString(reverseAr2(ar1,ar2,ans)));
		System.out.println("Reverse both Array: "+Arrays.toString(reverseBoth(ar1,ar2,ans)));
		System.out.println("Zig zag Array: "+Arrays.toString(zigZagArray(ar1,ar2,ans)));
		System.out.println("Zig zag Elements: "+Arrays.toString(zigZagElements(ar1,ar2,ans)));
	}
	
	public static int[] reverseAr1(int[]ar1,int[]ar2,int[]ans)
	{
		int mem = 0;
		for(int i = 0; i<ans.length;i++,mem++)
		{
			if(i<ar1.length)
			{
				ans[mem]=ar1[ans.length-ar2.length-1-i];
			}
			else
				ans[mem]=ar2[i-ar1.length];
		}
		return ans;
	}
	
	public static int[] reverseAr2(int []ar1,int[]ar2,int[]ans)
	{
		int mem = 0;
		for(int i = 0; i<ans.length;i++,mem++)
		{
			if(i<ar1.length)
				ans[mem]=ar1[i];
			else
				ans[mem]=ar2[ans.length-1-i];
					
		}
		return ans;
	}
	
	public static int[] reverseBoth(int[]ar1,int[]ar2,int[]ans)
	{
		int mem = 0;
		for(int i = 0; i<ans.length;i++,mem++)
		{
			if(i<ar1.length)
				ans[mem]=ar1[ans.length-ar2.length-1-i];
			else
				ans[mem]=ar2[ans.length-1-i];
		}
		return ans;
	}
	
	public static int[] zigZagArray(int[]ar1,int[]ar2,int[]ans)
	{
		int mem=0;
		for(int i=0; i<ans.length;i++)
		{
			if(i<ar1.length)
				ans[ans.length-1-i]=ar1[i];
			else
			{
				ans[mem]=ar2[ans.length-1-i];
				mem++;
			}	
		}
		return ans;
	}
	
	public static int[] zigZagElements(int[] ar1,int[]ar2,int[]ans)
	{
		int mem = 0, mem2 = 0;
		for(int i = 0; i<ans.length;i++)
		{
				if(i%2==0 &&  mem<ar1.length)
				{
					ans[i]=ar1[mem];
					mem++;
				}
				else
				{
					ans[i]=ar2[mem2];
					mem2++;
				}
		}
		return ans;
		
		
	}
	

}
