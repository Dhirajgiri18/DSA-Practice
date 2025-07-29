package Manipulation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 8, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : arr){
            list.add(ele);
        }
        System.out.println(list);

        String[] brr = {"Dhiraj", "yogesh", "Dinesh"};
        List<String> list1 = Arrays.asList(brr);

        System.out.println(list1);


    }
}
