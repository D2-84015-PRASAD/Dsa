package Question_2;

import java.util.Scanner;

public class Solution {
	static int index=-1,i;

	public static int lastIndex(int arr[],int N, int key) {
		for (int i=0; i<N; i++) {
			if(arr[i]==key)
				index = i;
		}		
		return index;
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key,Search;
		int arr[]= {24,88,98,56,34,88,24};
		System.out.println("Enter key to search in Array - ");
		key = sc.nextInt();
		Search=lastIndex(arr, arr.length,key);
		if(Search!=-1)
			System.out.printf("Last Index of key = " + Search);
		else
			System.out.println("Key not found");
		}
}

