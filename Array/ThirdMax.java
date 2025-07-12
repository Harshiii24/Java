package arrays;

public class ThirdMax {
	public static void main(String[] args)
	{
		int ar[]= {1,2,3,4,5,6,7,8,9,8,9,10,10,10,8,11};
		int max=Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]>max)
			{
				thirdMax = secMax;
				secMax = max;
				max=ar[i];
			}
			else if(ar[i] > secMax && ar[i]!=max)
			{
				thirdMax = secMax;
				secMax = ar[i];
			}
			else if(ar[i] > thirdMax && ar[i]!=max && ar[i]!=secMax)
			{
				thirdMax = ar[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		System.out.println(thirdMax);
		
	}
}
