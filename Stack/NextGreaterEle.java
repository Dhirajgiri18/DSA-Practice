package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEle {
    public static int[] greaterArray(int arr[]) {
        int l = arr.length;
        int brr[] = new int[l]; // Array to store the next greater elements
        Stack<Integer> st = new Stack<>();

        // Traverse the array from right to left
        for (int i = l - 1; i >= 0; i--) {
            // Pop elements from the stack until we find a greater element
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // If the stack is empty, there is no greater element on the right
            if (st.empty()) {
                brr[i] = -1;
            } else {
                // The top of the stack is the next greater element
                brr[i] = st.peek();
            }
            // Push the current element to the stack
            st.push(arr[i]);
        }
        return brr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 6, 9 };
        int[] brr = greaterArray(arr);
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        // Print the next greater elements array
        System.out.println("Next greater elements: " + Arrays.toString(brr));
    }
}
