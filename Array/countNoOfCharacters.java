public class countNoOfCharacters {
    public static void main(String[] args) {
        String str = "Welcome to Spyder world";

        int count =0;

        if(str.charAt(0)!=' '){
            count++;
        }

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c!=' ' && c+1!=(' ')){
                count++;
            }
        }
        System.out.println("Total no of strings are: " + count);
    }
}
