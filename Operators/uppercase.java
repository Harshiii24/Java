import java.util.Scanner;
class Uppercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character = ");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		String result = (ch>='a'&&ch<='z')?(ch+" is LowerCase aplhabet"):(ch>=65&&ch<=90)?(ch+" is UpperCase aplhabet"):(ch>='0'&&ch<='9')?(ch+" is a digit"):(ch+" is a special character");
		System.out.println(result);
	}
}
