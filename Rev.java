public class Rev {
    public static void main(String[] args) {
        int num = 12345; // Example number to reverse
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
            
        }
        System.out.println("Reversed Number: " + reversedNum); // Output the reversed number
    }
}
