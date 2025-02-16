import java.util.Scanner;
class PinVeri  
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int seconds = 5000;
		int storePin = 123;
		outerLoop:
		for(;;)
		{
			int attempt = 3;
			do{
				System.out.println("Enter the pin : ");
				int pin = sc.nextInt();
				if(pin == storePin)
				{
					System.out.println("Phone unlock");
					break outerLoop;
				}
				else{
					System.out.println("Wrong pin");
					System.out.println("Attempts left are "+(attempt-1));
				}
				attempt --;
			}
			while(attempt>=1);
			System.out.println();
			System.out.println("Phone is disable for "+(seconds/1000)+" seconds");
			Thread.sleep(seconds);
			seconds*=2;
			System.out.println();
		}
	}
}
