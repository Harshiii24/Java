import java.util.Scanner;
class SpyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teh number : ");
		int num = sc.nextInt();
		int sum = 0;
		int pro = 1;
		for(int i = num ; i>0 ; i/=10)
		{
			sum+=(i%10);
			pro*=(i%10);
		}
		System.out.println((sum==pro)?(num+" is a spy number."):(num+" is not a spy number."));
	}
}
