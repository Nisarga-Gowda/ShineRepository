package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	@FindBy(xpath="//a[@href='/myshine/login/' and  @title='Jobseeker Login']") private WebElement signinbtn;
	public WebElement getsigninbtn()
	{
	return signinbtn;
	}
	public void clicksigninbtn()
	{
	signinbtn.click();
	}

	@FindBy(id="id_email_login") private WebElement siginUntb;
	public WebElement getsigntb()
	{
		return siginUntb;
	}
	public void setsiginUntb(String un)
	{
		siginUntb.sendKeys(un);
	}
	@FindBy(id="id_password") private WebElement signpwtb;
	public WebElement getsignpwtb()
	{
	return signpwtb;
	}
	public void setsignpwtb(String pw)
	{
		signpwtb.sendKeys(pw);
	}


	@FindBy(name="login_popup") private WebElement signInLoginclick;
	public WebElement getsignInLoginclick()
	{
	return signInLoginclick;

	}
	public void signInLoginclick()
	{
		signInLoginclick.click();
	}
	public void signin(String un,String pw)
	{
		siginUntb.sendKeys(un);
		signpwtb.sendKeys(pw);
		signInLoginclick.click();
		getsignInLoginclick().click();
		
	}
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}






}
