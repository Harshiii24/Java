package strings;

public class Reverse {
	public static void main(String[] args)
	{
		String s = "fuck you";
		String rev = "";
		for(int i = s.length()-1; i>=0;i--)
		{
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
