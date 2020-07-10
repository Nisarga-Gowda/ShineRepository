package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
	
	//@FindBy(xpath="//a[.='Change Password']")  private WebElement changepassword;
	
	@FindBy(name="link_changepsw")  private WebElement changepassword;
	public WebElement getchangepassword()
	{
		return changepassword;
	}
	public void clickchangepassword()
	{
		changepassword.click();
	}
	public SettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="id_old_password")  private WebElement oldpassword; 
	public WebElement getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpw) {
		 oldpassword.sendKeys(oldpw);
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpw) {
		newpassword.sendKeys(newpw);
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpw) {
		confirmpassword.sendKeys(confirmpw);
	}
	public WebElement getSubmitpassword() {
		return submitpassword;
	}
	public void setSubmitpassword() {
		submitpassword.click();
	}
	public WebElement getokpassword() {
		return okpassword;
	}
	public void setokpassword() {
		okpassword.click();
	}
	public WebElement getsignout() {
		return signout;
	}
	public void clicksignout() {
		signout.click();
	}

	@FindBy(id="id_new_password")  private WebElement newpassword;
	@FindBy(id="id_confirm_password")  private WebElement confirmpassword;
	@FindBy(id="id_cpSubmit")  private WebElement submitpassword;
	@FindBy(xpath="//button[.='Ok']")  private WebElement okpassword;
	@FindBy(xpath="//a[.='Sign out']")  private WebElement signout;
	
	@FindBy(xpath="//span[.='Your password has been changed successfully']")  private WebElement verifyokbtton;	
	public WebElement getverifyokbtton() {
		return okpassword;
	}
	public String verifyokbtton() {
		return verifyokbtton.getText();
	}
			
public void changepassword(String oldp,String newp ,String conp) throws Throwable
{
	oldpassword.sendKeys(oldp);
	newpassword.sendKeys(newp);
	confirmpassword.sendKeys(conp);
	submitpassword.click();
	Thread.sleep(2000);
	//okpassword.click();
}

	
}


