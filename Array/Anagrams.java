import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if(checkAnagram(s1, s2)){
            System.out.println("Strings are Anagrams");
        }else{
            System.out.println("Strings are not Anagrams");
        }


    }
    public static boolean checkAnagram(String s1, String s2){
        s1 = s1.replaceAll("^a-zA-Z", "").toLowerCase();
        s2 = s2.replaceAll("^a-zA-Z", "").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }
}
