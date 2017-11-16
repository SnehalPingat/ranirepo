package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=cyLwWbOGJqbv8wew869I");
		WebElement wb = driver.findElement(By.xpath("//div[@id='sb_ifc0']"));
		//wb.sendKeys("seleniumhq");
		//driver.findElement(By.xpath("//input[@type='button'and@value='Google Search']")).click();
		//driver.navigate().refresh();
		//wb.sendKeys("Download");*/
		System.out.println("Address="+ driver.toString());
		
		
		
		
	}

}
