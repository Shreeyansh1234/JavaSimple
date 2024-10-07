package TestPackage;

import java.util.Arrays;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 2, 8, 3, 1};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
		
		int[][] twoDimArray = {
			    {5, 2, 8},
			    {3, 1, 7},
			    {6, 4, 9}
			};

			for (int[] row : twoDimArray) {
			    Arrays.sort(row);
			    System.out.println(Arrays.toString(row));
			}

			for (int[] row : twoDimArray) {
			    System.out.println(Arrays.toString(row));
			}
			// Output:
			// [2, 5, 8]
			// [1, 3, 7]
			// [4, 6, 9]


	}

}
