package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FacebookGooglePO extends BasePage{

	public FacebookGooglePO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookSrchLink;
	public WebElement  facebookSrchLink() {
		return facebookSrchLink;
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinkSize() {
		return allLinks.size();
	}
	

}
