
/**
 * Write a program to accept a number from the user and check and display if it is a Happy Number or not.
 * 
 * A Happy Number is a number which will yield 1 when it is replaced by the sum 
 * of the square of its digits repeatedly. If this process results in an endless cycle of numbers 
 * containing 4, then the number is called an unhappy number.
 */

import java.util.Scanner;

class Happy {
    static int calculateSum(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

    static boolean checkHappy(int num) {
        int sum = num;

        while (sum != 1 && sum != 4)
            sum = calculateSum(sum);

        return (sum == 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (checkHappy(input))
            System.out.println("'" + input + "' is a happy number.");
        else
            System.out.println("'" + input + "' is a sad number :(");
    }
}