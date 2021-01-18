
/**
 * Write a program to let the user create an array with n number of elements and then display that array in reverse order.
 */

import java.util.Scanner;

public class ReverseArray {
    static int[] reverseArr(int arr[]) {
        int[] rev = new int[arr.length];
        for (int i = 0, revi = arr.length - 1; revi >= 0; revi--, i++)
            rev[i] = arr[revi];
        return rev;

    }

    static String joinArr(int arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + ", " + arr[i] : Integer.toString(arr[i]);
        return arrStr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int input = sc.nextInt();

        int arr[] = new int[input];

        for (int i = 0; i < input; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int rev[] = reverseArr(arr);
        System.out.println("Entered numbers were: " + "[" + joinArr(arr) + "]");
        System.out.println("Reversed numbers are: " + "[" + joinArr(rev) + "]");
    }
}
