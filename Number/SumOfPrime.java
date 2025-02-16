import java.util.Scanner;
class SumOfPrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting number : ");
		int snum = sc.nextInt();
		System.out.println();
		System.out.print("Enter the ending number : ");
		int eum = sc.nextInt();
		int sum = 0;
		boolean flag = true;
		for(int i = snum; i<=eum ; i++)
		{
			if(i<=1)
				flag = false;
			else
				flag = true;
			for(int j = 2; j<i ; j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of prime number between range "+snum+" to "+eum+" is "+sum);
	}
}
