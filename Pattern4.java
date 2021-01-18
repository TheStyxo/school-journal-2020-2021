
/**
 * Write a program to print the following pattern
 * 
 * 1
 * 
 * 1 3
 * 
 * 1 3 5
 * 
 * 1 3 5 7
 * 
 * 1 3 5 7 9
 */

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int d = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(d + " ");
                d = d + 2;
            }
            System.out.println();
        }
    }
}
