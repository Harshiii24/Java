package arrays;
import java.util.Arrays;
public class Merge {
	public static void main(String[] args)
	{
		int[]a = {10,20,30,40,50};
		int[]b = {11,22,33,44,55};
		System.out.println(Arrays.toString(merge(a,b)));
	}
	public static int[] merge(int[]a,int[]b)
	{
		int i=0,j=0,k=0;
		int[]ans = new int[a.length + b.length];
		while(i<a.length && j<b.length)
		{
			if(a[i] < b[j])
				ans[k++]=a[i++];
			else if(a[i]>= b[j])
				ans[k++]=b[j++];
		}
		while(i<a.length)
			ans[k++]=a[i++];
		while(j<b.length)
			ans[k++]=b[j++];
		return ans;
	}
}
