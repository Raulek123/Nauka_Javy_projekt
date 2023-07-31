package TabliceISterowanie.OperacjeNaTablicach;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 2},
                {2, 2}
        };

        int[][] numbersTwo = {
                {3, 3},
                {3, 3}
        };

        String[] letters = {"aa", "bb"};
        String[] lettersTwo = {"aaa", "bbb"};

        int[] numbersThree = {5, 3, 10, 100, 50, 200, 1000};

        int[][] numbersFour = {
                {1, 2, 3},
                {7, 8, 9},
                {3, 4, 5}
        };

        System.out.println(Arrays.toString(maxRow(numbersFour)));

    }

    private static int[][] getArrayWithGreaterSum(int[][] tab1, int[][] tab2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                sum1 += tab1[j][i];
            }
        }

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                sum2 += tab2[j][i];
            }
        }
        return sum1 > sum2 ? tab1 : tab2;
    }

    private static int getArrayWithBestLetter(String[] tab1, String[] tab2){
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < tab1.length; i++) {
            sum += tab1[i].length();
        }
        for (int i = 0; i < tab2.length; i++) {
            sum2 += tab2[i].length();
        }
        return Math.max(sum, sum2);
    }

    private static int getArrayWithBestNumber(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }

    private static int getArrayWithMinNumber(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (min > tab[i]){
                min = tab[i];
            }
        }
        return min;
    }

    private static int[] getArrayWithBestNumberOfArrays(int[][] tab) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < tab.length; i++) {
            sum1 += tab[0][i];
            sum2 += tab[1][i];
            sum3 += tab[2][i];
            }
        if (sum1 >= sum2 && sum1 >= sum3) {
            return tab[0]; // Zwracamy wiersz 0
        } else if (sum2 >= sum1 && sum2 >= sum3) {
            return tab[1]; // Zwracamy wiersz 1
        } else {
            return tab[2]; // Zwracamy wiersz 2
        }
    }

    static int[] maxRow(int[][] array) {
        int maxSum = Arrays.stream(array[0]).sum();
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int rowSum = Arrays.stream(array[i]).sum();
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }
}
