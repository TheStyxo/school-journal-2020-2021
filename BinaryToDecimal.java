
/**
 * Write a program to accept a binary string from the user and display it as a number.
 */

import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryStringToDecimal(int binary) {
        int decimal = 0;
        int pos = 0, rem = 0;

        while (binary > 0) {
            rem = binary % 10;
            decimal = decimal + rem * (int) (Math.pow(2, pos));
            pos++;
            binary = binary / 10;
        }
        return decimal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary to be converted to decimal: ");
        int input = sc.nextInt();
        sc.close();

        System.out.println("'" + input + "' in decimal is '" + binaryStringToDecimal(input) + "'.");
    }
}
