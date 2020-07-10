package MyTestPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebdriverCo_Class extends BaseT {
	
	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void waitForElementVisibility(By locator)
	{
		WebDriverWait  wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
		}
	public void waitForTitle(String title)
	{
		WebDriverWait  wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	public String getPageTite()
	{
		return driver.getTitle();
	}
	public void selectOption(WebElement element,int index)
	{
		Select sc=new Select(element);
		sc.selectByIndex(index);
	}
	public void selectOption(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}
	public void selectOption(String value,WebElement element)
	{
		Select sc=new Select(element);
		sc.selectByValue(value);
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void verify(String actual,String expected,String pageName)
	{
		Assert.assertEquals(actual, expected);
		
		Reporter.log(pageName+"is Displayed",true);
		
		
	}
	
}



