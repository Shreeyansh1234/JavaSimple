package TestPackage;

public class MoveZeroAtLastInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 0, 7, 0, 3, 0, 4, 0, 3, 0 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		while (index < arr.length) {
            arr[index++] = 0;
        }

		for (int a : arr) {
			System.out.println(a);
		}
	}

}
