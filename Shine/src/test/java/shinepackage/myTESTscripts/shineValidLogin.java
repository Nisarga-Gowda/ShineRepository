package myTESTscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.LoginP;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
/**
 * 
 * @author Nisarga
 *
 */
public class shineValidLogin extends BaseT {
	@Test
	public  void ValidLoginTest() throws Throwable
	{
		BaseT b=new BaseT();
		b.openbrowserEnterurl();
		LoginP lp=new LoginP(driver);
		FileL fl=new  FileL();
		lp.clickreg();
		lp.clickRegPageLogin();

		lp.login(fl.getPropValue(PROP_PATH, "username"),fl.getPropValue(PROP_PATH, "password"));
//		WebElement login = driver.findElement(By.id("ssIFrame_google"));
//		driver.switchTo().frame(login);
//		lp.clickloginbtn();
		WebdriverCo_Class wc=new WebdriverCo_Class();
		wc.verify(wc.getPageTite(), fl.getPropValue(PROP_PATH, "ShineHomePage"), "Shine Home Page");

		//driver.close();

	}
}





















