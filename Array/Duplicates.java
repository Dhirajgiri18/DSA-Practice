import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 1, 2, 8, 9, 7, 6, 8};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
        if(!set.add(num)){
            duplicates.add(num);
            }
        }

            System.out.println(set);
            System.out.println(duplicates);
    }
}
