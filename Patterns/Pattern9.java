class Pattern9
{
	public static void main(String[] args) 
	{
		int a = 1;
		char c = 'a';
		for(int i = 1 ; i<=5 ; i++)
		{
			for (int j = 1; j<=i ;j++ )
			{
				if(i%2==0)
					System.out.print(a++ +" ");
				else
					System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}

//output:
// a
// 1 2 
// b c d 
// 3 4 5 6 
// e f g h i 

