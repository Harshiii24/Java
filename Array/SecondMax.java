package arrays;

public class SecondMax {
	public static void main(String[] args)
	{
		int[]ar= {1,3,5,7,8,9,10,7,16,89,89};
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i = 0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				secMax = max;
				max=ar[i];
			}
			else if(ar[i]>max && ar[i]!=max)
			{
				secMax = ar[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
	}
}
