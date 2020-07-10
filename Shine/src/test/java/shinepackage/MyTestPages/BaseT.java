package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseT implements AutoConstants
{
	public static WebDriver driver;
	
	
	public void openbrowserEnterurl() throws Throwable
	{
		FileL flib=new FileL();
		String browser = flib.getPropValue(PROP_PATH,"browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			
			
		}
		else
		{
			System.out.println("enter proper browser");
		}
		
		driver.manage().window().maximize();
		
		String appUrl=flib.getPropValue(PROP_PATH, "url");
		driver.get(appUrl);
		
	WebdriverCo_Class wLib=new WebdriverCo_Class();
		wLib.verify(wLib.getPageTite(), flib.getPropValue(PROP_PATH, "ShineUserPage"), "Shine User Page");
	
}
}
