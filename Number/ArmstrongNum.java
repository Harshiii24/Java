//Armstrong number is the unique number where first we calculate the legth of the number by taking the count because each digit of the number is extracted and 
//calculated as digit^length after calculting for each digit we do sum of them if sum is equal to num then that number is called as Armstrong number.

import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int sum = 0 , len = 0; // sum =  0 -> 27 (1st iter) 27 -> 152 (2nd iter) 152-> 153 (3rd iter)      
		                       // len = 0 -> 1 (1st iter) 1->2 (2nd iter) 2->3 (3rd iter)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");  //153
		int num = sc.nextInt();
		int dup = num;  //153
		for(int i = num ; i>0 ; i/=10 )   // initial -> 153 > 0 (t) updated -> 15 (1st iter) initil -> 15 > 0 (t) updated -> 1 (2nd iter) 
		                                  // initial -> 1 > 0 (t) updated -> 0(3rd iter)  0>0(f : for loop breaks)
			len++;  // 0+1 -> 1 (1st iter) -> 1+1 -> 2 (2nd iter) -> 2+1 -> 3 (3rd iter)

		//FOR LOOP BREAKS

		while(num>0) // initial -> 153 > 0 (t) (1st iter) initil -> 15 > 0 (t) (2nd iter) 
		             // initial -> 1 > 0 (t) (3rd iter)  0>0(f : for loop breaks)
		{
			int rem = num%10;   // 153 % 10 -> 3 (1st iter) -> 15 % 10 -> 5 (2nd iter) 1 % 10 -> 1 (3rd iter)
			int pow = 1;
			for(int j = 1;j<=len;j++)  // j<=3(len)
				pow*=rem;  //for rem -> 3 --> (j = 1 , 1*3 -> 3 ) (1st iter) ; (j = 2 , 3*3 -> 9) (2nd iter) ; (j = 3 , 9*3 -> 27 (3rd iter))
						   //for rem -> 5 --> (j = 1 , 1*5 -> 5 ) (1st iter) ; (j = 2 , 5*5 -> 25) (2nd iter) ; (j = 3 , 25*5 -> 125 (3rd iter))
						   //for rem -> 1 --> (j = 1 , 1*1 -> 1 ) (1st iter) ; (j = 2 , 1*1 -> 1) (2nd iter) ; (j = 3 , 1*1 -> 1 (3rd iter))

			//FOR LOOP BREAKS

			sum+=pow; // sum = 0 -> 0 + 27 -> 27 (After 1st iteration of for loop)
					  // sum = 27 -> 27 + 125 -> 152 (After 2nd iteration of for loop)
					  // sum = 152 -> 152 + 1 -> 153 (After 3rd iteration of for loop)
			num/=10;  // updated : 153/10 -> 15 (1st iter)
					  // updated : 15/10 -> 1 (2nd iter) 
					  // updated : 1/10 -> 0 (3rd iter)
		}
		                 // 153 == 153 (true) -> 2nd operand will get executed -> 153 is Armstrong number
		System.out.println(dup == sum?dup+" is Armstrong Number":dup+" is not Armstrong Number");
                         //operand 1 ? operand 2 : operand 3 ;  
	}
}

//APPROACH
//1. Calculate the length of the number.
//2. Extract each digit of the number with the help of loop 
//3. Extracted digit is raise to the power of length of number (digit^length)
//4. Calculate the sum of all (digit^length).
//5. If sum is equal to the original number then it is a valid Armstrong number else not a valid armstrong number.
