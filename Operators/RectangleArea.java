import java.util.Scanner;
class RectangleArea 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of rectangle in cm = ");
		float height = sc.nextFloat();
		System.out.println("Enter width of rectangle in cm = ");
		float width = sc.nextFloat();
		float area = height*width;
		float perimeter = 2*(height+width);
		System.out.println("Area of rectangle = "+area+" cm^2.");
		System.out.println("Perimeter of rectangle = "+perimeter+" cm.");
	}
}
