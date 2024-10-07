package TestPackage;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DeleteDuplicateArray {

	public static void main(String[] args) {
		// For a given array A, write a code to delete the duplicate elements in the
		// array
		int arr[] = { 2, 3, 1, 2,6,9,6,8,5,5,5,5,5,5 };
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
            l.add(arr[i]);
		System.out.println(l);

		/* Arrays.toString(arr);
		String arr1 = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j && arr[i] == arr[j]) {
					continue;
				}
				else {
					arr1 = arr1 + arr[j];
				}
			}
		}System.out.println(arr1); */

	}

}
