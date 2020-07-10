package myTESTscripts;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MyTestPages.BaseT;
import MyTestPages.FileL;
import MyTestPages.JobSearchPage;
import MyTestPages.WebdriverCo_Class;
@Listeners(MyTestPages.MyListener.class)
public class ShineJobSearch extends BaseT {
	@Test
	public void jobsearch() throws Throwable
	{
		
		ShineSignIn s=new ShineSignIn();
		s.signInTest();

		WebdriverCo_Class w=new WebdriverCo_Class();
		w.waitForPageLoad();
		FileL fl=new FileL();
//		
		JobSearchPage js=new JobSearchPage(driver);
		js.clickhomepagesearch();
		
		js.search(fl.getPropValue(PROP_PATH, "skill"),fl.getPropValue(PROP_PATH, "location"));
		js.clicksearchSubmit();
		w.waitForTitle(fl.getPropValue(PROP_PATH, "jobsearchbymanualtesting"));
		//Reporter.log(w.getPageTite(),true);
		
w.verify( w.getPageTite(),fl.getPropValue(PROP_PATH, "jobsearchbymanualtesting"), "manual testing jobs page");
driver.close();	
	}
	
}
