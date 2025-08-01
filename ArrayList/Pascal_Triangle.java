import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> triangle = pascal(n);

        for(List<Integer> row : triangle){
            System.out.println(row);
        }
    }

    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> result = new ArrayList<>();
        if(n <= 0) return result;

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Build each row based on the previous
        for(int i = 1; i < n; i++){
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // First element is always 1

            for(int j = 1; j < prevRow.size(); j++){
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // Last element is always 1

            result.add(row);
        }
        return result;
    }
}
