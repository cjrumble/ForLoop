package academy.learnprogramming;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //**** for(init; terminate; increment;) { ****
//        for (int i = 2; i <= 8; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }

        for (int i = 2; i <= 8; i++) {
            System.out.println("$10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("          ");
        for (int i = 8; i >= 2; i--) {
            System.out.println("$10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("???          ");
        for (int i = 2; i <= 8; ++i) { // no difference with pre-increment
            System.out.println("$10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("          ");
        long start = System.nanoTime();
        calculatePrime();
        long end = System.nanoTime();
        System.out.printf("That took: %d ms.%n", TimeUnit.NANOSECONDS.toMillis(end - start));

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


//      CHALLENGE
//      Create a for statement using any range of numbers
//      Determine if the number is a prime number using the isPrime method
//      if it is a prime number, print it out AND increment a count of the
//      number of prime numbers found
//      if that count is 3 exit for loop
//      hint: Use the break; statement to exit

    public static void calculatePrime() {
        int count = 0;
        for (int i = 2; i <= 100000000; i=i+2) { // for our range of numbers... then add 2 to subsequent odd numbers
            if (i == 2) { // 2 is special case even number
                isPrime(i);
                i++; // increment to odd
            } if (isPrime(i)) { // check odd number for prime
                count++; //
                    if (count == 1000000) {
                        System.out.println("Exit for loop");
                        break;
                    }
                }
            }
        }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
         for (int i = 2; i <= n/2; i++) { // OLD code check for Prime @100M(), 10M(), 1M(), 100K().
         // for (int i = 2; i <= (long) Math.sqrt(n); i++) { // NEW calculation improves 82x faster than original @100M numbers, 82x for 10M, 55x for 1M, 8x for 100K
            //System.out.println("Looping " +i); // count loops to check for better performance
             //System.out.println("i <= (long) Math.sqrt(n) = " + (long) Math.sqrt(n));
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println("Number " + n + " is a prime number!");
        return true;
    }
}


