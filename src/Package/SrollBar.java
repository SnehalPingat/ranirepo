package Package;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SrollBar
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,4500)");
		/*Actions act = new Actions(driver);
		System.out.println(driver.manage().window().getSize());
		act.moveByOffset(1, 8).click();*/
		//Dimension d = new Dimension(700,600);
		//driver.manage().window().setSize(d);
		//System.out.println(driver.manage().window().getSize());
		
		//System.out.println(driver.manage().window().getPosition());
		//Point p = new Point(400,300);
		//driver.manage().window().setPosition(p);
		WebElement wb = driver.findElement(By.xpath("//span[contains(text(), 'All Jewellery ')]"));
		//wb.click();
		System.out.println("text="+wb.getCssValue("background-color"));
	

	}

}
