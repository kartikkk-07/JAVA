import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort (int arr[]) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if ( arr[minPos] > arr[j] ) {
                    minPos = j;
                    swaps++;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        if (swaps == 0) {
            System.out.println("Your array is already sorted.\n");
        } else {
            System.out.print("Sorted array is: ");
            printArray(arr);
        }
    }
    public static void printArray (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of your array: ");
        int input = sc.nextInt();
        int arr[] = new int[input];
        System.out.println("Enter " + input + " elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nYour array is: ");
        printArray(arr);
        selectionSort(arr);
    }
}