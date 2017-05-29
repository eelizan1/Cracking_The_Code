package BigO;

/**
 * Created by eeliz_000 on 5/29/2017.
 */
public class Runtime {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        foo(array);
        System.out.println();
        printPairs(array);
        //printUnorderedPairs(array);
    }

    private static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
    private static void printPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    private static void printUnorderedPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}

