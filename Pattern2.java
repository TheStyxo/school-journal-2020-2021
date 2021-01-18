
/**
 * Write a program to print the following pattern
 * 
 * A
 * 
 * AB
 * 
 * ABC
 * 
 * ABCD
 * 
 * ABCDE
 */

public class Pattern2 {
    public static void main(String args[]) {
        int c = 65;

        for (int i = 1; i <= 5; i++) {
            c = 65;
            for (int j = 1; j <= i; j++, c++)
                System.out.print((char) c);
            System.out.println();
        }
    }
}
