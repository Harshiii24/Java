import java.util.Scanner;

class IncreasingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int prevdigit = 10;  // Initialize with a value larger than any possible digit
        boolean flag = true;

        // Loop through the number by dividing it by 10 to extract digits
        while (num > 0) {
            int rem = num % 10;  // Extract the last digit
            if (rem >= prevdigit) {
                flag = false;  // If current digit is not strictly smaller than the previous one, set flag to false
                break;  // No need to continue checking
            }
            prevdigit = rem;  // Update prevdigit to the current digit
            num /= 10;  // Remove the last digit from num
        }

        // Print the result based on the flag
        if (flag) {
            System.out.println(num+ "is Increasing number.");
        } else {
            System.out.println(num+ "is nit an Increasing number.");
        }
    }
}
