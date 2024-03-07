import java.util.Arrays;
import java.util.Random;

public class ArrayFiller {

    public static void main(String[] args) {
        int[] arr = fillArray(10);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] fillArray(int size) {
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
