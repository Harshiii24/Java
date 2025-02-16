import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int sum = 0 , len = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		for(int i = num ; i>0 ; i/=10 )
			len++;
		while(num>0)
		{
			int rem = num%10;
			int pow = 1;
			for(int j = 1;j<=len;j++)
				pow*=rem;
			sum+=pow;
			num/=10;
		}
		System.out.println(dup == sum?dup+" is Armstrong Number":dup+" is not Armstrong Number");

	}
}
