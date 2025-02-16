import java.util.Scanner;
class Solution 
{
   public static void main(String[] args)
	{
	    String s ="race a car";
		String temp = s.toLowerCase();
		String temp1 = "";
		System.out.println(temp);
        String dup = s.toLowerCase();
        String rev = "";
		for(int i = 0;i<temp.length();i++)
		{
			if(temp.charAt(i)>='a' && temp.charAt(i)<='z')
			{
				temp1 = temp1 + temp.charAt(i);
			}
		}
        for(int i=0; i<dup.length();i++)
        {
            if(dup.charAt(i)>='a' && dup.charAt(i)<='z')
            {
				rev = dup.charAt(i) + rev; 
            }
        }
		System.out.println(rev);
		System.out.println(rev);
		System.out.println(temp1);
        if(temp1.equals(rev))
        {
           System.out.println(true);
        }
        else
            System.out.println(false);
            
    }
}