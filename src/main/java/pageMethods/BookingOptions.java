package pageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class BookingOptions extends WebTestBase {
	
	static List<WebElement> ls;
	
	public static List<WebElement> booking_options(){
		ls = driver.findElements(By.xpath("//ul[@class='makeFlex font12']//li"));
		return ls;
	}
	
	public static WebElement mode_of_transport_in_flight(String option){
		return driver.findElement(By.xpath("//ul[@class='fswTabs latoBlack greyText']//li[@data-cy='"+option+"']"));
	}
	
	public static List<WebElement> mode_of_transport_in_train(){
		ls = driver.findElements(By.xpath("//div[@class='greyText font14 makeFlex hrtlCenter latoBlack railTab']//span"));
		return ls;
	}
	
	public static List<WebElement> mode_of_transport_in_cab(){
		ls = driver.findElements(By.xpath("//ul[@class='cswTabs latoBlack greyText']//li"));
		return ls;
	}
	
	public static List<WebElement> mode_of_transport_in_Charters(){
		ls = driver.findElements(By.xpath("//ul[@class='cfswTabs latoBlack greyText']//li"));
		return ls;
	}
	
	public static WebElement search(){
		return driver.findElement(By.xpath("//a[text()='Search']"));
	}
	
	public static List<WebElement> travelclass(){
		ls = driver.findElements(By.xpath("//ul[@class='cfswTabs latoBlack greyText']//li"));
		return ls;	
	}
	
	public static List<WebElement> LoginButton(){
		ls = driver.findElements(By.xpath("//ul[@class='userSection pushRight']//li"));
		return ls;
	}
	
	public static WebElement popUp() {
		return driver.findElement(By.xpath("//iframe[contains(@name,'notification-frame')]"));
	}
	
	public static WebElement closePopUp() {
		return driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
	}
	
	public static WebElement selectLocationFromDropdown(int index) {
		return driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li[@data-suggestion-index='"+index+"']"));
	}
	
	
}
