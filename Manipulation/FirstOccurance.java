package Manipulation;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 6};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print("First occurance number is: " + arr[j]);
                    break;
                }
            }


        }
    }
}
