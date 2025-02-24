import java.util.Scanner;
class DuckNum 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.next();
        if(num.charAt(0) == '0') 
            System.out.println(num + " is not a Duck Number.");
		else 
		{
            boolean flag = false; 
            for(int i = 1; i < num.length(); i++) 
			{
                if(num.charAt(i) == '0') 
				{
                    flag = true;  
                    break;
                }
            }
            if(flag) 
                System.out.println(num + " is a Duck Number.");
             else
				System.out.println(num + " is not a Duck Number.");
        }
    }
}
