import java.util.Scanner;
class FloatTypeCast 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float a = sc.nextFloat();
		//long b =a;
		double c = a;
		System.out.println("Original value of float = "+a);
		System.out.println("Typecasted in double = "+c);
	}
}