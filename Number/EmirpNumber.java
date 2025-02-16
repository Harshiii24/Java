import java.util.Scanner;
class EmirpNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		boolean flag = true;
		for(int i = 2; i<=(num-1);i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("It is a prime number");
			int rev = 0;
			flag = false;
			for (int i = num; i>0  ; i/=10 )
			{
				int rem = i%10;
				rev = rev*10+rem;
			}
			System.out.println("Reverse of the number is "+rev);
			for(int j = 2 ; j<=(rev-1); j++)
			{
				if(rev % j == 0)
					break;
				flag = true;
			}
			if(flag)
				System.out.println("Reverse of the prime number is also prime therefore it is Emirp number");
			else
				System.out.println("Reverse of prime number is not prime therefore it is not Emirp number.");
		}
		else 
			System.out.println("It is not a prime number.");

	}
}
