package myTESTscripts;

import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.HomePage;
import MyTestPages.WebdriverCo_Class;

public class ShineUploadCv extends BaseT {
@Test	
public void cvupload() throws Throwable
{
	ShineSignIn s=new ShineSignIn();
	s.signInTest();
	FileL fl=new FileL();
	HomePage hp=new HomePage(driver);
	WebdriverCo_Class w=new WebdriverCo_Class();
	//w.waitForTitle(fl.getPropValue(PROP_PATH, "jobsearchbymanualtesting"));
	w.waitForPageLoad();
	//hp.clickhandleShineypopup();
	hp.setuploadingcv(fl.getPropValue(PROP_PATH, "cvpath"));
	
}
}
