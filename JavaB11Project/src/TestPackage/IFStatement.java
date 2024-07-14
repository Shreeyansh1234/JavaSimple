package TestPackage;
class DecisionMaking{
	void Agelass(){
		int Age=20;
		if (Age>10){
		System.out.println("Age is greater than 10");	
	}else {
		System.out.println("Age is less than 10");

	}
	}
	void Loan() {
		int Balance=120000;
		if (Balance>=10000) {
			if (Balance<=100000) {
				System.out.println("Loan Rs. 50k");
			}else if (Balance<=200000) {
				System.out.println("Loan Rs. 1 Lakh");
			}else if (Balance<=300000) {
				System.out.println("Loan Rs. 1.5 Lakh");
			}else {
				System.out.println("Loan Rs. 5 Lakh");
			}
		}
		else {
			System.out.println("Not Elibible for Loan");
		}
	}
	
	void colorprint() {
		String col="Red";
		
		switch(col) {
		case ("Red"):System.out.println("Red Colur");
			break;
		case ("Pink"):System.out.println("Pink Colur");
			break;
		case("white"):System.out.println("White colur");
			break;
		default:System.out.println("Color is nit matching");
			
		}
	
		
		
	}
}


public class IFStatement {

	public static void main(String[] args) {
		DecisionMaking DM = new DecisionMaking();
		DM.Agelass();
		DM.Loan();
		DM.colorprint();
	}

}
