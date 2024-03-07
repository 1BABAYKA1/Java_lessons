import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = fillArray(10000);
        Instant start = Instant.now();
        insertionSort(arr);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Время выполнения метода: " + duration.toSeconds() + " секунд");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;

            while (j >= 0 && currentElement < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currentElement;
        }
    }

    public static int[] fillArray(int size) {
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
        }

        return arr;
    }

}
