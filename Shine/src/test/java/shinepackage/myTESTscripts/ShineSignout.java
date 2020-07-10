package myTESTscripts;

import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.HomePage;
import MyTestPages.SettingPage;
import MyTestPages.WebdriverCo_Class;

public class ShineSignout extends BaseT{
	@Test
public void signout() throws Throwable
{
	ShineSignIn s=new ShineSignIn();
	s.signInTest();
	HomePage hp=new HomePage(driver);
	Thread.sleep(2000);
	hp.clickhomePageUserSettings();
	
	SettingPage sp=new SettingPage(driver);
	sp.clicksignout();
	FileL fl=new FileL();
	WebdriverCo_Class wLib=new WebdriverCo_Class();
	wLib.verify(wLib.getPageTite(), fl.getPropValue(PROP_PATH, "logoutpage"), "Shine logout Page");
	driver.close();
			
}
}
