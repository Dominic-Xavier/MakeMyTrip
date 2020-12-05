package pageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class Flight extends WebTestBase {
	
	public static WebElement from_location() {
		return driver.findElement(By.id("fromCity"));
	}
	
	public static WebElement to_location() {
		return driver.findElement(By.id("//span[@class='lbl_input latoBold appendBottom10'][text()='DEPARTURE']"));
	}
	
	public static WebElement departureAndTravelling(String element) {
		return driver.findElement(By.xpath("//span[text()='"+element+"']"));
	}
	
	public static List<WebElement> RegularOrStudentFare() {
		List<WebElement> fare = driver.findElements(By.xpath("//ul[@class='specialFare']//li"));
		return fare;
	}
	
	public static WebElement noOfTicketsAdult(int noOfTickets) {
		return driver.findElement(By.xpath("//li[@data-cy='adults-"+noOfTickets+"']"));
	}
	
	public static WebElement noOfTicketsChildren(int noOfTickets) {
		return driver.findElement(By.xpath("//li[@data-cy='children-"+noOfTickets+"']"));
	}
	
	public static WebElement noOfTicketsINFANTS (int noOfTickets) {
		return driver.findElement(By.xpath("//li[@data-cy='infants-"+noOfTickets+"']"));
	}
	
	public static WebElement fromSearch() {
		return driver.findElement(By.xpath("//input[@placeholder='From']"));
	}
	
	public static WebElement toSearch() {
		return driver.findElement(By.xpath("//input[@placeholder='To']"));
	}
	
	public static List<WebElement> calender(String date) {
		//format must be MM DD YYYY eg. Nov 18 2020
		List<WebElement> fare = driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+date+"')]"));
		return fare;
	}
	
	public static WebElement dateDecreament() {
		return driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--prev"));
	}
	
	public static WebElement dateIncreament() {
		return driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
	}
	
	public static WebElement selectLocationFromDropDown() {
		return driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
	}
	
	public static WebElement departureDate(String date) {
		return driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+date+"')]"));
	}
	
	public static List<WebElement> travelClass() {
		List<WebElement> travelclass = driver.findElements(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//li"));
		return travelclass;
	}
	
	public static WebElement applyButton() {
		return driver.findElement(By.xpath("//button[text()='APPLY']"));
	}
	
	public static WebElement bookNowButton(String index) {
		return driver.findElement(By.xpath("(//button[text()='Book Now'])["+index+"]"));
	}
	
	public static WebElement secureMyTrip_Yes() {
		return driver.findElement(By.xpath("//label[@class='block radio append_bottom15']"));
	}
	
	public static WebElement secureMyTrip_No() {
		return driver.findElement(By.xpath("//label[@class='block radio']"));
	}
	
	public static WebElement continueTicketButton() {
		return driver.findElement(By.id("review-continue"));
	}
}
