
/**
 * Write a program to accept a number from the user and check and display if it is a Duck Number or not.
 * 
 * A Duck number is a positive number which has zeroes present in it.
 * Note, numbers with only leading 0s is not considered as Duck Number.
 */

import java.util.Scanner;

class DuckNumber {
    static int findLength(int num) {
        int length = 0;
        while (num != 0) {
            length++;
            num = num / 10;
        }
        return length;
    }

    static int intAt(final int num, final int atIndex) {
        return Character.getNumericValue(Integer.toString(num).charAt(atIndex));
    }

    static boolean checkDuck(final int num) {
        final int len = findLength(num);
        int zeroCount = 0;
        int n;

        for (int i = 1; i <= len; i++) {
            n = intAt(num, i - 1);
            if (n == 0)
                zeroCount++;
        }
        return (zeroCount > 0 && intAt(num, 0) != 0);
    }

    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int input = sc.nextInt();
        sc.close();

        if (checkDuck(input))
            System.out.println("'" + input + "' is a duck number.");
        else
            System.out.println("'" + input + "' is not a duck number.");
    }
}