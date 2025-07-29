import java.util.Arrays;

public class Swap1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 8, 7 };

        int[] newArray = swap(arr);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] swap(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
    
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        return arr;
    
    }
}

