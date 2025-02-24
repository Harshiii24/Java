class Pattern7
{
	public static void main(String[] args) 
	{
		int a = 2; //initilize the value of a as 2
		for(int i = 1 ; i<=4 ; i++) //outer loop for i which indicates the number of rows present inside the pattern.
		// i=1 ; 1<=4(t) ; 2<=4(t) ; 1<=3(t)
		{
			for (int j = 1; j<=i ;j++ ) // j which shows the number of columns present inside the pattern.
			// j=1 ; 1<=1(t) ; 1++ (2<=1)(f) (1st iter) / j=1 ; j<=1(t) ; i++ / j = 2 ; 2<=2 (t) /i=3 ; 3<=2 (f) (2nd iter)
			// j = 1 ; 1<=(t) / j = 2 ; j<=
			{
				System.out.print(a++ +" ");  //postincrement first print then update 2(3) 
				                                                                  // 4(5) / 6(7)
																				  // 8(9) / 
				a++; // 3(4) , 5(6) , 7(8) , 9(10)
			}
			System.out.println();
		}
	}
}

//output: 
// 2
// 4 6 
// 8 10 12
// 14 16 18 20

