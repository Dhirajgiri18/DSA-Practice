import java.util.Arrays;

public class Duplicate_Zeroes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0,  4, 5, 0};

        Duplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Duplicates(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j=arr.length-1; j>=i + 1; j--){
                    arr[j] = arr[j-1];
                }
                i += 1;
            }
        }
        return arr;
    }
}
