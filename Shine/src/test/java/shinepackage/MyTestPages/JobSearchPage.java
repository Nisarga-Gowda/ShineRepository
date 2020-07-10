package MyTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSearchPage {
	@FindBy(id="id_q") private WebElement skillorcoursebtn;
	public WebElement getskillorcoursebtn()
	{
		return skillorcoursebtn;
	}
	public void setskillorcoursebtn(String skill)
	{
		skillorcoursebtn.sendKeys(skill);
	}
	@FindBy(id="id_loc") private WebElement location;
	public WebElement getlocation()
	{
	return location;
	}
	public void setlocation(String loc)
	{
		location.sendKeys(loc);
	}
	@FindBy(id="navbardrop") private WebElement searchbtn;
	public WebElement getsearchbtn()
	{
	return searchbtn;

	}
	public void clicksearchbtn()
	{
		searchbtn.click();
	}
	@FindBy(xpath="//a[.='Jobs by Skills']") private WebElement skillbtn;
	public WebElement getskillbtn()
	{
	return skillbtn;

	}
	public void clickskillbtn()
	{
		skillbtn.click();
	}

	@FindBy(id="id_searchBase") private WebElement searchBybtn;
	public WebElement getsearchBybtn()
	{
	return searchBybtn;

	}
	public void clicksearchBybtn()
	{
		searchBybtn.click();
	}
	@FindBy(name="simplesearch") private WebElement searchclick;
	public WebElement getsearchclick()
	{
	return searchclick;

	}
	public void searchclick()
	{
		searchclick.click();
	}
	
	
	public JobSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}

public void search(String skill,String loc)
{
	//searchclick.click();//search button in home page
	//skillbtn.click();//in search search by skill
	//searchBybtn.click();//after clicking serach by skill u will get search page button
	skillorcoursebtn.sendKeys(skill);//pass skill
	location.sendKeys(loc);//pass loc
	
}

@FindBy(xpath="//div[@class='search-input__inputstyle bdr-4 p-10 mb-10']") private WebElement homepagesearch;
public WebElement gethomepagesearch()
{
return homepagesearch;

}
public void clickhomepagesearch()
{
	homepagesearch.click();
}


@FindBy(id="id_new_search_submit_button") private WebElement searchSubmit;
public WebElement getsearchSubmit()
{
return searchSubmit;

}
public void clicksearchSubmit()
{
	searchSubmit.click();
}


}



