package strings;

public class IndexOf {
	public static void main(String[] args)
	{
		String s= "Hello";
		System.out.println(indexOf(s,'l'));
	}
	
	public static int indexOf(String s,char ch)
	{
		boolean flag = false;
		int i;
		for(i = 0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c==ch)
			{
				flag = true;
				break;
			}
		}
		if(flag)
			return i;
		else
			return -1;
	}
}
