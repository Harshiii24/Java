package arrays;

public class CountOfEvenOdd {
	public static void main(String[] args)
	{
		int [] ar = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even count: "+evenCount(ar));
		System.out.println("Odd count:"+oddCount(ar));
	}
	public static int evenCount(int[]ar)
	{
		int count = 0;
		for(int i = 0; i<ar.length;i++)
		{
			if(ar[i]%2==0)
				count++;
		}
		return count;
	}
	public static int oddCount(int[]ar)
	{
		int count = 0;
		for(int i = 0; i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				count++;
		}
		return count;
	}
}
