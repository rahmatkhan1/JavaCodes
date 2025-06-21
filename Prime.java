import java.util.*;
public class Prime {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is prime:");
    int num = sc.nextInt();
    boolean isPrime = true;
    for(int i=2;i<num-1;i++) {
        if(num % i == 0) {
            isPrime = false;
            break;
        }
    }
    System.out.println(num + " is " + (isPrime ? "a prime number." : "not a prime number."));
 }   
}
