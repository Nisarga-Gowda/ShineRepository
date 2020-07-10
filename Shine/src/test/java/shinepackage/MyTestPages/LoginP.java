package MyTestPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP {
	@FindBy(xpath="//button[@class='btn btn-primary btn-yellow']")  private WebElement regbtn;
	public WebElement regbtn()
	{
		return regbtn;
	}
	
	public void clickreg()
	{
		regbtn.click();
	}
	
@FindBy(name="email") private WebElement untb;
public WebElement getuntb()
{
	return untb;
}
public void setuntb(String un)
{
	untb.sendKeys(un);
}

@FindBy(name="password") private WebElement pwtb;
public WebElement getpwtb()
{
return pwtb;
}
public void setpwtb(String pw)
{
pwtb.sendKeys(pw);
}


@FindBy(id="btn_login") private WebElement loginbtn;
public WebElement getloginbtn()
{
return loginbtn;

}
public void clickloginbtn()
{
loginbtn.click();
}

@FindBy(xpath="//a")private List<WebElement> allLinks;
public List<WebElement> getallLinks()
{
	return allLinks;
}
public void printeleSize()
{
	System.out.println(allLinks.size());
}

public void login(String un,String pwd)
{
	untb.sendKeys(un);
	pwtb.sendKeys(pwd);
	loginbtn.click();
}

@FindBy(xpath="//a[.='Login']") private WebElement RegPageLogin;
public WebElement getRegPageLogin()
{
return RegPageLogin;

}
public void clickRegPageLogin()
{
	RegPageLogin.click();
}

@FindBy(xpath="//li[.='Email Id and Password did not match.']") private WebElement invalidmessage;
public WebElement getinvalidmessage()
{
return invalidmessage;

}
public void setinvalidmessage()
{
	invalidmessage.click();
}
public LoginP(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}



}




















	















