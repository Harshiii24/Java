class MockPattern 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		for(int i = 1; i<=5;i++)
		{
			for(int j = 5 ; j>=(i);j--)
			{
				System.out.print(a-- +"*");
			}
			for(int j = 5 ; j>=(i) ; j--)
			{
				System.out.print(b-- +"*");
			}
			System.out.println();
			a = 5 - i;
			b = 5 - i;
		}
	}
}

//  Output:

//  5*4*3*2*1*5*4*3*2*1*
//  4*3*2*1*4*3*2*1*
//  3*2*1*3*2*1*
//  2*1*2*1*
//  1*1*