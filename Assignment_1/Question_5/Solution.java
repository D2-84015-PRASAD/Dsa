package Question_5;

import java.util.Scanner;

public class Solution {
	public static int comparisons=0;
	public static int binarySearch(int arr[],int N,int key) {
		int left=0, right=N-1,mid;
		while(left<=right) { 	
			comparisons++;
			mid = (left+right)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				right = mid - 1;
			}
			else {
				left = mid + 1; 
			}
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {100,80,60,40,20};
		System.out.println("Enter Key To Search :");
		int key = sc.nextInt();
		int search = binarySearch(arr, arr.length, key);
		if(search!=-1) {
			System.out.println("Element Found At Index =" + search);
			System.out.println("Comparisons =" + comparisons);
		}
		else
			System.out.println("Key not found");		
	}
}
