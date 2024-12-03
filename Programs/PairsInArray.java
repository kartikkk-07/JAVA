public class PairsInArray {

    public static void arrayPairs (int arr[]) {
        System.out.println("\n\nPossible pairs of given array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr[] = new int[5]; 
        int arr[] = {1,3,5,7,9};

        System.out.print("\nGiven Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        arrayPairs(arr);
    }
}