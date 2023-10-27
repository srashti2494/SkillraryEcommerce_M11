package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {

	//Declartion
	//address of download invoice
	@FindBy(xpath ="//input[@name='downloadInvoice']")
	private WebElement downloadInvoicbtn;
	
	//initialization
	public DownloadInvoicePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getDownloadInvoicbtn() {
		return downloadInvoicbtn;
	}

	//Business library
	public void downloadInvoiceButton() {
		downloadInvoicbtn.click();
		
	}
}
