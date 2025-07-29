package Manipulation;

public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {10, 20, 2, 90, 40};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff > max ){
                    max = diff;
                }
            }
        }

        System.out.println("The maximum difference is: " + max);

    }
}
