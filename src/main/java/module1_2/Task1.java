package module1_2;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {3, 8, 15, 17};
        int[] result = getIndex(array1, 32);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
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
