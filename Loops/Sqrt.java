import java.util.Scanner;
class Sqrt 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 1;i<=num ;i++ )
		{
			if(i*i == num)
			{
				flag = true;
				System.out.println(num+" is perfect Square for "+i);
				break;
			}
			if(i*i>num)
			{
				break;
			}
		}
		if(!flag)
		{
			System.out.println("It is not a perfect square");
		}
	}
}
