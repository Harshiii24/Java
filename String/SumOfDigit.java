package strings;

public class SumOfDigit {
	public static void main(String[] args)
	{
		String a ="ABCD123";
		String num = "";
		
		for(int i  = 0; i<a.length(); i++)
		{
			char ch = a.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num+=ch;
			}
		}
		int sum = 0;
		for(int i = 0; i<num.length();i++)
		{
			char ch = num.charAt(i);
			int number = Character.getNumericValue(ch);
			sum+=number;
		}
		System.out.println(sum);
	}
}
