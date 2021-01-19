
/**
 * Write a program to let the user enter a word and print out the following
 * pattern using that.
 * 
 * Sample word: BLUEJ
 * 
 * Sample pattern:
 * 
 * B
 * 
 * BL
 * 
 * BLU
 * 
 * BLUE
 * 
 * BLUEJ
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to be used in the pattern: ");
        String word = sc.nextLine();
        sc.close();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(Character.toString(word.charAt(j)).toUpperCase() + " ");
            System.out.println();
        }
    }
}
