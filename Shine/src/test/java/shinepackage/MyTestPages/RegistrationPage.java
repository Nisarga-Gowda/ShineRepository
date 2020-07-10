package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-yellow']")  private WebElement regbtn;
	public WebElement regbtn()
	{
		return regbtn;
	}
	
	public void clickreg()
	{
		regbtn.click();
	}
	
	@FindBy(id="id_name") private WebElement name;
	public WebElement getname()
	{
		return name;
	}
	public void setname(String rname)
	{
		name.sendKeys(rname);
	}
	@FindBy(id="id_email") private WebElement mail;
	public WebElement getmail()
	{
		return mail;
	}
	public void setmail(String regmail)
	{
		mail.sendKeys(regmail);
	}
	@FindBy(id="id_cell_phone") private WebElement num;
	public WebElement getnum()
	{
		return num;
	}
	public void setnum(String rnum)
	{
		num.sendKeys(rnum);
	}
	@FindBy(id="id_password") private WebElement pw;
	public WebElement getpw()
	{
		return pw;
	}
	public void setrpw(String pwd)
	{
		pw.sendKeys(pwd);
	}
	
@FindBy(xpath="//button[@class='btn mb-4 align-self-end mb-4']") private WebElement con;
public WebElement getcontinue()
{
	return con;

}
public void clickcon()
{
	con.click();
}
public RegistrationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}
public void loginr(String rname,String regmail,String rnum,String rpwd)
{
	regbtn.click();
	name.sendKeys(rname);
	num.sendKeys(rnum);
	mail.sendKeys(regmail);
	pw.sendKeys(rpwd);
	con.click();
	
}


}
