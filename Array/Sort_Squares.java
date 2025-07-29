import java.util.Arrays;

public class Sort_Squares {
    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 1, 6 ,3};
        int res[] = new int[arr.length];

        int low = 0;
        int high =arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            int lowsquare = arr[low] * arr[low];
            int highsquare = arr[high] * arr[high];
            if(lowsquare > highsquare){
                res[i] = lowsquare;
                low++;
            }else{
                res[i] = highsquare;
                high--;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
