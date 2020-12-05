package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.WebTestBase;
import pageMethods.BookingOptions;
import pageMethods.Flight;
import pageMethods.TravellerDetails;

public class Demo extends WebTestBase {
	public static void main(String[] args) throws InterruptedException {
		
		WebTestBase.browserOpen("Chrome");
		WebTestBase.maximizeWindow();
		WebTestBase.pass_Url("https://www.makemytrip.com/flight/traveller/?itineraryId=c41d0b6f8ccd3aee0a31ca81a8a1481c5e5df493&crId=1b384e26-66cd-4fc9-b7ee-3e5d560c020d&cur=INR");
		WebTestBase.explicit_weight(TravellerDetails.addAdult(), 10);
		TravellerDetails.addAdult().click();
		TravellerDetails.nationality().click();
		List<WebElement> l = TravellerDetails.nationalityItems();
		for (WebElement webElement : l) {
			System.out.println(webElement.getText());
		}
		
		/*WebElement ele = driver.findElement(By.xpath("//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']/descendant::div[@class='makeFlex column flexOne']")); JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele); 
		 * String current = driver.getWindowHandle();
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://temp-mail.org/en/"); Thread.sleep(5000);
		 * driver.findElement(By.id("click-to-copy")).click();
		 * driver.switchTo().window(current);
		 * driver.findElement(By.id("username")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		 * driver.switchTo().frame("webengage-engagement-callback-frame");
		 * driver.findElement(By.xpath(
		 * "//a[@id='webklipper-publisher-widget-container-notification-close-div']")).
		 * click(); driver.switchTo().defaultContent();
		 */
		 
		
		/*
		 * List<WebElement> l =
		 * driver.findElements(By.xpath("//ul[@class='userSection pushRight']//li"));
		 * for (WebElement webElement : l) { String web = webElement.getText();
		 * System.out.println(web); if(web.equals("  Login or Create Account")) {
		 * webElement.click(); break; } }
		 */
		
		
		
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//p//b[contains(text(),'OTP is')]"));
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].scrollIntoView();", ele); String string =
		 * ele.getText(); System.out.println(string); String numberOnly=
		 * string.replaceAll("[^0-9]", ""); System.out.println(numberOnly);
		 */
		 
	}
}
