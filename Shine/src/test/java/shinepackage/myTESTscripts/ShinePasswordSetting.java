package myTESTscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.HomePage;
import MyTestPages.SettingPage;
import MyTestPages.SignInPage;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
public class ShinePasswordSetting extends BaseT{
	

	@Test
	public void passwordSetting() throws Throwable
	{
		BaseT b=new BaseT();
		b.openbrowserEnterurl();
		
		SignInPage sp=new SignInPage(driver);
		FileL fl=new  FileL();
		
		sp.clicksigninbtn();
		sp.signin(fl.getPropValue(PROP_PATH, "username"),fl.getPropValue(PROP_PATH, "password"));
		
		sp.getsignInLoginclick();
		WebdriverCo_Class wLib=new WebdriverCo_Class();
		wLib.verify(wLib.getPageTite(), fl.getPropValue(PROP_PATH, "ShineUserPage"), "Shine user Page");
		
	Thread.sleep(2000);
	HomePage hp=new HomePage(driver);
	//WebdriverCo_Class wLib=new WebdriverCo_Class();
	hp.clickhomePageUserSettings();
	hp.clickaccountSettings();
	Thread.sleep(2000);
	SettingPage s=new SettingPage(driver);
	s.clickchangepassword();
	WebdriverCo_Class wc=new WebdriverCo_Class();
	
	Thread.sleep(2000);
	
	s.changepassword(fl.getPropValue(PROP_PATH, "spassword"),fl.getPropValue(PROP_PATH, "newpassword") ,fl.getPropValue(PROP_PATH, "newpassword"));
	Thread.sleep(2000);
	if(s.getverifyokbtton().isDisplayed())
	{
		Reporter.log("password successfully changed",true);
		
	}
	else
	{
		Reporter.log("not displayed",true);
	}
	s.setokpassword();
	driver.close();

}
}