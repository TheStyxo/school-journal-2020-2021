
/**
 * Write a program to accept a number from the user and check and display if it is a Composite Number or not.
 * 
 * A composite number is a positive integer that is not prime.
 */

import java.util.Scanner;

public class CompositeNumber {
    static boolean checkComposite(int num) {
        if (num <= 1)
            return false;

        if (num <= 3)
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

        if (checkComposite(input))
            System.out.println("'" + input + "' is a composite number.");
        else
            System.out.println("'" + input + "' is not a composite number.");
    }
}