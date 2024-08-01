//Summary of Access Levels
//Access Modifier		Within Class	Within Package	Subclass (Different Package)	Outside Package
//Default				Yes				Yes				No								No
//Private				Yes				No				No								No
//Protected				Yes				Yes				Yes								No
//Public				Yes				Yes				Yes								Yes

package com.qa.JavaProgramming.OOPS;

class DefaultClass {
	void display() {
		System.out.println("Default access");
	}
}

public class AccessModifiers {
	private void privateMethod() {
		System.out.println("Private access");
	}

	void defaultMethod() {
		System.out.println("Default access");
	}

	protected void protectedMethod() {
		System.out.println("Protected access");
	}

	public void publicMethod() {
		System.out.println("Public access");
	}

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.privateMethod(); // Accessible
		obj.defaultMethod(); // Accessible
		obj.protectedMethod(); // Accessible
		obj.publicMethod(); // Accessible
	}
}

class SubClass extends AccessModifiers {
	void display() {
		// privateMethod(); // Not accessible
		defaultMethod(); // Accessible
		protectedMethod(); // Accessible
		publicMethod(); // Accessible
	}
}