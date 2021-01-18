
/**
 * Write a program to print the floyds triangle with rows given by the user.
 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for floyd's triangle: ");
        int input = sc.nextInt();
        sc.close();

        int number = 1, counter;
        for (counter = 1; counter <= input; counter++) {
            for (int j = 1; j <= counter; j++) {
                System.out.print(number + " ");
                number++;
            }
            // For new line
            System.out.println();
        }
    }
}
