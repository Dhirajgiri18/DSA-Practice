// Print the reversed string if it contains parenthesis then remove them
package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == ')') {
                continue;
            }
            stack.push(str.charAt(i));
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

        // String rev = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        // if (str.charAt(i) == '(' || str.charAt(i) == ')') {
        // continue;
        // }
        // rev += str.charAt(i);
        // }

        // System.out.println(rev);
    }
}
