package strings;

public class Panagram {
	public static void main(String[] args)
	{
		String s = "The quick brown fox jumps over the lazy dog.";
		System.out.println(isPanagram(s));
	}
	
	public static boolean isPanagram(String s)
	{
		int [] a = new int[26];
		
		for(int i  = 0 ; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
				a[s.charAt(i)-97]++;
			else if(ch>='A' && ch<='Z')
				a[s.charAt(i)-65]++;
		}
		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]==0)
				return false;
		}
		return true;
	}
}
