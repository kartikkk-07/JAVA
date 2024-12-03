import java.util.*;
public class Arrays {
    public static void arrayLength(int firstArray[]){
        System.out.println("Length: " + firstArray.length);
    }

    // public static int linearSearch(int secondArray[]){
    //     int key = 13;
    //     for (int i = 0; i < secondArray.length; i++) {
    //         if(secondArray[i] == key){
    //             return 1;
    //         }
    //     } return -1;
    // }

    // public static int binarySearch(int secondArray[]){ // Ascending order array
    //     int start = 0;
    //     int end = secondArray.length - 1;
    //     int key = 12;
    //     while (start < end) {
    //         int mid = start + end / 2;
    //         if (secondArray[mid] == key) {
    //             return 1;
    //         } else if (secondArray[mid] > key) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return 0;
    // }

    // public static void reversedArray(int firstArray[]){
    //     int start = 0;
    //     int end = firstArray.length - 1;
    //     while(start < end){
    //         int temp = firstArray[start];
    //         firstArray[start] = firstArray[end];
    //         firstArray[end] = temp;
    //         start++; // Imp
    //         end--;   // Imp
    //     }
    // Array printing below
    //     for (int i = 0; i < firstArray.length; i++) {
    //         System.out.print(firstArray[i] + " ");
    //     }
    // }

    // public static void arrayPairs(int firstArray[]){
    //     for (int i = 0; i < firstArray.length; i++) {
    //         for(int j = i + 1; j < firstArray.length; j++){
    //             System.out.print( "(" + firstArray[i] + " " + firstArray[j] + ") ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void printSubarray(int arr[]){
    //     int minSum = Integer.MAX_VALUE; // +infinity
    //     int maxSum = Integer.MIN_VALUE; // -infinity
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             int sum = 0;
    //             for(int k = i; k <= j; k++){
    //                 System.out.print(arr[k] + " ");
    //                 sum += arr[k];
    //             }
    //             System.out.print( " sum: " + sum);
    //             if(sum < minSum){
    //                 minSum = sum;
    //             }
    //             if(sum > maxSum){
    //                 maxSum = sum;
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Max subarray sum= " + maxSum);
    //     System.out.println("Min subarray sum= " + minSum);
    // }

    public static void main(String args[]){
        int firstArray[] = {1,2,3,4,5,6,7};
        // int secondArray[] = {12,15,13,15,20};

        arrayLength(firstArray);

        // System.out.println(linearSearch(secondArray));

        // System.out.println(binarySearch(secondArray));

        // reversedArray(firstArray);

        // arrayPairs(firstArray);

        // printSubarray(firstArray);
    }
}