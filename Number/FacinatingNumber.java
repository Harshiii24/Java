//FACINATING NUMBER:

//Facinating number is the unique number that when we multiply the number by 2 and 3 and concatinte it to the original number it should contain all the digits from
// 1 to 9 that too for exactly one time.
//Using Number
import java.util.Scanner;
class FacinatingNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); //372 -> 327000 -> 327654 -> 327654000 -> 327654981
		int temp = num;  //327
		boolean flag = true;

		//for loop to get the multiplication of the provided number by 2 and 3 and concatinate it to the original number.
		
		for(int i = 2 ; i<=3 ; i++)  //i = 2 ; 2<=3 (true) ; i++ -> (1st iter) i++ -> 3 ; 3<=3 (true) ; i++ ->(2nd iter) i++ -> 4 ; 4<=3 (false : for loop breaks) 
		{
			num = num*1000; // 327*1000 -> 327000 (1st iter) --> 327654*1000 -> 327654000
			num += temp*i;  // 327000 += 327*i (i -> 2) -> 327000 + = 654 -> 327654 (1st iter complete) 
							// 327654000 += 327*i (i -> 3) -> 327654000 += 981 -> 327654981 (2nd iter complete)
		}

		//for loop to check whether the number is facinating or not for that we use nested loop

		
		//for loop1 Start
		//This loop will run for 9 times from 1 to 9 
		for(int j = 1 ; j<= 9 ; j++) // i -> 1 (t); i -> 2 (t); i -> 3 (t); i -> 4  (t); i -> 5 (t); i -> 6 (t); i -> 7 (t); i -> 8 (t); i -> 9 (t); i -> 10 (false: loop break)
		{
			int count = 0;  //init count is zero 
			//main for loop Start
			//This for loop is used to extract the last digit from the number
			for(int i = num ; i> 0 ; i/=10) // i = 327654981 (here the last digit will be extacted in every iteration therefore this loop will run for number length times.)
											//        1   8   9   4   5   6   7   2   3
											//       1st 2nd 3rd 4th 5th 6th 7th 8th 9th
											//       vlaue fetched in every iteration
			{
			int rem = i%10;   // rem -> 1 ; rem -> 8 ; rem -> 9
				if(rem == j)  // 1 == j (j -> 1) (True) -> 1 == j (j -> 2) (false) ->  1 == j (j -> 3) (false) -> 1 == j (j -> 4) (false)  1 == j (j -> 5) (false)  
				              // 1 == j (j -> 6) (false) -> 1 == j (j -> 7) (false) -> 1 == j (j -> 8) (false) -> 1 == j (j -> 9) (false) (for rem -> 1)
							  // 8 == j (j -> 1) (false) -> 8 == j (j -> 2) (false) ->  8 == j (j -> 3) (false) -> 8 == j (j -> 4) (false)  8 == j (j -> 5) (false)  
				              // 8 == j (j -> 6) (false) -> 8 == j (j -> 7) (false) -> 8 == j (j -> 8) (true) -> 8 == j (j -> 9) (false)  (for rem -> 8)
					count ++; // 0 -> 1 (rem -> 1)  // 0 -> 1 (rem -> 8)
			}
			// nested for loop breaks 

			if(count!=1) // count -> 1 condition does not satisfy hence flag remains true. (for rem -> 1 )
						 // count -> 1 condition does not satisfy hence flag remains true. (for rem -> 8 )
			{
				flag = false;
				break;
			}
		}
		if(flag) //if condition will satisfied if count is exactly one for each digit in the number. 
			System.out.println(temp+" is a facinating number.");
		else  //If count of the digit in the number is 0 or greater than 1 it will satisfy else contition 
			System.out.println(temp+" is not a facinating number.");

	}
}

//APPROACH
//1. Multiply the number by 2 and 3 for that I run the loop from i = 2 to i<=3.
//2. After getting the multiplication i've concatinated it with the original number we can either use string or else can go with number to store the concatinated number.
//3. While using number method to store the concatinated value multiply the number by 1000  i.e (num*1000) so that it will create enough space to concatinate next number. 
//4. We have to run the loop starting from 1 to 9 to check whether the cancatinated number contains all the digits ranging from 1 to 9 that too for exactly equal to one time.
//5. Inside this loop we initialize the count as 0  -> int count = 0; so that we can get the count of each digit present in number from 1 to 9.  
//6. Then we run the nested for loop which will fetch the digits from the concatinated number in each iteration one by one and it will check whether it is equal to value of outer for loop.
//   If yes the fetched digit is equal to the value of outer for loop condition satisfied then count will be incremented by one in such way this loop will check for all the digits present 
//   in the concatinated number. And with the help of this loop we come to know that the value of outer for loop(1-9) is whether present in the concatinated number and if 
//   present than how many times with the help of count. After checking of all the digits present in concatinated number for loop breaks.(It will iterate for the number of digits present in the concatinated number.) 
//7. once the nested for loop break we check the condition that if the count is not exactly equals to one then make the flag false which we've initially declared in main method as true and break the loop.
//     if(count!=1){
//        flag = false; 
//        break; }
// 8. if that condition is not satisfied means the count is exactly equals to one and then the value of j increments by 1 i.e. j++ and it moves from initial 1 to 2 and second iteration starts.
//9. This loop will continue till condition becomes false.
//10. Once the loop is break then we check for our final condition where we can either use ternary/conditional operator ot if else statement.
//11. If flag remains true till the very last it means that the condition is satisfied and the number entered is the valid facinating number.
//12. else the number is not facinating.


