package operation_Methods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import com.util.WebTestBase;

import pageMethods.BookingOptions;
import pageMethods.Flight;
import pageMethods.Login;



public class AllOperations extends WebTestBase {
	
	public static void booking(String book) {
		List<WebElement> ls = BookingOptions.booking_options();
		for (WebElement webElement : ls) {
			String buffer = webElement.getText();
			if(buffer.equals(book)) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void mode_of_transport_in_flight_booking(String mode_of_transport) {
		List<WebElement> ls = BookingOptions.booking_options();
		for (WebElement webElement : ls) {
			String buffer = webElement.getText();
			if(buffer.equals(mode_of_transport)) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void selectLocation(String fromLocation, String toLocation,String departureDate, String returnDate) throws InterruptedException {
		Flight.from_location().click();
		Flight.fromSearch().sendKeys(fromLocation);
		BookingOptions.selectLocationFromDropdown(0).click();
		//wait
		Thread.sleep(1000);
		Flight.toSearch().sendKeys(toLocation);
		BookingOptions.selectLocationFromDropdown(0).click();
		Flight.departureAndTravelling("DEPARTURE").click();
		WebTestBase.implicit_wait(5);
		DatePicker.datepick(departureDate);
		DatePicker.datepick(returnDate);
	}
	
	public static void selectBookingTab(String option) {
		List<WebElement>ele = BookingOptions.booking_options();
		for (WebElement webElement : ele) {
			String all_elements = webElement.getText();
			if(all_elements.equals(option)) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void selectOption(String option) {
		WebElement modeofTransport = BookingOptions.mode_of_transport_in_flight(option);
		WebTestBase.explicit_weight(modeofTransport, 30);
		modeofTransport.click();
	}
	
	public static void searchButton() {
		BookingOptions.search().click();
	}
	
	public static void noOfTickets(String tickets) {
		
	}
	
	public static void ticketClass(String ticketClass) {
		List<WebElement>ele = BookingOptions.travelclass();
		for (WebElement webElement : ele) {
			String all_elements = webElement.getText();
			if(all_elements.equals(ticketClass)) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void pasteEmail() throws InterruptedException {
		EmailVerification.pasteEmail();
	}
	
	public static void mainPageLogin() {
		try {
			WebTestBase.implicit_wait(10);
			WebTestBase.javascript("arguments[0].click();", Login.login());
		} catch (Exception e) {
			List<WebElement> l = BookingOptions.LoginButton();
			for (WebElement webElement : l) {
				String ele = webElement.getText();
				if(ele.equals("  Login or Create Account")) {
					webElement.click();
					break;
				}
			}
		}
	}
	
	public static String switchwindow(String handle) {
		String current = driver.getWindowHandle();
		driver.switchTo().window(handle);
		return current;
	}
	
	public static String openNewTab(String URL) {
		driver.switchTo().newWindow(WindowType.TAB);
		String emailWindow = driver.getWindowHandle();
		WebTestBase.pass_Url(URL);
		return emailWindow;
	}
	
	public static void closePopUp() {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.switchTo().frame(BookingOptions.popUp());
		BookingOptions.closePopUp().click();
		driver.switchTo().defaultContent();
	}
	
	public static void register(String username,String password){
		Login.fullName().sendKeys(username);
		Login.passWord().sendKeys(password);
		Login.continueButton().click();
	}
	
	public static void travellingAndClass(String adult,String child, String infant, String travelClass) {
		WebTestBase.explicit_weight(Flight.departureAndTravelling("Travellers & CLASS"), 30);
		Flight.departureAndTravelling("Travellers & CLASS").click();
		Flight.noOfTicketsAdult(Integer.parseInt(adult)).click();;
		Flight.noOfTicketsChildren(Integer.parseInt(child)).click();;
		Flight.noOfTicketsINFANTS(Integer.parseInt(adult)).click();;
		List<WebElement> l = Flight.travelClass();
		for (WebElement webElement : l) {
			String classes = webElement.getText();
			if(classes.equals(travelClass)) {
				webElement.click();
				break;
			}
		}
		Flight.applyButton().click();
	}
	
	public static void bookNow(String index,String secureMyTrip) {
		Flight.bookNowButton(index).click();
		String currentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!string.equals(currentWindow)) {
				switchwindow(string);
				break;
			}
		}
		WebTestBase.javascript("arguments[0].scrollIntoView();",Flight.secureMyTrip_No());
		if(secureMyTrip.equalsIgnoreCase("No"))
			Flight.secureMyTrip_No().click();
		else
			Flight.secureMyTrip_Yes().click();
		
		Flight.continueTicketButton().click();
	}
	
}
