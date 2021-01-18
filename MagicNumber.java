
/**
 * Write a program to accept a number from the user and check and display if it is a Magic Number or not.
 * 
 * A Magic Number is a number whose sum of digits when calculated recursively till a single digit is obtained is equal to 1.
 */

import java.util.Scanner;

public class MagicNumber {
    static boolean checkMagic(int num) {
        int rem = 1, sum = 0;

        while (num > 9) {
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        return (num == 1);
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int input = sc.nextInt();
        sc.close();

        if (checkMagic(input))
            System.out.println("'" + input + "' is a magic number.");
        else
            System.out.println("'" + input + "' is not a magic number.");
    }
}
