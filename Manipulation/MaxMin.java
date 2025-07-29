package Manipulation;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 2, 3};
        int min =arr[arr.length-1];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Min Element : " + min);
        System.out.println("Max Element : " + max);

    }
}
