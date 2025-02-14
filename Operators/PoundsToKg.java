import java.util.Scanner;
class PoundsToKg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight (in pounds): ");
		float pound = sc.nextFloat();
		final float kg = pound * 0.454f ;
		System.out.println(pound+" pounds is equal to "+kg+" kilograms.");
	}
}
