public class LongestString {
    public static void main(String[] args) {
        String arr[] = {"Dhiraj", "Dinesh", "Yogesh", "Dnyaneshwar", "Pritesh"};
        int maxLength = 0;
        String longestString = "";

        for(String str : arr){
            if(str.length()>maxLength){
                maxLength = str.length();
                longestString = str;
            }
        }

        System.out.println("Maximum length in the array is : " + longestString + " - " + maxLength);
    }
}
