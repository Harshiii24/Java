import java.util.Scanner;
class LargestOfFour
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		System.out.println("Enter the fourth number : ");
		int d = sc.nextInt();
		int large = (a>b)?((a>c)?((a>d)?(a):(d)):(c>d)?(c):(d)):(b>c)?((b>d)?(b):(d)):((c>d)?(c):(d));
		System.out.println("Largest value: "+large);
	}
}

		

