package operation_Methods;

import com.util.WebTestBase;
import pageMethods.Flight;

public class DatePicker {
	
	public static void datepick(String date) throws InterruptedException {//format: month in short form:date:year. eg Dec 20 2020 
		boolean flag = false;
		while(flag==false) {
			if(Flight.calender(date).size()>0) {
				Thread.sleep(1000);
				WebTestBase.javascript("arguments[0].click();", Flight.departureDate(date));
				flag=true;
			}
			else {
				Flight.dateIncreament().click();
			}
		}
	}
}