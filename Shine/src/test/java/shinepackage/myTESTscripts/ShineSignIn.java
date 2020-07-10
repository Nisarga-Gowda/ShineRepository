package myTESTscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.SignInPage;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
public class ShineSignIn extends BaseT{
	
@Test
	public  void signInTest() throws Throwable
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
		
	}

}
