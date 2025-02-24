import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sqr = (num*num);
		int sum = 0;
		for(int i = sqr ; i>0 ; i/=10)
		{
			sum+=(i%10);
		}
		System.out.println((sum==num)?(num+" is neon number"):(num+" is not neon number"));
	}
}
