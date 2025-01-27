package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class POSRateCalculator extends BaseClass {
	
	 static By matinputclear=By.id("mat-input-0");
	 static By matinputindia=By.xpath("//*[@id='mat-option-50']");
	 static By pincode=By.xpath("//input[@type='number']");
	 static By itemWeight=By.xpath("//input[@formcontrolname='itemWeight']");
	 static By calculatebtn=By.linkText("Calculate");
	 static By quoteOptions=By.xpath("//div[@class='flex justify-between sm:block flex-col space-y-8']");
	 
		public static void ClickInputToCountry()
		{
			driver.findElement(matinputclear).click();
				
		}
		
		public static void ClearToCountryDropdown()
		{
			driver.findElement(matinputclear).clear();
				
		}
		
		public static String EnterValueinToDropdown(String EnterValue)
		{
			driver.findElement(matinputclear).sendKeys(EnterValue);
			return EnterValue; 
				
		}
		
		
		public static void EnterIndiaValueinToDropdown()
		{
			driver.findElement(matinputindia).click();
				
		}
		
		public static void ClickPincode()
		{
			driver.findElement(pincode).click();
				
		}
		public static String EnterPincode(String PinCode)
		{
			driver.findElement(pincode).sendKeys(PinCode);
			return PinCode;
				
		}
		
		public static String EnterWeight(String Weight)
		{
			driver.findElement(itemWeight).sendKeys(Weight);
			return Weight;
				
		}
		
		public static void ClickCalculateBtn()
		{
			driver.findElement(calculatebtn).click();
				
		}
		
		
		public static int GetOptionsSize()
		{
			 List<WebElement> element = driver.findElements(quoteOptions);
			    System.out.println("Number of shipping options: " + element.size());
			    int Size=element.size();
				return Size;
	
			
			 		
				
		}
		
		
		
		
		
		
	 
		
	 
	 

	 
	 

	 
	 
	 
	 


	 
	

}
