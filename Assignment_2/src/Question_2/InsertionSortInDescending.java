package Question_2;

import java.util.Arrays;

public class InsertionSortInDescending {

	public static void insertionSortDesc(int arr[], int N) {
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Sorted Array In Descending Order : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int unsorted[] = { 80, 70, 50, 20, 100, 10, 60, 30, 40, 90 };
		insertionSortDesc(unsorted, unsorted.length);
	}
}
