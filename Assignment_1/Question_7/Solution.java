package Question_7;

public class Solution {

	public static int nonRepeatedElement(int arr[], int N) {
		int repetations;

		for (int i = 0; i < N - 1; i++) {
			repetations = 0;
			for (int j = i + 1; j < N - 1; j++) {
				if (arr[i] == arr[j]) {
					repetations++;
				}
			}
			if (repetations == 0) {
				// System.out.println("First non repeating element = " + arr[i]);
				return arr[i];
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int nonRepeated = nonRepeatedElement(arr, arr.length);
		System.out.println("First non repeated element = " + nonRepeated);
	}

}
