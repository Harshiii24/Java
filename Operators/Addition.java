import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------Addition--------------------------------------------------");
		System.out.print("Enter the first number for addition: ");
		short num1 = sc.nextByte();
		System.out.print("Enter the second number for addition: ");
		short num2 = sc.nextByte();
		int add = num1 + num2;
		System.out.println("Addition is " +add);
		System.out.println("Enter the number of which you want to create table!!");
		short n = sc.nextByte();
		for (short i=1; i<=10; i++ )
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		Multi ob = new Multi();
		ob.multi();
	}
}

class Multi
{
	int multi()
	{
		System.out.println("--------------------Multiplication--------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number for multiplication: ");
		int x = sc.nextInt();
		System.out.print("Enter the first number for multiplication: ");
		int y = sc.nextInt();
		int z = x*y;
		System.out.println("Multiplication is: "+z);
		return z;
	}
}