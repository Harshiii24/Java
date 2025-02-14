import java.util.Scanner;
class EvenOdd1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean result = (num/2)*2 == num;
		System.out.println("If result return true the number is EVEN, if it returns false number is ODD = "+result);
	}
}
