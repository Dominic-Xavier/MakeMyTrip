package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class EmailVerify extends WebTestBase {
	
	public static WebElement copyUrl() {
		return driver.findElement(By.id("click-to-copy"));
	}
	
	public static WebElement emailClick() {
		return driver.findElement(By.xpath("//a[text()='OTP to create your MakeMyTrip account']"));
	}
	
	public static WebElement otp() {
		return driver.findElement(By.xpath("//p//b[contains(text(),'OTP is')]"));
	}
	
	public static WebElement refresh() {
		return driver.findElement(By.id("click-to-refresh"));
	}
}
