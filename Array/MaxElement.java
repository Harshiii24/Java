package arrays;
import java.util.Arrays;
public class MaxElement {
	public static void main(String[] args)
	{
		int[] ar= {23,4,52,89,2,3,4,5};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(max);
	}
}
