package Queue;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Duplicate_Zeroes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0,  4, 5, 0};

        Duplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Duplicates(int[] arr){
        Queue<Integer> qe = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            qe.add(arr[i]);

            if(arr[i] == 0){
                qe.add(0);
            }
            arr[i] = qe.remove();
        }
        
        return arr;
    }
}
