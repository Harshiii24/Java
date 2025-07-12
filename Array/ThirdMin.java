package arrays;

public class ThirdMin {
	public static void main(String[] args)
	{
		int ar[]= {1,1,2,3,2,3,4,5,6,7,8,9,8,9,10,10,10,8,11};
		int min=Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]<min)
			{
				thirdMin = secMin;
				secMin = min;
				min =ar[i];
			}
			else if(ar[i] < secMin && ar[i]!=min)
			{
				thirdMin = secMin;
				secMin = ar[i];
			}
			else if(ar[i] < thirdMin && ar[i]!=min && ar[i]!=secMin)
			{
				thirdMin= ar[i];
			}
		}
		System.out.println(min);
		System.out.println(secMin);
		System.out.println(thirdMin);
		
	}
}
