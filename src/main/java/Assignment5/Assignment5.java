package Assignment5;

import java.util.Arrays;

/**
 * Created by troy.hill on 11/1/16.
 */
public class Assignment5 {
    public static void main(String[] args) {
        int[] num = new int[] {1,2,3,4};
        int[] num2 = new int[] {1,2,3};
        int[] num3 = new int[] {1,2,3};
        int[] num4 = new int[] {1,2,3};
        int[] num5 = new int[] {7,8,9};
        int[] num6 = new int[] {1,2,3,4,5,1,2,3,1,2};
//        int[] array = append(num,num2);

//        System.out.println(percentEven(num));
        System.out.println(equals(num2,num3));
//        System.out.println(Arrays.toString(array));
//        swapAll(num4, num5);
//        System.out.println(longestSortedSequence(num6));
    }

    //Return the percentage of even numbers in the Array
    public static double percentEven(int[] numbers) {
        if (numbers.length == 0) {
            return 0.00;
        }

        int even = 0, odd = 0;
        for (int number: numbers) {
            if (number % 2 == 0){
                even += 1;
            }
            else {
                odd += 1;
            }
        }

        if (even == 0) {
            return 0.00;
        }

        return ((double)even / ((double)even + (double)odd) * 100);

    }

    // Returns true if they contain exactly the same elements in the same order, and false otherwise
    public static boolean equals(int[] array1, int[] array2) {

        // check length
        if(array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    //returns a new array that contains the result of appending the second array's values at the end of the first array.
    public static int[] append(int[] array1, int[] array2) {
        int[] appendedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            appendedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = array1.length; j < array1.length + array2.length; j++) {
                appendedArray[j] = array2[i];
                i++;
            }
        }
        return appendedArray;
    }

    public static void swapAll(int[] array1, int[] array2) {
        int[] tempArray1 = array1.clone();
        for (int i = 0; i < array1.length; i++) {
            tempArray1[i] = array2[i];
            array2[i] = array1[i];
            array1[i] = tempArray1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static int longestSortedSequence(int[] array) {
        int count = 0;
        int highCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - (array[i-1]) == 1) {
                count++;
            }
            else{
                if (count > highCount){
                    highCount = count;
                }
                else{

                }count = 0;
            }
        }
        return highCount;
    }
}
