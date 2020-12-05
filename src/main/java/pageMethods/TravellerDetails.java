package pageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class TravellerDetails extends WebTestBase {
	
	public static WebElement addAdult() {
		return driver.findElement(By.xpath("//a[text()='+ ADD ADULT']"));
	}
	
	public static WebElement firstAndMiddleName(String index) {
		return driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])["+index+"]"));
	}
	
	public static WebElement lastName(String index) {
		return driver.findElement(By.xpath("(//input[@placeholder='Last Name'])["+index+"]"));
	}
	
	public static WebElement gender(String index) {
		return driver.findElement(By.xpath("(//input[@type='radio' and @value='MALE'])["+index+"]"));
	}
	
	public static WebElement meal(String index) {
		return driver.findElement(By.xpath("(//div[text()='Meal'])["+index+"]"));
	}
	
	public static WebElement dobDate(String index) {
		return driver.findElement(By.xpath("(//div[text()='Date'])["+index+"]"));
	}
	
	public static WebElement dobMonth(String index) {
		return driver.findElement(By.xpath("(//div[text()='Month'])["+index+"]"));
	}
	
	public static WebElement dobYear(String index) {
		return driver.findElement(By.xpath("(//div[text()='Year'])["+index+"]"));
	}
	
	public static WebElement frequent_Flyer_Airline(String index) {
		return driver.findElement(By.xpath("(//div[text()='Frequent Flyer Airline'])["+index+"]"));
	}
	
	public static WebElement nationality() {
		return driver.findElement(By.xpath("//div[text()='Nationality']"));
	}
	
	public static List<WebElement> nationalityItems() {
		List<WebElement> country = driver.findElements(By.xpath("//div[@class='dropdown__menu css-2613qy-menu']//li"));
		return country;
	}
}
