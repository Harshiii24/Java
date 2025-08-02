package strings;

public class GreatestCharacter {
	public static void main(String[] args)
	{
		char max = Character.MIN_VALUE;
		String s ="hello";
		for(int i = 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>max)
				max = ch;
		}
		System.out.println(max);
	}
}
