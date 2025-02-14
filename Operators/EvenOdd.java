import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number =");
		int num = new Scanner(System.in).nextInt();
		boolean result = num/2 == num/2.0;
		System.out.println("If true number is even else odd =" +result);
	}
}
