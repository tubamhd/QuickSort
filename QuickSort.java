import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = { 99, 5, 8, 3, 6,88, 72,1,77,55};
        System.out.println("Before sorting : " + Arrays.toString(input));
        SortClass test = new SortClass(input);
        System.out.println(Arrays.toString(test.liste));


    }
}
