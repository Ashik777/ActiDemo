package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LinkedGooglePO extends BasePage {

	public LinkedGooglePO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	private WebElement LinkedSrchLink;
	public WebElement LinkedSrchLink() {
		return LinkedSrchLink;
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinksSize() {
		return allLinks.size();
	} 

}
