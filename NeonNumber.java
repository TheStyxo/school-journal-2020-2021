
/**
 * Write a program to accept a number from the user and check and display if it is a Neon Number or not.
 * 
 * A Neon Number is a number whose sum of digits of the square of the number is equal to the number.
 */

import java.util.Scanner;

public class NeonNumber {
    static boolean checkNeon(int num) {
        int sum = 0;
        int square = num * num;

        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }
        return (sum == num);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (checkNeon(input))
            System.out.println("'" + input + "' is a neon number.");
        else
            System.out.println("'" + input + "' is not a neon number.");
    }
}