package Question_9;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int selectionSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                swap(arr, i, minIdx);
            }
        }

        return comparisons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int comparisons = selectionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        System.out.println("Number Of Comparisons : " + comparisons);

        sc.close();
    }
}
