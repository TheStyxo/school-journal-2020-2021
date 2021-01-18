
/**
 * Write a program to accept a number from the user and check and display if it is a Disarium Number or not.
 * 
 * A Disarium Number is a number whose sum of digits powered with their respective position is equal to the original position.
 */

import java.util.Scanner;

public class DisariumNumber {
    static int findLength(int num) {
        int length = 0;
        while (num != 0) {
            length++;
            num = num / 10;
        }
        return length;
    }

    static boolean checkDisarium(int num) {
        int length = findLength(num);
        int sum = 0, rem = 0, initialNum = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, length);
            num = num / 10;
            length--;
        }

        return (sum == initialNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (checkDisarium(input))
            System.out.println("'" + input + "' is a disarium number.");
        else
            System.out.println("'" + input + "' is not a disarium number.");
    }
}