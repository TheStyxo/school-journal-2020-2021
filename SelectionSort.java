
/**
 * Write a program to arrange an integer array using the selection sort
 * technique.
 */

import java.util.Scanner;

public class SelectionSort {
    static String joinArr(int arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + ", " + arr[i] : Integer.toString(arr[i]);
        return arrStr;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
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
        sort(arr);
        System.out.println("Sorted numbers are: " + "[" + joinArr(arr) + "]");
    }
}
