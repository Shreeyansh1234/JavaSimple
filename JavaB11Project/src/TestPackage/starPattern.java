package TestPackage;

public class starPattern {

	public static void main(String[] args) {
		 int n = 5;
		 System.out.println("Printing * pattern");
		 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("Printed * pattern");
	}

}
