
/**
 * Write a program to accept a number from the user and check and display if it is a Spy Number or not.
 * 
 * A Spy Number is a number whose sum of digits is equal to product if it's digits.
 */

import java.util.Scanner;

public class SpyNumber {
    static boolean checkSpy(int num) {
        int product = 1, sum = 0, digit;

        while (num != 0) {
            digit = num % 10;
            product = product * digit;
            sum = sum + digit;
            num = num / 10;
        }
        return (sum == product);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (checkSpy(input))
            System.out.println("'" + input + "' is a spy number.");
        else
            System.out.println("'" + input + "' is not a spy number.");
    }
}
