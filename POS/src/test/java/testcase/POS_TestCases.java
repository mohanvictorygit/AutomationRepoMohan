package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageObject.POSRateCalculator;

public class POS_TestCases extends BaseClass {
	// WebDriver driver;
	WebDriverWait wait;

	@Test
	public void POS() throws InterruptedException {

		// Step 1: User go to https://pos.com.my/send/ratecalculator
		// Application URL fetched from the Application.Properties
		// Field Name: ApplicationURL

		// Step 2: User enter “Malaysia” as “From” country, and enter “35600” as the
		// postcode.

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Malaysia country entered by default in the From Country Dropdown.

		POSRateCalculator.ClickInputToCountry();
		POSRateCalculator.ClearToCountryDropdown();
		POSRateCalculator.EnterValueinToDropdown("India");
		POSRateCalculator.EnterIndiaValueinToDropdown();

		// Step 3: User enter “India” as “To” country, and leave the postcode empty.

		// Enter the Post code as 35600 in the From Country Post Code

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		POSRateCalculator.ClickPincode();
		POSRateCalculator.EnterPincode("35600");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step 4: User enter 1 as the “Weight”, and user press Calculate.

		POSRateCalculator.EnterWeight("1");

		POSRateCalculator.ClickCalculateBtn();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step 5: Verify user can see multiple quotes and shipments options available.

		POSRateCalculator.GetOptionsSize();

	}

}
