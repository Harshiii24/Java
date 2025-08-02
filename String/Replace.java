package strings;

public class Replace {
	public static void main(String[] args)
	{
		String s = "banana";
		System.out.println(replace(s,'a','@'));
	}
	
	public static String replace(String s, char old, char naya)
	{
		String ans ="";
		for(int i = 0; i<s.length(); i++)
		{ 
			char ch = s.charAt(i);
			if(ch == old)
				ans=ans+naya;
			else
				ans+=ch;
		}
		return ans;
	}
	
}
