package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 11, 12, 13};
        boolean isCuteNumber = checkCuteNumber(numbers);
        System.out.println(isCuteNumber);
    }

    public static boolean checkCuteNumber(int[] numbers) {
        int [] evenNumbers = getEvenNumbers(numbers);
        int maxEvenNumber = getMaxNumber(evenNumbers);
        return checkIsGreaterThan10(maxEvenNumber);
    }

    public static int[] getEvenNumbers(int[] numbers) {
        int [] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[i] = numbers[i];
            }
        }
        return result;
    }

    public static int getMaxNumber(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static boolean checkIsGreaterThan10(int number) {
        return number > 10;
    }

}