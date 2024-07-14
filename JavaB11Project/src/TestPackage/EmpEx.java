package TestPackage;
class Employee1 {
	int Eid=101;
	String Ename = "Shreya";
	String City = "Pune";
	int Age= 23;
	
	void display() {
		System.out.println("Eid"+ Eid);
		System.out.println("EName: " + Ename);
		System.out.println("City: " + City);
		System.out.println("Age: " + Age);
	}
	
}

public class EmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 E1= new Employee1();
		Employee1 E2= new Employee1();
		Employee1 E3= new Employee1();
		
		System.out.println("Accesing Data member's :");
		System.out.println("Eid" +E1.Eid);
		System.out.println("Ename: " + E1.Ename);
		System.out.println("City: " + E1.City);
		System.out.println("Age: " + E1.Age);
		System.out.println("\nAccesing Member function's :");
		E1.display();
		E2.display();
		E3.display();
		
				

	}

}
