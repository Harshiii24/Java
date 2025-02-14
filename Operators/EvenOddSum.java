class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 5677;
		int even = 0;
		int odd = 0;
		int rem = num % 10;
		int sum = (rem % 2==0)?(even = even + rem):(odd = odd + rem);
		num = num/10;
		rem = num % 10;
		sum = (rem % 2==0)?(even = even + rem):(odd = odd + rem);
		num = num/10;
		rem = num % 10;
		sum = (rem % 2==0)?(even = even + rem):(odd = odd + rem);
		num = num/10;
		rem = num % 10;
		sum = (rem % 2==0)?(even = even + rem):(odd = odd + rem);
		num = num/10;
		rem = num % 10;
		sum = (rem % 2==0)?(even = even + rem):(odd = odd + rem);
		System.out.println("Even Sum = "+even);
		System.out.println("Odd Sum = "+odd);
	}
}
