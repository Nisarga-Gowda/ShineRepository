package myTESTscripts;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.RegistrationPage;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
public class shineRegistration extends BaseT
{
	
@Test
public void shineReg() throws Throwable
{
		BaseT b=new BaseT();
		b.openbrowserEnterurl();
		RegistrationPage rp=new RegistrationPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileL fl=new  FileL();
		rp.clickreg();
		
//		rp.loginr(fl.getPropValue(PROP_PATH,"name"), fl.getPropValue(PROP_PATH,"email"), fl.getPropValue(PROP_PATH, "number"),fl.getPropValue(PROP_PATH, "password"));
		
		
		Random r=new Random();
		
		rp.getname().sendKeys("NIsarga");
		rp.getmail().sendKeys("nisarganishagowda"+r.nextInt(10)+"@gmail.com");
		rp.getnum().sendKeys("7899696478");
		rp.getpw().sendKeys("7899696478");
		rp.clickcon();
		
		WebdriverCo_Class wLib=new WebdriverCo_Class ();
		wLib.verify(wLib.getPageTite(), fl.getPropValue(PROP_PATH, "registerpage"), "registerpage");
		driver.close();
		
	}
}


