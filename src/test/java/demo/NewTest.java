package demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.util.RetryAnalyzerCount;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	SoftAssert asserting;
	@Test(retryAnalyzer = Retry.class)
	  public void f() {
		  String actual = "Bala";
		  String expected = "bala";
		  asserting = new SoftAssert();
		  asserting.assertEquals(actual, expected);
	  }
	  
	  @Test
	  public void v() {
		  String actual = "Gopi";
		  String expected = "Gopi";
		  asserting.assertEquals(actual, expected);
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  asserting.assertAll();
	  }

}
