package strings;

public class ReplaceTheFirstOccurance {
	public static void main(String[] args)
	{
		String s ="banana";
		System.out.println(replaceFirst(s,'a','@'));
		
	}
	public static String replaceFirst(String s, char old, char naya)
	{
		String ans="";
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == old)
			{
				count++;
				if(count==1)
				{
					ans += naya;
				}
				else
					ans+=c;
			}
			else
				ans+=c;
		}
		return ans;
	}
}
