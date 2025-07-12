package arrays;

public class SecondMin {
	public static void main(String[] args)
	{
		int[]ar= {1,2,3,5,7,8,9,10,7,16,89,89};
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		for(int i = 0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				secMin = min;
				min=ar[i];
			}
			else if(ar[i]<secMin && ar[i]!=min)
			{
				secMin = ar[i];
			}
		}
		System.out.println(min);
		System.out.println(secMin);
	}
}
