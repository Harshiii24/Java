import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Loan Calcultor");
		System.out.print("Enter the amount: ");
		float amount = sc.nextFloat();
		System.out.print("Enter the rate of interest:" );
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure(months): ");
		int month= sc.nextInt();

		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);

		System.out.println();
		System.out.println("       Loan Calculator    ");
		System.out.println("Principal amount : "+amount);
		System.out.println("Rate of intrest : "+roi);
		System.out.println("Tenure : "+month+" months");
		float intYear = amount*roi/100;
		float totalIntre = intYear*con;
		System.out.println("Interest : "+totalIntre);
		float outstanding = amount+totalIntre;
		System.out.println("Total outstanding amount : "+outstanding);
		System.out.println("EMI : "+(outstanding/month)+" Rs");
		}
}
