package arrays;

public class EvenOddSum {
	public static void main(String[] args)
	{
		int []ar= {1,3,4};
		System.out.println("Sum of Even elements: "+evenSum(ar));
		System.out.println("Sum of odd elements: "+oddSum(ar));
		if(evenSum(ar)==oddSum(ar))
		{
			System.out.println("Both Even and Odd sum of elements of an array are same!");	
		}
		else
			System.out.println("Even and odd sum of an array is not same!");
		
		
		
	}
	public static int evenSum(int[]ar)
	{
		int eSum = 0;
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				eSum+=ar[i];
			} 
		}
		return eSum;
	}
	
	public static int oddSum(int[]ar)
	{
		int oSum = 0; 
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]%2!=0)
			{
				oSum+=ar[i];
			}
		}
		return oSum;
	}

}
