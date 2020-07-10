package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//li[@class='dropdown posRel infomenu carrerInfo lgout']")  private WebElement homePageUserSettings;
	public WebElement gethomePageUserSettings()
	{
		return homePageUserSettings;
	}
	public void clickhomePageUserSettings()
	{
		
		WebdriverCo_Class wLib=new WebdriverCo_Class();
		wLib.mouseHover(homePageUserSettings);
	}
	
	@FindBy(xpath="//a[.='Account Settings']")  private WebElement accountSettings;
	public WebElement getaccountSettings()
	{
		return accountSettings;
	}
	public void clickaccountSettings()
	{
		accountSettings.click();
	}
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//button[@onclick=\"closeChat()\"]")  private WebElement handleShineypopup;
	public WebElement gethandleShineypopup()
	{
		return handleShineypopup;
	}
	public void clickhandleShineypopup()
	{
		handleShineypopup.click();
	}
	@FindBy(id="id_resume_upload_field") private WebElement uploadingcv;
	public WebElement getuploadingcv()
	{
	return uploadingcv;
	}
	public void setuploadingcv(String path)
	{
		uploadingcv.sendKeys(path);
	}
}
