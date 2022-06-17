import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testclass {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnuBrindu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/login");
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("test123@gmail.com");
	Thread.sleep(1000);
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("test123");
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(2000);
	button.click();
	
}
}
