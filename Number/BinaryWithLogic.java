import java.util.Scanner;
class BinaryWithLogic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String bin="";
		for(int i = num; i>0 ; i/=2)
		{
			bin = (i%2)+bin;
		}
		System.out.println(num+": "+bin);
	}
}