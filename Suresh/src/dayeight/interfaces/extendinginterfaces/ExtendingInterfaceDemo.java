//multiple inheritance - 
package dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String args[]) {
		ExtendingInterfaceDemo e= new ExtendingInterfaceDemo();
		e.print();
		e.show();
		
	}
}

