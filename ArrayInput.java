
/**
 * Write a program to let the user enter country names as elements of an array
 * and display the entire array at the end.
 */

import java.util.Scanner;

public class ArrayInput {
    static String joinArr(String arr[]) {
        String arrStr = null;
        for (int i = 0; i < arr.length; i++)
            arrStr = arrStr != null ? arrStr + "\n- " + arr[i] : "- " + arr[i];
        return arrStr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of countries: ");
        int input = Integer.parseInt(sc.nextLine());

        String arr[] = new String[input];

        for (int i = 0; i < input; i++) {
            System.out.print("Enter country [" + (i + 1) + "]: ");
            arr[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("Entered countries were:\n" + joinArr(arr));
    }
}
