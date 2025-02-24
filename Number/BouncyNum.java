import java.util.Scanner;
class BouncyNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int prevdigit = -1; 
		int prevdigit1 = 10;
        boolean flag1 = false;
		boolean flag2 = false;
        for(int i = num ; i>0 ; i/=10)
		{
            int rem = i % 10; 
            if (rem <= prevdigit)
                flag1 = true; 
			else if(rem >= prevdigit1)
				flag2 = true;
            prevdigit = rem;  
			prevdigit1 = rem;
        }
		if(flag1 && flag2)
			System.out.println(num+" is Bouncy Number");
		else
			System.out.println(num+ " is not a Bouncy number.");
	}
}
