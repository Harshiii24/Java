import java.util.Scanner;
class CondOperatorExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First number = ");
		int a = sc.nextInt();
		System.out.println("Second number = ");
		int b = sc.nextInt();
		System.out.println("Third number = ");
		int c = sc.nextInt();
		int lar = (a>b)?((a>c)?a:b):((b>c)?b:c);
		System.out.println("Largest = "+lar);
	}
}
