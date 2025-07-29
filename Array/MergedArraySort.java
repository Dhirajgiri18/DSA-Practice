import java.util.Arrays;

public class MergedArraySort {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4};
        int[] arr2 = {9, 3, 7};

        
        int[] res = MergedArray(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
    static int[] MergedArray(int[] arr1, int[] arr2){
        int res[] = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }
        while(i< arr1.length){
            res[k++] = arr1[i++];
        }
        while(j<arr2.length){
            res[k++] = arr2[j++];
        }
        return res;
    }
}
