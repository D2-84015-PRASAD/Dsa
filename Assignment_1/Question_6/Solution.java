package Question_6;

import java.util.Scanner;

public class Solution {
	public static int occuranceSearch(int arr[], int target, int occurance) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}

			if (count == occurance) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 20, 40, 60, 80, 100, 70, 40, 20, 40, 100 };
		System.out.println("Enter key to search : ");
		int key = sc.nextInt();
		System.out.println("Enter occurance of key to find :");
		int occurance = sc.nextInt();
		int search = occuranceSearch(arr, key, occurance);
		if (search == -1) {
			System.out.println("Key not found");
		} else {
			System.out.println("The " + occurance + "th Occurance of the key found at index " + search);
		}
	}
}
