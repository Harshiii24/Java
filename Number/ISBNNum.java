//ISNB number stands for International Standard Book Number it is the unique 10 digit number before year 2016 after 2016 it is been made 13 digit unique number.
//The each digit of the number is multiplied with the number of position it is counting in the reverse order i.e. last digit is count as place value 1 and as 
//digit shifts towards right thr plce value increases we can call it as (rem*j : here rem represents the last digit whereas j represents the respective position of that digit) 
//after multiplying each digit with it's respective place value sum of all (rem*j) is done and if the mod of sum by 11 is equals to zero provided number is the 
//ISBN number.

class ISBNNum 
{
	public static void main(String[] args) 
	{
		long num = 1259060977l;
		int sum = 0;
		for(long i = num, j = 1 ; i>0; i/=10,j++)
		{
			long rem = i%10;
			sum += (rem*j);
		}
		if(sum%11==0)
			System.out.println(num+" is valid ISBN number.");
		else
			System.out.println(num +" is not a valid ISBN number.");
	}
}

//APPROACH
//1. Separate the last digit from the number.
//2. Multiply the separated digit by it's respective position starting from last.
//3. store the sum of (rem*j) into new variable sum initially assign sum is equal to zero.
//4. Once we are done for each digit present in number check whether obtained sum mod by 11 is zero (sum % 11 == 0).
//5. Result : If it is satisfying the condition then the provided number is valid ISBN number,  else it is not valid.

