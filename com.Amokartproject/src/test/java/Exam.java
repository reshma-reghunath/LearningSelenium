import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exam {

	public static void main(String[] args) throws Throwable, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Excel Fetching
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\\\Exam.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		//Properties pobj=new Properties();
		//pobj.load(fis);
//		Sheet sh=book.getSheet("Sheet1");
//		Row r=sh.getRow(0);
//		Cell c=r.getCell(1);
//		String url=df.formatCellValue(c)

		String url=df.formatCellValue(book.getSheet("Sheet1").getRow(0).getCell(1));
		System.out.println(url);
		
		//launch the browser
		driver.get(url);
		//String url1="https://dev.saddlepointtech.com";
		
		
		
		
		//Enter the email
		
		String username=df.formatCellValue(book.getSheet("Sheet1").getRow(1).getCell(1));
		System.out.println(username);
		driver.findElement(By.id("first_field")).sendKeys(username);
		
		//Enter paswword
		
		String pwd=df.formatCellValue(book.getSheet("Sheet1").getRow(2).getCell(1));
		System.out.println(pwd);
		driver.findElement(By.id("second_field")).sendKeys(pwd);
		
		//Click submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
		//click on master data
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='z-toolbarbutton-content'])[1]/img")).click();
//		
//		driver.findElement(By.id("mQGMe3-cave")).click();
		
		//master data
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Master Data'])[2]")).click();
		
		
		//product location
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Product Location']")).click();
		
		
		//save
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='oIxC68']/img[@id='oIxC78']")).click();
         driver.findElement(By.xpath("//img[contains(@src,'/page/sp/./img/button/save.png')]")).click();

	
	   //message capturing and printing in console
        WebElement msg= driver.findElement(By.xpath("//span[text()='No changes made']"));
        System.out.println(msg);
	
	}
}
