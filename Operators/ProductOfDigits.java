class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 2222;
		int pro = 1;
		int rem = num % 10;
		pro = pro*rem;
		num = num/10;
		rem = num % 10;
		pro = pro*rem;
		num = num/10;
		rem = num % 10;
		pro = pro*rem;
		num = num/10;
		rem = num % 10;
		pro = pro*rem;
		System.out.println("Product of digits: "+pro);
	}
}
