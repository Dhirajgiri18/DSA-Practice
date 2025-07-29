package Permutations_Combinations;

public class Permute1 {
    public static void main(String[] args) {
        String str = "ABC";
    
        Permutation(str, 0, str.length()-1);
        
    }
    static void Permutation(String str, int left, int right){
        if(left == right){
            System.out.println(str);
        }else{
            for(int i=left; i<=right; i++){
                str = swap(str, left, i);
                Permutation(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }

    static String swap(String str, int i, int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return  String.valueOf(ch);
    }
}
