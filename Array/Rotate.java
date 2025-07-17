package arrays;
import java.util.Arrays;
public class Rotate {
	public static void main(String[] args)
	{
		int[]ar= {10,20,30,40};
		rotate(ar,2);
		System.out.println(Arrays.toString(ar));
	}
	public static void rotate(int[]ar, int times)
	{
		for(int i=0;i<times;i++)
		{
			int temp = ar[0];
			for(int j = 1;j<ar.length;j++)
			{
			ar[j-1]=ar[j];
			}
			ar[ar.length-1]=temp;
			}
		}
	}
