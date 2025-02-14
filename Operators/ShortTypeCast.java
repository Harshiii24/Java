class ShortTypeCast 
{
	public static void main(String[] args) 
	{
		short a = 100;
//CTE   char c = a;
		int d = a;
		long e = a;
		float f = a;
		double g = a;
		System.out.println("Original Value Short = " +a);
		System.out.println("Typecasted to int = "+d);
		System.out.println("Typecasted to long = "+e);
		System.out.println("Typecasted to float = "+f);
		System.out.println("Typecasted to double = "+g);
	}
}