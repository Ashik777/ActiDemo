package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.InstagramGooglePO;

public class TestInstagram extends BaseTest {
	@Test
	public void testInstagram() {
		try {
			GooglePagePO gpo= new GooglePagePO(driver);
			gpo.googleSearch("instagram");
			InstagramGooglePO igpo = new InstagramGooglePO(driver);
			Reporter.log("no of links="+igpo.allLinkSize(),true);
			igpo.instaLink().click();
			String aTitle = driver.getTitle();
			String eTitle = "Instagram";
			Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			Reporter.log("exception genarated",true);
			Assert.fail();
		}
	}
 

}
