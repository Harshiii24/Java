import java.util.Scanner;
class EYhockey 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		int count0 = 0, count1 = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)!='1'&& s.charAt(i)!='0' )
			{
				System.out.println("Invalid Input String");
				System.exit(0);
			}
			 if(s.charAt(i)== '1' )
				 count1++;
			 else
			 {
				 count1 = 0;
			 }
			 if(s.charAt(i)== '0')
				 count0++;
			 else
			 {
				 count0 = 0;
			 }
			 if(count0>= 7 || count1>=7)
				 break;
		}
		System.out.println(count0==7||count1==7? "YES it is dangerous ":"NO it is not dangerous");
	}
}
