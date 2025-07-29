package Set;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        String str = "code decode";
        System.out.println(find_Duplicates(str));

    }
    static Set<Character> find_Duplicates(String str){
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        char ch[] = str.toCharArray();

        for(char c : ch){
            if(!set.contains(c)){
                set.add(c);
            }else{
                duplicates.add(c);
            }
        }
        return duplicates;

    }
}
