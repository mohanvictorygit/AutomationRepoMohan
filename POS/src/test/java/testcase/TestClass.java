package testcase;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseClass;

public class TestClass extends BaseClass {
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

		driver.findElement(By.id("mat-input-0")).click();
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-0")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='mat-option-50']")).click();
		// Step 3: User enter “India” as “To” country, and leave the postcode empty.

		// Enter the Post code as 35600 in the From Country Post Code

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='number']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("35600");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step 4: User enter 1 as the “Weight”, and user press Calculate.

		driver.findElement(By.xpath("//input[@formcontrolname='itemWeight']")).sendKeys("1");

		WebElement calculateButton = driver.findElement(By.linkText("Calculate"));
		System.out.println("Calculate button enabled: " + calculateButton.isEnabled());

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement calculateButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Calculate")));
		calculateButton1.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step 5: Verify user can see multiple quotes and shipments options available.

		List<WebElement> element = driver
				.findElements(By.xpath("//div[@class='flex justify-between sm:block flex-col space-y-8']"));
		System.out.println("Number of shipping options: " + element.size());
		for (WebElement ele : element) {
			System.out.println("Shipping Option: " + ele.getText());

		}

	}

}
