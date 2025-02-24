import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(num%7==0)
		{
			System.out.println(num+" is a Buzz Number.");
			return;
		}
		else
		{
			flag = false;
			for(int i = num; i>0 ; i/=10)
			{
				int rem = i%10;
				if(rem==7)
				{
					flag = true;
					break;
				}	
			}
		}
		if(flag)
			System.out.println(num+" is a Buzz Number.");
		else
			System.out.println(num+" is not a Buzz Number.");

	}
}
