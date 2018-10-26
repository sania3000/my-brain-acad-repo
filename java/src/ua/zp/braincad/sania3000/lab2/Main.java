package ua.zp.braincad.sania3000.lab2;


/**
 * Base class for test busyness logic of app.
 */
public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        System.out.println("Create instance of IntegralCalculator");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("Create instance of BooleanCalculator");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        System.out.println("Create instance of DoubleCalculator");
        DoubleCalculator doubleCalculator = new DoubleCalculator();

        System.out.println("\nTry calc int sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);
        System.out.println('\n');

        //TODO call sub
        System.out.println("\nTry calc int sub:");
        int sub = calculator.sub(a, b);
        ResultPrinter.print(a, "-", b, sub);
        System.out.println('\n');

        System.out.println("Try calc int multiply:");
        int multiply = calculator.mul(a, b);
        ResultPrinter.print(a, "*", b, multiply);
        System.out.println('\n');

        //TODO call div
        System.out.println("Try calc int div:");
        int div = calculator.div(a,b);
        ResultPrinter.print(a,"/",b, div);
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc boolean <<:");
        ResultPrinter.printBinary(a,"<<", b, booleanCalculator.shiftLeft(a, b));
        booleanCalculator.shiftLeft(2, 4);
        System.out.println('\n');

        //TODO call >>
        System.out.println("Try calc boolean >>");
        ResultPrinter.printBinary(a,">>",b, booleanCalculator.shiftRight(a,b));
        booleanCalculator.shiftRight(2,4);
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean XOR:");
        ResultPrinter.printBinary(a,"^", b, booleanCalculator.xor(a, b));
        System.out.println('\n');

        //TODO call inverse

    Double a1 = 5.0;
    Double b1 = 4.1;
        System.out.println("\nTry calc  sumDouble");
        Double sum1 = doubleCalculator.sum1(a1,b1);
        ResultPrinter.print(a1,"+",b1,sum1);


        System.out.println("\nTry calc  subDouble");
        Double subDouble = doubleCalculator.subDouble(a1,b1);
        ResultPrinter.print(a1,"-",b1,subDouble);

        System.out.println("\nTry calc  subDouble");
        Double mulDouble = doubleCalculator.mulDouble(a1,b1);
        ResultPrinter.print(a1,"*",b1,mulDouble);

        System.out.println("\nTry calc  divDouble");
        Double divDouble = doubleCalculator.divDouble(a1,b1);
        ResultPrinter.print(a1,"/",b1,divDouble);
    }



}
