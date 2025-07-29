package Manipulation;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<arr.length; i++){
            System.err.println("Enter the element : ");
            arr[i] = sc.nextInt();
        }
    }
}
