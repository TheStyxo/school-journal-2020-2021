
/**
 * Write a program to show the use of valueOf(), parse() and toString() methods.
 */

public class TypeConversion {
    public static void main(String args[]) {
        String st1 = "25", st2 = "639", st3 = "32458", st4 = "29.31", st5 = "4826.92";

        short short1 = Short.parseShort(st1);
        short short2 = Short.valueOf(st1);
        System.out.println("Converted string to short type using `parseShort()` => " + short1);
        System.out.println("Converted string to short type using `valueOf()` => " + short2);

        int int1 = Integer.parseInt(st2);
        int int2 = Integer.valueOf(st2);
        System.out.println("Converted string to int type using `parseInt()` => " + int1);
        System.out.println("Converted string to int type using `valueOf()` => " + int2);

        long long1 = Long.parseLong(st3);
        long long2 = Long.valueOf(st3);
        System.out.println("Converted string to long type using `parseLong()` => " + long1);
        System.out.println("Converted string to long type using `valueOf()` => " + long2);

        float float1 = Float.parseFloat(st4);
        float float2 = Float.valueOf(st4);
        System.out.println("Converted string to float type using `parseFloat()` => " + float1);
        System.out.println("Converted string to float type using `valueOf()` => " + float2);

        double double1 = Double.parseDouble(st5);
        double double2 = Double.valueOf(st5);
        System.out.println("Converted string to double type using `parseDouble()` => " + double1);
        System.out.println("Converted string to double type using `valueOf()` => " + double2);

        String shortString = Short.toString(short1);
        String intString = Integer.toString(int1);
        String longString = Long.toString(long1);
        String floatString = Float.toString(float1);
        String doubleString = Double.toString(double1);
        System.out.println("Converted short to String type using `toString()` => " + shortString);
        System.out.println("Converted int to String type using `toString()` => " + intString);
        System.out.println("Converted long to String type using `toString()` => " + longString);
        System.out.println("Converted float to String type using `toString()` => " + floatString);
        System.out.println("Converted double to String type using `toString()` => " + doubleString);
    }
}
