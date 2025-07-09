package arrays;

public class Element {
	public static void main(String[] args)
	{
		int[] ar= {1,2,3,4,5,6,7,8,9};
		System.out.println(elementPresent(9,ar));
	}
	public static boolean elementPresent(int num,int[]ar)
	{
		for(int i = 0; i<ar.length; i++)
		{
			if(num==ar[i])
				return true;
		}
		return false;
	}
}
