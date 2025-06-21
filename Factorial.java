import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = sc.nextInt();

        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
