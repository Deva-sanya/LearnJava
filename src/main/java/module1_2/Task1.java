package module1_2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {3, 8, 15, 17};
        System.out.println(Arrays.toString(getIndex(array1, 32)));
    }

    public static int[] getIndex(int[] array, int num) {
        int index = 0;
        int index2 = 1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    index = i;
                    index2 = j;
                }
            }
        }
        int[] result = {index, index2};
        return result;
    }
}
