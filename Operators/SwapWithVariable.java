import java.util.Scanner;
class SwapWithVariable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float b = sc.nextFloat();
		System.out.println("Before Swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=(a+b);
		b=(a-b);
		a=(a-b);
		System.out.println("After Swapping (without 3rd variable): ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}
}