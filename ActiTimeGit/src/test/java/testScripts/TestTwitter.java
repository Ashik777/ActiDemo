package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.TwitterGooglePO;

public class TestTwitter extends BaseTest{
	@Test
	public void testTwitter() {
		try {
			GooglePagePO gpo = new GooglePagePO(driver);
			gpo.googleSearch("twitter");
			TwitterGooglePO tgpo = new TwitterGooglePO(driver);
			Reporter.log("no of links="+tgpo.allLinkSize(), true);
			tgpo.twitterLink().click();
			String eTitle = "Login on Twitter";
			String aTitle = driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			Reporter.log("exception genarated",true);
			Assert.fail();
		}
		
		 
	
	}

}
