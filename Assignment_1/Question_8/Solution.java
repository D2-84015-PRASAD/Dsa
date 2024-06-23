package Question_8;

import java.util.Scanner;

public class Solution {

	public static int findRank(int arr[], int key) {
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<=key){
				rank++;
			}
		}
		return rank;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };	
		System.out.println("Enter Key To Find Its Rank :");
		int key = sc.nextInt();
		int Rank = findRank(arr, key);
		if(Rank==0)
			System.out.println("Key not found");
		else
			System.out.println("The Rank Of " + key + " is " + Rank);
	}
}
