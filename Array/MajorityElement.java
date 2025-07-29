public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3,1, 3, 8, 7, 5, 4, 2, 4, 9, 3};

        System.out.println(Maj(arr));
    }
    static int Maj(int[] arr){
        int count =0;
        int majorEle = arr[0];
        for(Integer num : arr){
            if(num == majorEle){
                count++;
            }else{
                count--;
                if(count == 0){
                    majorEle = num;
                    count =1;
                }
            }
        }
        return majorEle;
    }
}
