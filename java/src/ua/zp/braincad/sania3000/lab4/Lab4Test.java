package ua.zp.braincad.sania3000.lab4;
import java.util.Random;
import java.util.Arrays;

public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4];
        // TODO init it's array by new with size 4.
        firstArray[0] = 2;
        firstArray[3] = 5;
        // TODO insert some value to start of array and to end of array.

        int[] intArray = {2, 6, 8};
        // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        // TODO copy "intArray". Use copyOf...

        Arrays.sort(intArrayCopy);
        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        System.out.println(Arrays.toString(intArrayCopy));
        // TODO print "intArrayCopy", use Arrays toString.
        if (Arrays.equals(intArray, intArrayCopy)) {
            System.out.println("Arrays equals");
        } else
            System.out.println("Arrays not equals");

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        System.out.println("");
        int sum1 = 0;
        for (int i = 0; i < testArray.length; i++)
            sum1 += testArray[i];
        System.out.println(sum1);


        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sum2 = 0;
        for (int i = 0; i < testArray.length; i++)
            if (i % 2 != 0)
                sum2 += testArray[i];

        System.out.println(" " + sum2);


        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int max = testArray[0];
        for (int i = 0; i < testArray.length; i++)
            if (max < testArray[i])
                max = testArray[i];

        System.out.println(max);

        // 2.3)
        // TODO find max value in array.


        // PART 3
        int[][] twoarray = new int[3][4];
        //3.1
        // TODO create two-dimensional array with size [3][4]
        Random rand = new Random();

        for (int i = 0; i < twoarray.length; i++)
            for (int j = 0; j < twoarray[i].length; j++)
                twoarray[i][j] = rand.nextInt(7);
        for (int i = 0; i < twoarray.length; i++) {
            for (int j = 0; j < twoarray[i].length; j++)

                System.out.print(twoarray[i][j] + " ");
            System.out.println(" ");
        }
        int sum3 = 0;
        for (int i = 0; i < twoarray.length; i++)
            for (int j = 0; j < twoarray[i].length; j++)
                sum3 += twoarray[i][j];
        System.out.println("Сумма всех элементов двумерного массива равна " + sum3);
        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }
        for (int i = 2; i < matrix.length - 4; i++) {
            for (int j = 2; j < matrix[i].length; j += 3)

                System.out.print(" " + matrix[i][j]);
            System.out.println("");


        }


////

        long sum = 0;
        long max1 = matrix[0][0];

        long summax = 0;
        long summin = 0;
        for (int i = 2; i < matrix.length - 4; i++)
            for (int j = 2; j < matrix[i].length; j += 3){
                if (max1 < matrix[i][j]) {
                    max1 = matrix[i][j];
                }
            System.out.print(max1);
            System.out.println(" ");}}



    }

        // summax += max1;


        // long min = matrix[0][0];
        // for (int i = 2; i < matrix.length - 4; i++) {
        //for (int j = 0; j < matrix.length; j += 3)

        //       if (matrix[i][j] < min)
        //            min = matrix[i][j];
        //            System.out.println(min);



        //summin += min;
        // sum = max + min;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        //System.out.println(sum);







