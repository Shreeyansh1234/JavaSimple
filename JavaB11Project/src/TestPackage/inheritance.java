package TestPackage;

class parent1{
	void love() {
		System.out.println("love");
	}
}

class child1 extends parent1{
	void care() {
		System.out.println("care");
	}
}
public class inheritance {

	public static void main(String[] args) {
		parent1 p=new child1();
		p.love();//child takes parent properties
		
		child1 c=new child1();
		c.love();
		c.care();
		

	}

}
