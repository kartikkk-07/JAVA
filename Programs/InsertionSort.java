public class InsertionSort {
    public static void insertionSort (int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >=0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
                count++;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
        if (count == 0) {
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
        int arr[] = {1,2,3,4,5};
        int arr1[] = {58,42,52,47,65};
        insertionSort(arr);
        insertionSort(arr1);
    }
}