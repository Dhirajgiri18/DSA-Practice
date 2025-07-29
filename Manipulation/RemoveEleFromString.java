package Manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEleFromString {
    public static void main(String[] args) {
        String[] arr = {"Dhiraj", "Yogesh", "Dinesh"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
