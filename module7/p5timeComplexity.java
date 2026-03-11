package module7;
import java.util.Arrays;

public class p5timeComplexity {

    // Linear Search Implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    // Binary Search Implementation
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] data = {5, 12, 3, 45, 78, 1, 9, 25};
        int target = 12;

        // linear Search output
        int linearResult = linearSearch(data, target);
        System.out.println("Linear Search:");
        if (linearResult != -1) {
            System.out.println("Element found at index: " + linearResult);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println(" ");

        // sorting the array and binary search output
        Arrays.sort(data);
        System.out.println("Sorted array: " + Arrays.toString(data));
        int binaryResult = binarySearch(data, target);
        System.out.println("Binary Search:");
        if (binaryResult != -1) {
            System.out.println("Element found at index: " + binaryResult);
        } else {
            System.out.println("Element not found.");
        }
    }
}

