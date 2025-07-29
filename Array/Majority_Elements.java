public class Majority_Elements {
    static int MajorityElement(int arr[]){

        int maj = arr[0];
        int count = 1;
        for(int i=1; i<arr.length;i++){
            if(arr[i] == maj){
                count++;
            }else{
                count--;
                if(count == 0){
                    maj = arr[i];
                    count = 1;
                }
            }
        }

        return maj;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 1,3, 3, 3,  1, 1, 2, 2, 3, 3, 2, 2};
        int maj = MajorityElement(arr);
        System.out.println("The majority element is: " + maj);
    }
}
