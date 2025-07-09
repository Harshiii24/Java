package arrays;

public class CountOfElement {
		public static void main(String[] args)
		{
			int[] ar= {1,2,3,4,5,6,7,8,9};
			System.out.println(countOfElement(1,ar));
		}
		public static int countOfElement(int num,int[]ar)
		{
			int count = 0;
			for(int i = 0; i<ar.length; i++)
			{
				if(num==ar[i])
					count++;
			}
			return count;
		}
}
