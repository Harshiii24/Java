import java.util.Scanner;
class NumberOfYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int min = sc.nextInt();
		int days =(min/(60*24));
		int year = (days/365);
		System.out.println(min+" minutes is approximately "+year+" years");
	}
}
