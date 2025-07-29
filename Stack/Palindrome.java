package Stack;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Dhiraj";

        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while(!stack.empty()){
            reversedString.append(stack.pop());
        }

        if(str.equals(reversedString.toString())){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
