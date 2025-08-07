package strings;

public class Anagram {
	public static void main(String[] args)
	{
		String a = "Eleven plus two".toLowerCase();
		String b = "Twelve plus one".toLowerCase();
		
		System.out.println(isAnagram(a,b));
	}
	
	public static boolean isAnagram(String a, String b)
	{
		if(a.length()==b.length())
		{
			int ar[] = new int[127]; 
			int ar2[] = new int[127];
			for(int i = 0; i<a.length();i++)
			{
				ar[a.charAt(i)]++;
				ar2[b.charAt(i)]++;
			}
			for(int i = 0; i<ar2.length; i++)
			{
				if(ar[i]!=ar2[i])
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
