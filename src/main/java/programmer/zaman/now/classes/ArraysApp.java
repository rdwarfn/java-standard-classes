package programmer.zaman.now.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,3,4,5,65,6,32,2,9,10,43,22
        };

        Arrays.sort(numbers);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 43));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] resultRange = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(resultRange));
    }
}
