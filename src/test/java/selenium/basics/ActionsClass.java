package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		
		WebElement element = driver.findElement(By.id("signIn"));
		
		WebElement target = driver.findElement(By.id("targetIDValue"));
		
		WebElement source = driver.findElement(By.id("sourceIDValue"));
		
		
		
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();   // this will double click on the element
		action.contextClick(element).perform();  // this will right click on the element
		action.moveToElement(element).perform(); // this will move the mouse cursor to the element
		action.dragAndDrop(source, target).perform();  // this will drag an element from source and drop it to the target
		action.scrollToElement(element).perform();
		
		
		
		
		
		
	}

}
