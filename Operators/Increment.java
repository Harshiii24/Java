class Increment 
{
	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println(a--);//preincrement -> 101
		System.out.println("pocket = "+a);
		System.out.println(a--);//preincrement -> 102
		System.out.println("pocket = "+a);
		System.out.println(--a);//postincrement -> 102
		System.out.println("pocket = "+a);
		System.out.println(a-- + --a);//postincrement -> 103
		System.out.println("pocket = "+a);
		//System.out.println(++a + a++);//105 + 105 -> 210
		//System.out.println("pocket = "+a);
	}
}
