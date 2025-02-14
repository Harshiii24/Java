import java.util.Scanner;
class SwapWithoutVariable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float a=sc.nextFloat();
		System.out.println("Enter the second number: ");
		float b=sc.nextFloat();
		System.out.println("--------------Numbers before swapping are-------------");
		System.out.println("First number: "+a);
		System.out.println("Second number: "+b);
		float temp = a;
		a = b;
		b = temp;
		System.out.println("--------------Numbers after swapping are-------------");
		System.out.println("First number: "+a);
		System.out.println("Second number: "+b);

	}
}
