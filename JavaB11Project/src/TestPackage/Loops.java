package TestPackage;
class assignment{
	void whileLoopForEven() {
		int i=1;
		System.out.println("Even Numbers using While Loop are:");
		while(i<=10) {
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	void whileLoopForOdd() {
		int i=1;
		System.out.println("*".repeat(50));
		System.out.println("Odd Numbers using While Loop are:");
		while(i<=10) {
			if (i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("*".repeat(50));
	}
	
	void DoWhileLoopEven(){
		int i=1;
		System.out.println("Even Numbers using Do_While Loop are:");
		do{
			if(i%2==0) {
				System.out.println(i);				
			}	
			i++;
		}while(i<=10);
	}
	void DoWhileLoopOdd(){
		int i=1;
		System.out.println("*".repeat(50));
		System.out.println("Odd Numbers using Do_While Loop are:");
		do{
			if(i%2!=0) {
				System.out.println(i);				
			}	
			i++;
		}while(i<=10);
	}
	
}

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment as  =new assignment();
		as.whileLoopForEven();
		as.whileLoopForOdd();
		as.DoWhileLoopEven();
		as.DoWhileLoopOdd();

	}

}
