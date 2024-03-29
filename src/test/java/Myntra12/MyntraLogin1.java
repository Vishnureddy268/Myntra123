package Myntra12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MyntraLogin1 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		String title = driver.getTitle();
		
		Assert.assertEquals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra", title);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("Shirts for Men");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@data-colorhex='black']")).click();
		Actions ac= new Actions(driver);
		WebElement filterByPrice = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		ac.moveToElement(filterByPrice).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[normalize-space()='Customer Rating']")).click();
		
		driver.quit();
		
	}

}
