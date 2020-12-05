package operation_Methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

import pageMethods.EmailVerify;
import pageMethods.Login;


public class EmailVerification extends WebTestBase {
	
	public static List<String> email_link() throws InterruptedException {
		List<String> windows = new ArrayList<String>();
		String curentwindow = driver.getWindowHandle();
		String emailWindow = AllOperations.openNewTab("https://temp-mail.org/en/");
		windows.add(curentwindow);
		windows.add(emailWindow);
		WebTestBase.explicit_weight(EmailVerify.copyUrl(), 10);
		if(!EmailVerify.copyUrl().isEnabled()) {
			EmailVerify.refresh().click();
			Thread.sleep(5000);
		}
		EmailVerify.copyUrl().click();
		return windows;
	}
	
	public static void pasteEmail() throws InterruptedException {
		List<String> l = email_link();
		String Curent_window = l.get(0);
		String emailWindow = l.get(1);
		AllOperations.switchwindow(Curent_window);
		/*
		 * try { AllOperations.closePopUp(); } catch (Exception e) {
		 * System.err.println("No Popup Appeared"); }
		 */
		Login.EmailOrMobileNumber().sendKeys(Keys.chord(Keys.CONTROL,"v"));
		Login.continueButton().click();
		AllOperations.switchwindow(emailWindow);
		WebTestBase.implicit_wait(20);
		getOtp(Curent_window);
	}
	
	public static void getOtp(String CurrentWindow) throws InterruptedException {
		WebElement email,otp;
		email = EmailVerify.emailClick();
		WebTestBase.javascript("arguments[0].scrollIntoView();", email);
		WebTestBase.javascript("arguments[0].click();", email);
		otp = EmailVerify.otp();
		WebTestBase.javascript("arguments[0].scrollIntoView();", otp);
		String string = otp.getText(); 
		System.out.println(string); 
		String numberOnly= string.replaceAll("[^0-9]", ""); 
		System.out.println(numberOnly);
		AllOperations.switchwindow(CurrentWindow); 
		Login.Otp().sendKeys(numberOnly);
		Login.continueButton().click();
	}
	
}
