
/**
 * Write a program to let the user create an array with n number of elements and
 * then perform a linear search on that array for an element.
 */

import java.util.Scanner;

public class LinearSearch {
    public static int search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].toLowerCase().equals(key.toLowerCase()))
                return i;
        return -1;
    }

    static String joinArr(String arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + ", " + arr[i] : arr[i];
        return arrStr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int input = sc.nextInt();

        String arr[] = new String[input];

        for (int i = 0; i < input; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            arr[i] = sc.next();
        }

        System.out.print("Enter element to search: ");
        String key = sc.next();
        sc.close();

        int found = search(arr, key);
        if (found > -1)
            System.out
                    .println("Found the value \"" + key + "\" at index[" + found + "], position[" + (found + 1) + "]");
        else
            System.out.println("Provided value was not found in the array!");
    }
}
