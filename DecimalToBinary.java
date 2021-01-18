
/**
 * Write a program to accept a number from the user and display it as a binary string.
 */

import java.util.Scanner;

public class DecimalToBinary {
    static String decimalToBinaryString(int decimal) {
        String binary = "";
        int rem;

        while (decimal > 0) {
            rem = decimal % 2;
            binary = rem + binary;
            decimal = decimal / 2;
        }
        if (decimal == 3)
            binary = "0" + binary;
        return binary;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal to be converted to binary: ");
        int input = sc.nextInt();
        sc.close();

        System.out.println("'" + input + "' in binary is '" + decimalToBinaryString(input) + "'.");
    }
}
