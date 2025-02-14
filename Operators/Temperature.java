import java.util.Scanner;
class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in degree Celsius = ");
		double celsius = sc.nextDouble();
		double f = (9.0/5.0)*celsius + 32;
		System.out.println(celsius+" degree Celsius is equal to "+f+" degree fahrenheit.");
	}
}
