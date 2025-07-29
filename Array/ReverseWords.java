public class ReverseWords {
    public static void main(String[] args) {
        String str = "My Name Is Dhiraj";

        String splitArr[] = str.split(" ");
        for(int i=splitArr.length-1; i>=0; i--){
            System.out.print(splitArr[i] + " ");
        }
    }
}
