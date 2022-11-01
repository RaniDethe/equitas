import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllTheMethods {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\dethe\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		
		
//		CODE FOR HANDLING DROPDOWN WITH SELECT CLASS
//		driver.manage().window().maximize();
//		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id='first']")));
//		drpdwn.selectByVisibleText("Google");
//		drpdwn.selectByIndex(2);
		
		
		
		
//		CODE FOR MOUSE ACTION
//		driver.get("https://www.amazon.in/");
//		WebElement accList=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
//		WebElement myOrder=driver.findElement(By.xpath("//span[text()='Your Orders']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(accList).moveToElement(myOrder).build().perform();
		
	
		
		
//		CODE FOR SCROLLUP SCROLLDOWN
//		SCROLLUP
//		driver.get("https://www.amazon.in/");
//		WebElement signin=driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
//		Thread.sleep(10000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", signin);
		
		
		
//		DRAG AND DROP
//		WebElement source=driver.findElement(By.xpath("//img[@draggable='true']"));
//		WebElement dest=driver.findElement(By.xpath("//div[@id='div2']"));
//		Actions act=new Actions(driver);
//		act.dragAndDrop(source,dest);
//		System.out.println("done");
		
		
		
		
//		EXCEL CODE
//		String path="C:\\Users\\dethe\\OneDrive\\Desktop\\1stexelRani.xlsx";
//		FileInputStream file=new FileInputStream(path);
//		Double value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
//		System.out.println(value);
//		String name=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
//		System.out.println(name);
		
		
		
		
//		I-FRAME HANDLING BY id
//		driver.get("https://www.rediff.com/");
//		driver.switchTo().frame("moneyiframe");
//		String nseRate=driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
//		System.out.println(nseRate);
		
		
		
		
//		I-FRAME HANDLING BY XPATH
//		driver.get("https://www.rediff.com/");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='moneyiframe']")));
//		String nseRate=driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
//		System.out.println(nseRate);
		
		
		
		
//		Autosugesstion Handling /verification
//		driver.get("https://www.goibibo.com/");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pu");
//		Thread.sleep(20000);
//
//		List<WebElement> fromSuggestion=driver.findElements(By.xpath("//li[@role='presentation']"));
//		Thread.sleep(20000);
//
//		for (WebElement webElement : fromSuggestion) 
//		{
//			if(webElement.getText().trim().equals("Puducherry (PNY)"))
//			{
//				webElement.click();
//				Thread.sleep(10000);
//
//				break;
//				
//			}
//			
//		}
//				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
