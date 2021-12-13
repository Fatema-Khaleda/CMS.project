package web_element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common_method.CommonMethod;

public class SignInAccount {
	
	public SignInAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} // class        ai cls tar method , argument - (   , this keyword represent the class)

	@FindBy(id="cms-newuser-reg")
	public WebElement newUser;
	@FindBy(xpath = "//div[@class='ng-input']")
	public WebElement selectYourApplicationElement;
	@FindBy(xpath = "(//span[@class='ng-option-label'])[3]")
	public WebElement selectingBcrsWeb;
	@FindBy(className = "cms-tos-reg")
	public WebElement clickOnAgreeConditions;
	@FindBy(id = "termsAndCondNext")
	public WebElement clickOnNext;
	@FindBy(xpath = "//input[@id='cms-newuser-firstName']")
	public WebElement enterFirstName;
	@FindBy(xpath = "//input[@id=\"cms-newuser-middleName\"]")
	public WebElement enterMiddleName;
	@FindBy(xpath = "//input[@id='cms-newuser-lastName']")
	public WebElement enterLastName;
	@FindBy(xpath = "//select[@id='cms-newuser-birthMonth']")
	public WebElement selectBirthMonth;
	@FindBy(xpath = "//select[@id='cms-newuser-birthDate']")
	public WebElement selectBirthDay;
	@FindBy(xpath = "//select[@name='cms-newuser-birthYear']")
	public WebElement selectBirthYear;
	//@FindBy(xpath = "(//label[@class='check-radio'])[2]")
	//public WebElement addressButton;
	@FindBy(id = "cms-newuser-homeAddressLine1")
	public WebElement address;
	@FindBy(id = "cms-newuser-usCity")
	public WebElement city;
	@FindBy(id = "cms-newuser-usState")
	public WebElement state;
	@FindBy(xpath = "//input[@id='cms-newuser-usZipCode']")
	public WebElement zipCode;
	@FindBy(id = "cms-newuser-usEmail")
	public WebElement email;
	@FindBy(id = "cms-newuser-usConfirmEmail")
	public WebElement confirmEmail;
	@FindBy(id = "cms-newuser-usPhoneNumber")
	public WebElement phn;
	@FindBy(id = "step2NextButton")
	public WebElement nextButton;
	
	//now will make a method where will call all the method togather
	public void signInAccountSteps(CommonMethod cm) throws InterruptedException {
		
		Thread.sleep(3000);
		cm.toClick(newUser);	
		Thread.sleep(3000);
		cm.toClick(selectYourApplicationElement);
		cm.toClick(selectingBcrsWeb);
		cm.toClick(clickOnAgreeConditions);
		Thread.sleep(3000);
		cm.toClick(clickOnNext);
		cm.entertext(enterFirstName, "Emma");
		cm.entertext(enterMiddleName, "J");
		cm.entertext(enterLastName, "Sam");
		cm.dropDown(selectBirthMonth, "January");
		cm.dropDown(selectBirthDay, "6");
		cm.dropDown(selectBirthYear, "1994");
		//cm.toClick(addressButton);
		cm.entertext(address, "810 1st ave");
		cm.entertext(city, "New York");
		cm.entertext(state, "New York");
		cm.entertext(zipCode, "10019");
		cm.entertext(email, "mevin@gmail.com");
		cm.entertext(confirmEmail, "mevin@gmail.com");
		cm.entertext(phn, "123456789");
		cm.toClick(nextButton);
		
	}


}
