package testClassCms.base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.utils.ExcelReader;
import com.utils.Information;
import cms.base.DriverPage;
import common_method.CommonMethod;
import web_element.SignInAccount;
import web_element.SignInAccount1;
import web_element.SignInAccount2;

public class TestClass extends DriverPage{
	
	CommonMethod cm;
	SignInAccount sa;
	SignInAccount1 sa1;
	SignInAccount2 sa2;
	
	@BeforeMethod
	public void initialization() {
		cm = new CommonMethod();
		sa = new SignInAccount(driver);
		sa1=new SignInAccount1(driver);
		sa2=new SignInAccount2(driver);
	}
	@DataProvider(name = "exceldata")
	public Object[][] data(){
		String excelPath="/Users/fatemakhaleda/eclipse-workspace/CMS.project/ExcelSheet/book.xlsx";
		ExcelReader excelReader=new ExcelReader(excelPath,"Sheet1");
	Object[][] info=excelReader.excelData();
		return info;
	}
	@Test(priority = 1, enabled  = false)
	public void signInTest() throws InterruptedException {
		sa.signInAccountSteps(cm);
	}
	@Test(priority = 2, enabled = false)
	public void signInTest1() throws InterruptedException {
		sa1.signInAccountSteps(cm,
				Information.instanceOfInformation().getFirstName(),
				Information.instanceOfInformation().getMiddleName(),
				Information.instanceOfInformation().getLastName(),
				Information.instanceOfInformation().getMonth(),
				Information.instanceOfInformation().getDay(),
				Information.instanceOfInformation().getYear(), 
				Information.instanceOfInformation().getAddress(),
				Information.instanceOfInformation().getCity(),
				Information.instanceOfInformation().getzipcode(),
				Information.instanceOfInformation().getEmail(),
				Information.instanceOfInformation().getReEmail()
				);
	}
  @Test(priority = 3,enabled = true,dataProvider = "exceldata")
	public void signInTest2(String fn,String mn,String ln
			,String mo,String day,String year,String addr,
			String c,String zip,String em,String reEm) throws InterruptedException {
	  sa2.signInAccountSteps(cm, fn, mn, ln, mo, day, year, addr, c, zip, em, reEm);
  }
	
}
