package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class InstagramGooglePO extends BasePage {

	public InstagramGooglePO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instaLink;
	public WebElement instaLink() {
		return instaLink;
	}
	@FindBy(xpath="//a")
	private List<WebElement>allLinks;
	public int allLinkSize(){
		return allLinks.size();
	} 

}
