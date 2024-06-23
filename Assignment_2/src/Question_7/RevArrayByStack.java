package Question_7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class RevArrayByStack {

	public static void reverseArray(int arr[]) {
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Array before reversed : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		System.out.println("Array after reversed : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 10,20,30,40,50 };
		reverseArray(arr);
	}

}