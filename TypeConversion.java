
/**
 * Write a program to show the use of valueOf(), parse() and toString() methods.
 */

public class TypeConversion {
    public static void main(String args[]) {
        String st1 = "25", st2 = "639", st3 = "32458", st4 = "29.31", st5 = "4826.92";

        short short1 = Short.parseShort(st1); // Convert string to short type using `Short#parseShort()`
        short short2 = Short.valueOf(st1); // Convert string to short type using `Short#valueOf()`
        System.out.println("Converted string to short type using `Short#parseShort()` => " + short1);
        System.out.println("Converted string to short type using `Short#valueOf()` => " + short2);

        int int1 = Integer.parseInt(st2); // Convert string to int type using `Integer#parseInt()`
        int int2 = Integer.valueOf(st2); // Convert string to int type using `Integer#valueOf()`
        System.out.println("Converted string to int type using `Integer#parseInt()` => " + int1);
        System.out.println("Converted string to int type using `Integer#valueOf()` => " + int2);

        long long1 = Long.parseLong(st3); // Convert string to long type using `Long#parseLong()`
        long long2 = Long.valueOf(st3); // Convert string to long type using `Long#valueOf()`
        System.out.println("Converted string to long type using `Long#parseLong()` => " + long1);
        System.out.println("Converted string to long type using `Long#valueOf()` => " + long2);

        float float1 = Float.parseFloat(st4); // Convert string to float type using `Float#parseLong()`
        float float2 = Float.valueOf(st4); // Convert string to float type using `Float#valueOf()`
        System.out.println("Converted string to float type using `Float#parseLong()` => " + float1);
        System.out.println("Converted string to float type using `Float#valueOf()` => " + float2);

        double double1 = Double.parseDouble(st5); // Convert string to double type using `Double#parseLong()`
        double double2 = Double.valueOf(st5); // Convert string to double type using `Double#valueOf()`
        System.out.println("Converted string to double type using `Double#parseLong()` => " + double1);
        System.out.println("Converted string to double type using `Double#valueOf()` => " + double2);

        String shortString = Short.toString(short1); // Convert short to String type using `Short#toString()`
        String intString = Integer.toString(int1); // Convert int to String type using `Integer#toString()`
        String longString = Long.toString(long1); // Convert long to String type using `Long#toString()`
        String floatString = Float.toString(float1); // Convert float to String type using `Float#toString()`
        String doubleString = Double.toString(double1); // Convert double to String type using `Double#toString()`
        System.out.println("Converted short to String type using `Short#toString()` => " + shortString);
        System.out.println("Converted int to String type using `Integer#toString()` => " + intString);
        System.out.println("Converted long to String type using `Long#toString()` => " + longString);
        System.out.println("Converted float to String type using `Float#toString()` => " + floatString);
        System.out.println("Converted double to String type using `Double#toString()` => " + doubleString);
    }
}
