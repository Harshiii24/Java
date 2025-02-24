import java.util.Scanner;
class KrishNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		for(int i = num ; i>0 ; i/=10)
		{
			int rem = i%10;
			int fact = 1;
			for ( int j = 1; j<=rem ; j++ )
			{
				fact*=j; 
			}
			sum +=fact; 
		}
		System.out.println(sum == num?"Krish number":"Not krish number");
	}
}
