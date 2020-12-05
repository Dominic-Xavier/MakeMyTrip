package main;

import org.testng.TestNG;

public class MainClass {

	static TestNG testNG;
	
	public static void main(String[] args) {
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {stepdefinition.TestRunner.class});
		testNG.run();
	}

}
