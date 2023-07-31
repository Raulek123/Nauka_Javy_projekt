package ZmienneITypyDanych;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArgumentyWywolaniaProgramu {
    public static void main(String[] args) {
        System.out.println("Liczba argumentów: " + args.length);
        printArgs(args);
        int[] numbers = convertStringToIntArray(args);
        printSquares(numbers);
        printSum(numbers);
    }

    private static void printSum(int[] numbers) {
        List<String> list = new ArrayList<>();
        int sum = 0;
        for (int number : numbers) {
            list.add(Integer.toString(number));
            sum += number;
        }
        String leftSideSum = String.join("+", list);
        System.out.printf("%s=%d\n", leftSideSum, sum);
    }

    private static void printSquares(int[] numbers) {
        for (int number : numbers) {
            System.out.println(Math.pow(number, 2));
        }
        System.out.println();
    }

    private static void printArgs(String[] array) {
        for (String arg : array) {
            System.out.println(arg);
        }
        System.out.println();
    }

    private static int[] convertStringToIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }
        return intArray;
    }
}
