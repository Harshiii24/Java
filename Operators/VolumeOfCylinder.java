import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		final float piii = 22f/7f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius pf cylinder in cm = " );
		float radius = sc.nextFloat();
		System.out.println("Enter the height of the culinder = ");
		float height = sc.nextFloat();
		float area = piii*2*radius*(radius + height);
		float volume = piii*(radius*radius)*height;
		System.out.println("Area of Cylinder = "+area+" unit^2.");
		System.out.println("Volume of Cylinder = "+volume+" unit^3");

	}
}
