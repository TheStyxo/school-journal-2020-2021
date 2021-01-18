
/**
 * Write a program that has a function void print() that accepts a single
 * dimensional array x[] and n as the length of the array as function arguments.
 * The function calculates the sum of one digit and two digit numbers
 * separately. Design a main function to accept the size of the array and print
 * the required result by invoking the print() method.
 */

import java.util.Scanner;

public class SumOfSingleAndDoubleDigitNum {
    static void print(int x[], int n) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] > 0 && x[i] <= 9)
                sum1 += x[i];
            else if (x[i] > 10 && x[i] <= 99)
                sum2 += x[i];
        }

        System.out.println("Sum of all single digit numbers: " + sum1);
        System.out.println("Sum of all double digit numbers: " + sum2);
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

        System.out.println("Entered numbers were: " + "[" + joinArr(arr) + "]");
        print(arr, arr.length);
    }
}
