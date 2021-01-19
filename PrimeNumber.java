
/**
 * Write a program to accept a number from the user and check and display if it is a Prime Number or not.
 * 
 * Prime numbers are numbers that have only 2 factors: 1 and themselves. 
 */

import java.util.Scanner;

public class PrimeNumber {
    static boolean checkComposite(int num) {
        if (num <= 1 || num <= 3)
            return false;

        if (num % 2 == 0 || num % 3 == 0)
            return true;

        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return true;

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (!checkComposite(input))
            System.out.println("'" + input + "' is a prime number.");
        else
            System.out.println("'" + input + "' is not a prime number.");
    }
}