// Find the minimum number from the given stack
package Stack;
import java.util.Stack;

public class Min {
    public static int Minimum(Stack<Integer> st){
        int min = Integer.MAX_VALUE;
        
        while(!st.empty()){
            if(min>st.peek()){
                min = st.peek();
            }else{
                st.pop();
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(45);
        st.push(6);
        st.push(2);

        int min = Minimum(st);
        System.out.println("The minimum is: " + min);
    }
}
