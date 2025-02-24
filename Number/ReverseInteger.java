import java.util.Scanner;
class ReverseInteger
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		long rev = 0 ;
		boolean flag = false;
		if(num<0)
		{
			flag = true;
			num = num*(-1);
		}
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			if(rev>Integer.MAX_VALUE || rev< Integer.MIN_VALUE)
			{
				System.out.println(0);
			}
			num/=10;
		}
		if(flag)
		{
			System.out.println(rev*(-1));
		}
		else{
			System.out.println(rev);
		}
		
	}
}
