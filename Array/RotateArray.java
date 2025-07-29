import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 3;

        rotateArray(arr, k);

    }

    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}