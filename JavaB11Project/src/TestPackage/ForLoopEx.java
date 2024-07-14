package TestPackage;

public class ForLoopEx {

	public static void main(String[] args) {
		
		int i;
		System.out.println("1 to 10 Even Numbers are:");
		for(i=1;i<=10;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		System.out.println("\n");
		System.out.println("*".repeat(50));
		System.out.println("1 to 10 Odd Numbers are:");
		for(i=1;i<=10;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
	}

}
