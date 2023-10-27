package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//declartion
	//address of gears
	@FindBy (xpath ="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
    //address of skillrary demoa app
	@FindBy (xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement Skillrarydemoapp;
	
	//address of search text field
	@FindBy (xpath ="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy (xpath ="//input[@value='go']")
	private WebElement searchIcon;
	
	//intialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getGearbtn() {
return gearbtn;
		}

	public WebElement getSkillrarydemoapp() {
		return Skillrarydemoapp;
	}

	public WebElement getSearchTf() {
		return searchTf;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	//Business libraries
	public void gearButton() {
		gearbtn.click();
		
	}
	public void skillraryDemoApp() {
		Skillrarydemoapp.click();
	}
	public void searchTextField(String data) {
		searchTf.sendKeys(data);
	}
}
