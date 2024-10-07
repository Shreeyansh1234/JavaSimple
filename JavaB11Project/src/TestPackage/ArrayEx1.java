package TestPackage;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8 };
		int missingNumber = findMissingNumber(array);
		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissingNumber(int[] array) {
		int n = array.length + 1;
		int sum = n * (n + 1) / 2;
		int arraySum = 0;
		for (int element : array) {
			arraySum += element;
		}
		return sum - arraySum;
	}
}
