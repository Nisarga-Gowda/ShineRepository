package myTESTscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.LoginP;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
public class shineInvalidLogin extends BaseT
{
	
	@Test
	public void invalidTest() throws Throwable
	{
	BaseT b=new BaseT();
	b.openbrowserEnterurl();
	
	WebdriverCo_Class wLib=new WebdriverCo_Class();
	wLib.waitForPageLoad();
	
	LoginP lp=new LoginP(driver);
	lp.clickreg();
    lp.clickRegPageLogin();
    
    FileL fl=new  FileL();
	int rc=fl.getRowCount(EXCEL_PATH,"Sheet3");
	
	for(int i=0;i<=rc;i++)
	{
    lp.login(fl.getCellData(EXCEL_PATH, "Sheet3", i, 0),fl.getCellData(EXCEL_PATH, "Sheet3", i, 1));
    lp.getuntb().clear();
	}
    if(lp.getinvalidmessage().isDisplayed())
    {
    	Reporter.log("Invalid Message Displayed...our test case is passed",true);
    }
    else
    {
    Reporter.log("InvalidMessage not Displayed",true);
    }
    driver.close();
}
	}


