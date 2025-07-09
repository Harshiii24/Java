package arrays;

public class CountOfPrime {
	public static void main(String[] args)
	{
		int[]ar = {0,-1,1,2,3,4,5,6,7,8,9};
		System.out.println("Count of prime elements in given array is: "+countOfPrime(ar));
	}
	public static boolean isPrime(int num)
	{
			if(num<=1)
				return false;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					return false;
				}
		}
			return true;
	}
	public static int countOfPrime(int[]ar)
	{
		int count = 0;
		for(int i = 0 ; i<ar.length; i++)
		{
			if(isPrime(ar[i]))
				count++;
		}
		return count;
	}
}
