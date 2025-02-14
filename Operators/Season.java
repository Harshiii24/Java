import java.util.Scanner;
class Season
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		String month = sc.next().toLowerCase();
		String op = (month.equals("oct")||month.equals("nov")||month.equals("dec")||month.equals("jan"))?(month+" is winter."):(month.equals("feb")||month.equals("mar")||month.equals("apr")||month.equals("may"))?(month+" is summner."):(month.equals("jun")||month.equals("jul")||month.equals("aug")||month.equals("sep"))?(month+" is monsoon."):("Invalid month!!");
		System.out.println(op);
	}
}