import java.util.Scanner;

class DecreasingNum {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int prevdigit = -1; 
        boolean flag = true;
        for(int i = num ; i>0 ; i/=10)
		{
            int rem = i % 10; 
            if (rem <= prevdigit)
			{
                flag = false;  
                break;  
            }
            prevdigit = rem;  
        }
        if (flag)
            System.out.println(num+ " is Decreasing number.");
        else 
            System.out.println(num+ " is not an Decreasing number.");
    }
}
