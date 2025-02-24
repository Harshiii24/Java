import java.util.Scanner;
class BinaryToDec 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int bin = sc.nextInt();
		int sum = 0;
		int len = 0;
		for(int i = bin ; i>0 ; i/=10)
		{ 
			len++;
				int rem = i%10;
				if(rem==1)
				{
					int power = 1;
					for(int k = 0 ; k<(len-1); k++)
					{
						power*=2;
					}
					sum+=power;
				}
		}
		System.out.println(bin+" : "+sum);
	}
}
