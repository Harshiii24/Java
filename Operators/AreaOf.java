import java.util.Scanner;
class AreaOf
{
	public static void main(String[] args) 
	{
		final float pii=22.0f/7.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle in cm: ");
		float r=sc.nextFloat();
		float area= pii*(r*r);
		System.out.println("Area of circle with radius "+r+" cm is "+area+" cm^2");


	}
}
