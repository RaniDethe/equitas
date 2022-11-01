import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class drpdownComparison {
	@Test
	public void dropdown() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dethe\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(10000);
	WebElement creatAcc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	creatAcc.click();
	
	SoftAssert soft=new SoftAssert();
	String value="";
	Select s=new Select(driver.findElement(By.id("month")));
	List<WebElement>allEle=s.getOptions();
	for(WebElement webElement:allEle)
	{
		String nvalue=webElement.getText();
		soft.assertNotEquals(value, nvalue);
		soft.assertAll();
		value=nvalue;
	}

}
}
