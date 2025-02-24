import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1 ; i<num ; i++)
		{
			boolean flag = true;
			if(i<=1)
			{
				flag = false;
				continue;
			}
			for(int j = 2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					flag = false;
					continue;
				}
			}
			if(flag)
			{
				int temp = i;
				label:
				for (int k = temp; k>0 ;k/=10 )
				{
					int rem = k%10;
					if(rem==1)
					{
						flag = false;
						break label;
					}
					for (int l = 2 ; l < rem ; l++ )
					{
						if(rem % l == 0)
						{
							flag = false;
							break label;
						}
					}

				}
				if(flag)
				{
					System.out.print(temp+" ");
					count++;
				}
			}
	     }
		 System.out.println();
		 System.out.println("Count of good prime number in range 1 to "+num+" is "+count);

	}
}
