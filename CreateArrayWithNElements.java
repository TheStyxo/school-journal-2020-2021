
/**
 * Write a program to let the user create an array with n number of elements and find the sum of all elements.
 */

import java.util.Scanner;

public class CreateArrayWithNElements {
    static String joinArr(int arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + ", " + arr[i] : Integer.toString(arr[i]);
        return arrStr;
    }

    static int arrSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
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

        System.out.println("Entered numbers were: " + "[" + joinArr(arr) + "]");
        System.out.println("Sum of all the numbers is: " + arrSum(arr));
    }
}
