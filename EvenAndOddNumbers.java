
/**
 * Write a program to let the user create an array with n number of elements and display the odd and even numbers separately.
 */

import java.util.Scanner;

public class EvenAndOddNumbers {
    static String joinArr(int arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + ", " + arr[i] : Integer.toString(arr[i]);
        return arrStr;
    }

    static boolean isEven(int num) {
        return (num % 2 == 0);
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

        System.out.print("Odd numbers are: [");
        for (int i = 0; i < arr.length; i++) {
            if (!isEven(arr[i]))
                System.out.print(i == 0 ? arr[i] : ", " + arr[i]);
        }
        System.out.print("]\nEven numbers are: [");
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i]))
                System.out.print(i == 0 ? arr[i] : ", " + arr[i]);
        }
        System.out.print("]");
    }
}
