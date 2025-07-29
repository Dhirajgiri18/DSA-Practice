package Manipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementInAtleastTwoArrays {
    public static void main(String[] args) {
        
        Integer[] a1= {1, 2, 3, 9, 8, 7};
        Integer[] a2= {4, 1, 2, 10, 15};
        Integer[] a3= {5, 1,2, 4, 10};

        List l1 = Arrays.asList(a1);
        List l2 = Arrays.asList(a2);
        List l3 = Arrays.asList(a3);

        HashSet<Integer> set = new HashSet<>();

        set.addAll(l1);
        set.addAll(l2);
        set.addAll(l3);

        for(Integer num : set){
            if(l1.contains(num) && l2.contains(num) || l1.contains(num) && l3.contains(num) || l2.contains(num) && l3.contains(num)){
                System.out.print(num);
            }
        }

    }
}
