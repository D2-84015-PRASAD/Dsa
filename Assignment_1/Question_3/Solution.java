package Question_3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static int linearSearch(int arr[],int N,int key) {
		int comparisons=0,index=-1;
		for (int i=0; i<N; i++) {
			comparisons++;
			if (arr[i]==key) {
				index = i;
				break;
			}		
		}	
		if(index==-1)
			System.out.println("Key not found");
		return comparisons;
	}
	
	public static int binarySearch(int arr[], int N, int key) {
		Arrays.sort(arr);
		int comparisons=0;
		int left=0, right=N-1, mid;
		while(left<=right) {
			comparisons++;
			mid = (left + right)/2;
			if(key==arr[mid]) {
				break;
			}
			else if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return comparisons;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,70,80,90,40,50,60};
		System.out.println("Enter Key to Search :");
		int key = sc.nextInt();
		
		int Lin = linearSearch(arr, arr.length, key);
		int Bin = binarySearch(arr, arr.length, key);
		if (Lin!=0 && Bin!=0) {
			System.out.println("Number Of Comparisons To Find Key In Linerar Search=" + Lin);
			System.out.println("Number Of Comparisons To Find Key In Binary Search=" + Bin);
		}	
		else{
			System.out.println("Key not found");
		}					
	}
}
