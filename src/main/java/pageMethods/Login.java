package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class Login extends WebTestBase {
	
	public static WebElement login() {
		return driver.findElement(By.xpath("//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']/descendant::div[@class='makeFlex column flexOne']"));
	}
	
	public static WebElement EmailOrMobileNumber() {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement continueButton() {
		return driver.findElement(By.xpath("//button[@class='capText font16']"));
	}
	
	public static WebElement Otp() {
		return driver.findElement(By.name("verifyOTPText"));
	}
	
	public static WebElement verifyAndCreateAccount() {
		return driver.findElement(By.name("verifyOTPText"));
	}
	
	public static WebElement rescendOtp() {
		return driver.findElement(By.linkText(" Resend OTP"));
	}
	
	public static WebElement fullName() {
		return driver.findElement(By.id("firstName"));
	}
	
	public static WebElement passWord() {
		return driver.findElement(By.id("password"));
	}
	
}
