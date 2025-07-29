// Find the first non repeating character fromm the given string

public class First_Non_Repeated_Character{
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(Characterr(str));

    }
    static char Characterr(String str){
        for(int i=0; i<str.length(); i++){
            boolean isRepeated = false;
            for(int j=0; j<str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    isRepeated = true ;
                    break;
                }
            }
            if(!isRepeated){
                return str.charAt(i);
            }

        }

        return '0'; // return 0 if all characters are repeated
    }
}