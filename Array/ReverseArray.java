package arrays;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String[]args)
	{
		int[]ar= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(reversed(ar)));
		
	}
		public static int[] reversed(int[]ar)
		{
		for(int i=0,j=ar.length-1; i<j;i++,j--)
		{
			int temp= ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		return ar;
		}
}
