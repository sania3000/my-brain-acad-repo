package ua.zp.braincad.sania3000.lab2;
public final class ResultPrinter
{
    public static void printBinary(int value1, String operator, int value2, int result) {
        String convertedValue1 = Integer.toBinaryString(value1);
        String convertedValue2 = Integer.toBinaryString(value2);
        print(convertedValue1, operator, convertedValue2, Integer.toBinaryString(result)+"("+result+")");
    }


    public static void printBinary(int value, String operator, int result) {
        String convertedValue = Integer.toBinaryString(value);
        print(convertedValue, operator, Integer.toBinaryString(result)+"("+result+")");
    }


    public static void print(int value1, String operator, int value2, int result) {
        print(String.valueOf(value1), operator, String.valueOf(value2), String.valueOf(result));
    }
    public static void print(Double value1, String operator, Double value2, Double result) {
        print(String.valueOf(value1), operator, String.valueOf(value2), String.valueOf(result));
    }

    public static void print(int value, String operator, int result) {
        print(String.valueOf(value), operator, String.valueOf(result));
    }

    public static void print(String value1, String operator, String value2, String result) {
        System.out.println(value1 + " " + operator + " " + value2 + " = " + result);
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("result = " + result);
    }


    public static void print(String value, String operator, String result) {
        System.out.println(value + " " + operator + " " + value + " = " + result);
        System.out.println(" value = " + value);
        System.out.println("result = " + result);
    }


    private ResultPrinter() {
        // private constructor for avoid creating instance of this class.
    }
}
