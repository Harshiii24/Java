import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println((num==1)?(num+" is not prime nor composite."):(num==2||num==3||num==5||num==7)?(num+" is prime"):(num%2==0||num%3==0||num%5==0||num%7==0)?(num+" is not a prime"):(num+" is prime"));
		}
}
