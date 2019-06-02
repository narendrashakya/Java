package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchclass {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("testing@email.com");
		
		Select Sel1=new Select (driver.findElement(By.xpath("//*[@id='day']")));
		Sel1.selectByVisibleText("25");
		Thread.sleep(1000);
		
		Select Sel2=new Select (driver.findElement(By.xpath("//*[@id='month']")));
		Sel2.selectByVisibleText("Dec");
		Thread.sleep(1000);

		Select Sel3=new Select (driver.findElement(By.xpath("//*[@id='year']")));
		Sel3.selectByVisibleText("1989");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id='u_0_d']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		driver.quit();
		
		
	}

}

