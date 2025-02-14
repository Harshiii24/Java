import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight (in pounds): ");
		float w = sc.nextFloat(); 
		System.out.println("Enter the height (in inches): ");
		float h = sc.nextFloat(); 
		final float kg = w*0.45359237f;
		final float meter = h*0.0254f;
		float bmi = kg/((meter)*(meter));
		System.out.println("BMI is "+bmi);
	}
}
