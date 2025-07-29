import java.util.Scanner;

public class switchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 4;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1: Print Array");
            System.out.println("2: Reverse Print Array");
            System.out.println("3: Print Element by Index");
            System.out.println("4: Swap Elements");
            System.out.println("5: Reverse Array");
            System.out.println("0: Exit");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    printArray(arr);
                    break;
                case 2:
                    reversePrint(arr);
                    break;
                case 3:
                    printByIndex(arr, index);
                    break;
                case 4:
                    System.out.println("Enter indices to swap:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    swapArray(arr, a, b);
                    break;
                case 5:
                    reverseArray(arr);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation.");
            }
        }
    }

    // Printing the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    // Reverse Printing the array
    static void reversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // Print element using index
    static void printByIndex(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Swap element between index a to b
    static void swapArray(int[] arr, int a, int b) {
        if (a >= 0 && a < arr.length && b >= 0 && b < arr.length) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        } else {
            System.out.println("Index out of bounds");
        }
        printArray(arr);
    }

    // Reverse the array
    static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (last > first) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        printArray(arr);
    }
}
