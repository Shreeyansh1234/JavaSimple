
package TestPackage;

class parent {

	void teach() {
		System.out.println("Parent Teach");
	}
}

class child extends parent {
	void learn() {
		System.out.println("Child Learn");
	}

}

public class Hello {
	public static void main(String[] arg) {
		parent p = new parent();
		p.teach();

		child c = new child();
		c.teach();
		c.learn();
		parent cc = new child();
		cc.teach();
		
	}
}
