package Set;
import java.util.HashSet;
import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(IsIsogram(str));

    }
    static boolean IsIsogram(String str){
        boolean isogram = true;

        char ch[] = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char c : ch){
            if(set.contains(c)){
                isogram = false;
            }else{
                set.add(c);
            }
        }
        return isogram;
    }
}
