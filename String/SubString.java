package strings;

public class SubString {
	public static void main(String[] args)
	{
		String s = "LeetCode";
		System.out.println(subString(s,1,5));
	}
	
	public static String subString(String s,int start, int end)
	{
		String ans="";
		if(start<s.length() && end< s.length())
		{	
			for(int i = 0; i<s.length(); i++)
			{
				if(i >= start && i <= end)
					ans +=s.charAt(i);
			}
			return ans;
		}
		else
			return "Enter valid start and end index";
	}
}
