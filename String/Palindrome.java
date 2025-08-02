package strings;

public class Palindrome {
	public static void main(String[] args)
	{
		String s ="123321";
		
		int i;
		for(i = 0; i<s.length()/2; i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				break;
			}
		}
		
		if(i>=s.length()/2)
			System.out.println("It is palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
