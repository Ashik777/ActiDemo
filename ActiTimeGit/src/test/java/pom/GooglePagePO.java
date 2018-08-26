package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePagePO extends BasePage{

	public GooglePagePO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name="q")
	private WebElement googleSrchBx;
	public WebElement  googleSrchBx() {
		return  googleSrchBx;
	}
	public void googleSearch(String value) {
		googleSrchBx.sendKeys(value);
		googleSrchBx.sendKeys(Keys.ENTER);
	}
	

}
