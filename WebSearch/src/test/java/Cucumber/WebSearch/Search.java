package Cucumber.WebSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Search {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Applications\\chromedriver-win64\\chromedriver.exe");
	    driver.get("https://www.coursera.org/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the web application
        driver.get("https://www.coursera.org/");

        // Perform keyword-driven actions
        performKeywordAction(driver, "type", "username");
        performKeywordAction(driver, "type", "password");
        performKeywordAction(driver, "click", "loginButton");

        // Close the browser
        driver.quit();
    }

    public static void performKeywordAction(WebDriver driver, String action, String value) {
        WebElement element;
        switch (action.toLowerCase()) {
            case "type":
                element = driver.findElement(By.xpath("//input[@placeholder='What do you want to learn?']"));
                element.sendKeys("Search");
                break;
            case "click":
                element = driver.findElement(By.xpath("//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']"));
                element.click();
                break;
            // Add more cases for other supported actions
            default:
                System.out.println("Unsupported action: " + action);
        }
    }
}
/*class Runner{
	WebDriver driver;
	// Test to select Browser
	public void selectBrower(String browser) {
		// if browser is Chrome
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Applications\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
        } else {
            System.out.println("Unsupported browser. Please choose 'chrome' or 'firefox'.");
            System.exit(0);
        }
		driver.get("https://letcode.in/test");
	}*/