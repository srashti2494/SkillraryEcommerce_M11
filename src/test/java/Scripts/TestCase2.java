package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	 public void tc2(){
		SkillraryHomePage  s= new SkillraryHomePage(driver);
		 s.gearButton();
		    s.skillraryDemoApp();
		    utilities.childbrowser (driver);
		    DemoSkillraryPage ds =  new DemoSkillraryPage(driver);
		    ds.feedBckbtn();
		    DownloadInvoicePage dT = new DownloadInvoicePage(driver);
		    dT.downloadInvoiceButton();
	}

}
