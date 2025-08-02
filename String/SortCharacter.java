package strings;

public class SortCharacter {

	public static void main(String[] args)
	{
		String s = "hello";
		char[] ch = new char[s.length()];
		for(int i = 0; i<s.length();i++)
		{
			ch[i] = s.charAt(i);
		}
		for(int i = 0; i<s.length();i++)
		{
			for(int j = 0; j<s.length()-1-i;j++)
			{
				if(ch[i]>ch[i+1])
				{
					char temp = ch[i];
					ch[i] = ch[i+1];
					ch[i+1] = temp;
				}
			}
		}
		System.out.println(ch);
		
	}
}
