public class Arr1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = 4;

        //printArray(arr);
        //reversePrint(arr);
        //printByIndex(arr,index);
        //swapArray(arr,2,6);
        //reverseArray(arr);
        
        
        }

        //Printing the array
        static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+ "\t");
        }
        }

        //Reverse Printing the array
        static void reversePrint(int[] arr){
            for(int i=arr.length-1; i>=0; i--){
                System.out.print(arr[i]+ "\t");
            }
        }
        
        //Print element using index
        static void printByIndex(int[] arr,int index){
            System.out.println(arr[index]);
        }

        //swap element between index a to b
        static void swapArray(int[] arr, int a, int b){
            int temp;
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b]= temp;

                for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i] + "\t");
            }
        }

        //Reverse the array
        static void reverseArray(int[] arr){
            int first = 0;
            int last = arr.length-1;

            while(last>first){
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                    first++;
                    last--;
            }
            printArray(arr);
        }
}