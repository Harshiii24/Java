import java.util.Scanner;
class Financial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Subtotal: ");
		float total = sc.nextFloat();
		System.out.println("Tip rate: ");
		float tip = sc.nextInt();
		float tip1 = (total*tip)/100;
		float totalBill = total + tip1;
		System.out.println("The tip is "+tip+" and the total is "+totalBill);


	}
}
