class LongTypeCast 
{
	public static void main(String[] args) 
	{
		long a = 12344l;
		float c = a;
		double d = a;
		System.out.println("Original Value long = " +a);
		System.out.println("Typecasted to float = "+c);
		System.out.println("Typecasted to double = "+d);
	}
}
