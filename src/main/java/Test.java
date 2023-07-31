import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 3, 1, 2, 0};
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j] > numbers[j + 1]){
                 temp = numbers[j];
                 numbers[j] = numbers[j + 1];
                 numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
