import java.util.Scanner;
public class BubbleSort {

    public static void bubbleSort (int arr[]) {
        int swaps = 0;
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++; // Checking if array is already sorted
                }
            }
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
        int index = sc.nextInt();
        int arr[] = new int[index];
        System.out.println("\nEnter " + index + " elements: ");
        for(int i = 0; i < index ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEntered array is: ");
        printArray(arr);
        bubbleSort(arr);
        sc.close();
    }
}