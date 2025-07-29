import java.util.Arrays;

public class kthElement {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 7, 6};

       // Method 1
        // Arrays.sort(arr);
        // System.out.println(arr[1]);
        
        //Method 2
        for(int i=0; i<arr.length; i++){        //5
            for(int j=i+1; j<arr.length;j++){   //2
                if(arr[i]>arr[j]){      //
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         System.out.println("Sorted Array " + Arrays.toString(arr));
         System.out.println("2nd smallest element of the array is " + arr[1]);  // arrp[k+1]

         //Method 3
        // int result = Arrays.stream(arr).sorted().skip(1).findFirst().getAsInt();
        // System.out.println(result);
    }
}
