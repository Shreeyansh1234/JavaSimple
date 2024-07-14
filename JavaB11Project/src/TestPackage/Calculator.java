package TestPackage;
class calcy{
	void addition() {
		int m=20;
		int p=10;
		System.out.println("addition Method with No Return type, No Argument" + (m+p));
		System.out.println("\n");
	}
	
	void substraction(int A, int B) {
		System.out.println("substraction Method with No Return type,with Argument" + (A-B));
		System.out.println("\n");
	}
	
	int Multiplication() {
		System.out.println(" Multiplication Method with Return type,No Argument ");
		int C= 20;
		int D=10;
		return C*D;
	}
	
	int Division(int X, int Y) {
		System.out.println("\n");
		System.out.println("This is Division Method with Return type,with Argument\n");
		//X=10;		
		return X/Y;
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcy c=new calcy();
		c.addition();
		
		c.substraction(12,13);
		
		int multivalue=c.Multiplication();
		System.out.println("Value "+multivalue);
		
		int Div_value=c.Division(10,2);
		System.out.println("Divalue "+Div_value);
	}
}
