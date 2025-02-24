class Pattern8
{
	public static void main(String[] args) 
	{
		int a = 1;
		for(int i = 1 ; i<=4 ; i++)
		{
			for (int j = 1; j<=i ;j++ )
			{
				System.out.print(a++ +" ");
				a++;
			}
			System.out.println();
		}
	}
}

//output:
// 1
// 3 5
// 7 9 11
// 13 15 17 19

