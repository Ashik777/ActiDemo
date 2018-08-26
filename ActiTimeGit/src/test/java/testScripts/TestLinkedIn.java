package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.LinkedGooglePO;

public class TestLinkedIn extends BaseTest {
	@Test
	public void testLinkedIn() {
		try {
			GooglePagePO gpgo = new GooglePagePO(driver);
			gpgo.googleSearch("linkedin");
			LinkedGooglePO lgpo = new LinkedGooglePO(driver);
			Reporter.log("no of links ="+lgpo.allLinksSize());
			lgpo.LinkedSrchLink().click();
			String eTitle="LinkedIn: Log In or Sign Up";
			lgpo.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	} 

}
