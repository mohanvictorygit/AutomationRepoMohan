**Home API Testing Postman collection with below API details.**
1. GetAPI -   https://www-api.pos.com.my/api/countries - To fetch the counry details
2. POSTAPI - https://www-api.pos.com.my/api/getStateByPostcode - Send the PostCode to server for the From dropdown.
3. POSTAPI - https://www-api.pos.com.my/api/getStateByPostcode - Send the PostCode to server for the To dropdown.
4. CalculateRate - https://www-api.pos.com.my/api/price - Calculate the Rate

**Test Automation**
**Framework Used:** POM Framework****
**Annotations:** TestNG
**Project: Maven**
**Package details:**
**BASE** package used to maintain the different types of drivers.
**PAGEOBJECT** package is used to maintain the page objects.
**TESTCASE** package is used to maintain all the test cases for the project.
POS_TestClass.java is the method which uses POM with TestNG framework.
TestClass.java is the method which uses without any Framework.
**POM.XML** is used to maintain all the dependencies for the project.

Below are the** reusable functions** used in the POS Automation:

1. ClickInputToCountry
2. ClearToCountryDropdown
3. EnterValueinToDropdown
4. EnterIndiaValueinToDropdown
5. ClickPincode
6. EnterPincode
7. EnterWeight
8. ClickCalculateBtn
9. GetOptionsSize

//  User go to Base URL - https://pos.com.my/send/ratecalculator
// Application URL fetched from the Application.Properties
// Field Name: ApplicationURL
Application url is fetched from the Application.Properties
//Implicit wiat used to sync the different typs of objects.
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

**Test Output:**
TestNG-results.xml and index.html

