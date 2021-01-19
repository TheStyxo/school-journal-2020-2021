
/**
 * Write a program to print the following pattern
 * 
 * 1
 * 
 * 2 4
 * 
 * 3 6 9
 * 
 * 4 8 12 16
 * 
 * 5 10 15 20 25
 */

public class Pattern3 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
