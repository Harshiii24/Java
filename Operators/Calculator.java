import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		float num1 = sc.nextFloat();
		System.out.println("Enter the second number : ");
		float num2 = sc.nextFloat();
		System.out.println("Enter the operator (+, -, *, /, %) : ");
		char ch = sc.next().charAt(0);
		float res = (ch=='+')?(num1+num2):(ch=='-')?(num1-num2):(ch=='*')?(num1*num2):(ch=='/')?(num1/num2):(ch=='%')?(num1%num2):(0.0001f);
		String output = num1+" "+ch+" "+num2+" = "+res;
		if(!(res==0.0001f))
			System.out.println(output);
		
	}
}

