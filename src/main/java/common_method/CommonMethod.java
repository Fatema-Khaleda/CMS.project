package common_method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod {

	public void toClick(WebElement element) {
		element.click();
	}
	public void entertext(WebElement element, String value) {
		element.sendKeys(value);
	}
	public void entertext1(WebElement element, int value) {
		element.sendKeys(String.valueOf(value));
	}

	public void dropDown(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void dropDown1(WebElement element, int value) {
		Select select=new Select(element);
		select.selectByValue(String.valueOf(value));
	}
}
