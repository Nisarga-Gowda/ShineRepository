package myTESTscripts;

import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.SignInPage;
import com_ActiTime_Generic_lib.FileLib;
import com_ActiTime_Generic_lib.WebDriverCommonLib;
import com_ActiTime_pages.LoginPage;

public class ShineSignInInvalidTest extends BaseT{
	@Test
	public  void signInInvalidTest() throws Throwable
	{
		BaseT b=new BaseT();
		b.openbrowserEnterurl();
		SignInPage sp=new SignInPage(driver);
	    FileL fl=new FileL();
	    sp.clicksigninbtn();
		int rc=fl.getRowCount(EXCEL_PATH,"Sheet3");
		for(int i=0;i<=rc;i++)
		{
			sp.signin(fl.getCellData(EXCEL_PATH, "Sheet3", i, 0),(fl.getCellData(EXCEL_PATH, "Sheet3", i, 1)));
			
			sp.getsignInLoginclick();
			
//			WebDriverCommonLib wLib=new WebDriverCommonLib();
//			wLib.verify(,"homepage");
			
			}
		driver.close();
}
	}
