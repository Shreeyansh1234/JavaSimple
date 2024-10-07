package TestPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		//For a given array of size N, write a code to print the reverse of the array
		int arr[]= {1,2,3,4,5,6};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		//For a given array Arr[] containing integer elements, write a code to find the 
		//minimum and maximum elements of the array
		int array[]= {1,4,7,2};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Small "+array[0]);
		System.out.println("Large "+array[array.length-1]);
		System.out.println("Second Large "+array[array.length-2]);
	}

}
