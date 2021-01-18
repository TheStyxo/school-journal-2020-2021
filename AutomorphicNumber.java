
/**
 * Write a program to accept a number from the user and check and display if it is an Automorphic Number or not.
 * 
 * A number is called Automorphic number if and only if its square ends in the same digits as the number itself.
 */

import java.util.Scanner;

class AutomorphicNumber {
    static boolean checkAutomorphic(int num) {
        int c = 0, sqr = num * num;
        int temp = num;

        while (temp > 0) {
            c++;
            temp = temp / 10;
        }

        int lastSquareDigits = (int) (sqr % (Math.pow(10, c)));

        return (num == lastSquareDigits);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        if (checkAutomorphic(input))
            System.out.println("'" + input + "' is an autotrophic number.");
        else
            System.out.println("'" + input + "' is not a autotrophic number.");
    }
}