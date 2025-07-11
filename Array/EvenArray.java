package arrays;
import java.util.Arrays;
public class EvenArray {
	public static void main(String[] args)
	{
		int[] ar= {2,3,4,5,6,7,8,9,10};
		for(int i = 0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ar[i]=ar[i];
			}
			else
				ar[i]=ar[i+1];
		}
		System.out.println(Arrays.toString(ar));
	}
}
