package TestPackage;

public class PatternDraw {
	

	public static void main(String[] args) {
		System.out.println("*".repeat(50));
		int n=5;
				for(int i=0;i<=n;i++) {
					
					System.out.println(" ".repeat(n-i)+"*".repeat(i));
		}
		System.out.println("*".repeat(50));
	}

}
