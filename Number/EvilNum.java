import java.util.Scanner;
class EvilNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int count = 0;
		String bin = "";
		//loop for converting the given decimal number into binary
		for(int i = num ; i>0; i/=2)
		{
			bin = i%2+bin;
		}
		//loop for taking the count of 1 if count of 1 is even it is evil number else not an evil number
		for(int i =  0; i<bin.length() ; i++ )
		{
			if(bin.charAt(i)=='1')
				count++;
		}
		if(count%2==0)
			System.out.println(dup+" is an Evil number");
		else
			System.out.println(dup+" is not an Evil number.");
	}
}
