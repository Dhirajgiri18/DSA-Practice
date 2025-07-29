public class Pal {
    public static void main(String[] args) {
        String  str = "DhihD";

        int l = str.length();
        String rev = "";

        for(int i =l-1; i>=0; i--){
            rev += str.charAt(i);
        }

        

        if(str.equals(rev)) System.out.println("Its Palindrome");
        else System.out.println("Its Not a Palindrome");
    }
}
