package Question_1;

import java.util.Arrays;

public class InsertionSort {
	private static int comparisons = 0;

	public static void insertionSort(int arr[], int N) {
		for (int i = 1; i < N; i++) {
			// comparisons++;
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				comparisons++;
				arr[j + 1] = arr[j];
				j--;
			}
			if( j > 0 ) {
				comparisons++;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		System.out.println("Number of Comparisons : " + comparisons);
	}

	public static void main(String[] args) {
		int unsorted[] = { 55, 44, 22, 66, 11, 33, 88, 56 };
		insertionSort(unsorted, unsorted.length);
	}
}
