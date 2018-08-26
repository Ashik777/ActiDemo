package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookGooglePO;
import pom.GooglePagePO;

public class TestFacebook extends BaseTest {
	@Test
	public void testFacebook() {
		
		try {
			GooglePagePO googlepo = new GooglePagePO(driver);
			googlepo.googleSearch("facebook");
			FacebookGooglePO fgpo = new FacebookGooglePO(driver);
			Reporter.log("no of links="+fgpo.allLinkSize(),true);
			fgpo.facebookSrchLink().click();
			String eTitle="Facebook – log in or sign up";
			fgpo.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
			
			System.out.println(aTitle);
		} catch (Exception e) {
			Reporter.log("exception genarated", true);
			Assert.fail();
		}
	}
}


