//Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula: 
//Perimeter = 2*pii*radius
//Area = pii*radius*radius

import java.util.Scanner;
class  AreaPerimeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float piii = 22f/7f;
		System.out.println("Enter the radius in cm = ");
		float radius = sc.nextFloat();
		float perimeter = 2*(piii)*radius;
		float area = piii*(radius*radius);
		System.out.println("Area of circle with radius "+radius+" cm is "+area+" cm^2.");
		System.out.println("Perimeter of circle with radius "+radius+" cm is "+perimeter+" cm^2.");

	}
}
