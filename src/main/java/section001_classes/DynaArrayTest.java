package section001_classes;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

        System.out.println("dynaArray1: ");
        System.out.println(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);

        System.out.println("dynaArray2: ");
        System.out.println(Arrays.toString(dynaArray2.result) + " ");
        System.out.println(dynaArray2.count);

        System.out.println("******************************");

        dynaArray1.add(5);

        System.out.println("dynaArray1: ");
        System.out.println(Arrays.toString(dynaArray1.result) + " ");
        System.out.println(dynaArray1.count);
    }
}
