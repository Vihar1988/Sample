package MayTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanna\\Backup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.name("login")).click();
		WebElement radio1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		radio1.click();

		WebElement drop=driver.findElement(By.name("passCount"));
		Select select=new Select(drop);
select.selectByIndex(0);

List<WebElement> options= select.getOptions();
int size=options.size();
System.out.println("No of passenger" + size);

	}


}
