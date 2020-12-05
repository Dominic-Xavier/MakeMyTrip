package implementation;

import com.util.WebTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import operation_Methods.AllOperations;

public class MakeMyTrip {
	
	@Given("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		//AllOperations.closePopUp();
		AllOperations.mainPageLogin();
	}
	
	@Then("^user enters EmailId$")
	public void user_enters_EmailId() throws InterruptedException {
		AllOperations.pasteEmail();
	}
	
	@Then("^user enters username \"(.*)\" and password \"(.*)\" and clicks continue button$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
	    AllOperations.register(username, password);
	    Thread.sleep(10000);
	}
	
	@Given("^User opens \"(.*)\" browser and passURL \"(.*)\"$")
	public void user_opens(String browser_name, String url) {
		WebTestBase.browserOpen(browser_name);
	    WebTestBase.maximizeWindow();
	    WebTestBase.pass_Url(url);
	}
	
	@Given("^user is on Flights tab$")
	public void user_is_on_flights_tab() {
	    AllOperations.selectBookingTab("Flights");
	}
	
	@Then("^user clicks on \"(.*)\" tab$")
	public void user_clicks_on_round_trip_tab(String option) {
	    AllOperations.selectOption(option);
	}
	
	@Then("^user enters from \"(.*)\" to \"(.*)\" departure date \"(.*)\" and return date \"(.*)\"$")
	public void user_enters_from_location_and_to_location_and_departure_date(String fromLocation,String toLocation, String departureDate, String returnDate) throws InterruptedException {
	    AllOperations.selectLocation(fromLocation,toLocation,departureDate, returnDate);
	}
	
	@Then("^user enters enters number of tickets for adult \"(.*)\" children \"(.*)\" infants \"(.*)\" and class \"(.*)\"$")
	public void user_enters_enters_number_of_tickets_for_adult_children_infants_and_class(String adult, String child, String infant, String travelClass) {
	    AllOperations.travellingAndClass(adult, child, infant, travelClass);
	}
	
    @Then("^user clicks on search$") 
    public void user_clicks_on_search() {
    	AllOperations.searchButton(); 
    }
	 
	@Given("^Demo$")
	public void demo() {
		System.out.println("Demo");
	}
}
