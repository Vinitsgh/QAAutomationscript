import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript {
	

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		{
			// String month="November";
			// String day="2";
			System.setProperty("webdriver.gecko.driver", "D:\\Vinit\\Automation\\geckodriver\\geckodriver.exe");

			// webdriver.chrome.driver
			WebDriver driver = new FirefoxDriver();
			driver.get("https://stage.sided.co");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(4000);

			// Do Normal user login

			driver.findElement(By.xpath("/html/body/header/div/div[2]/nav/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			// Do Login
			driver.findElement(By.id("email")).sendKeys("hftest1@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.id("pwd")).sendKeys("test@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='login']/button")).click();
			Thread.sleep(10000);
			// **********************Create debate **************************
			driver.findElement(By.linkText("Start a Debate")).click();
			Thread.sleep(3000);
			// Fill statement or question field
			driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[1]/div/textarea"))
					.sendKeys("According to the ISTQB Glossary, what do we mean when we call someone a test manager?");
			Thread.sleep(3000);
			// Increase side number
			for (int i = 1; i <= 2; i++) {
				driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[1]/h5/a"))
						.click();
				Thread.sleep(3000);

			}
			// Fill value in side1
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[1]/div/div[1]/div/textarea"))
					.sendKeys("Statement Coverage");
			Thread.sleep(3000);
			// Fill value in side2
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[1]/div/div[2]/div/textarea"))
					.sendKeys("Pole Coverage");
			Thread.sleep(3000);

			// Fill value in side3
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[1]/div/div[3]/div/textarea"))
					.sendKeys("Condition Coverage");
			Thread.sleep(3000);
			// Fill value in side4
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[1]/div/div[4]/div/textarea"))
					.sendKeys("Path Coverage");
			Thread.sleep(3000);
			// Randomize side radio button selection
			for (int i = 1; i <= 2; i++) {
				driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[2]/div[2]/label/span"))
						.click();
				Thread.sleep(1000);
			}
			// Fill background data
			driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[3]/div/div[2]/div[1]"))
					.sendKeys(
							"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus condimentum sagittis lacus, laoreet luctus ligula laoreet ut. Vestibulum ullamcorper accumsan velit vel vehicula. Proin tempor lacus arcu. Nunc at elit condimentum, semper nisi et, condimentum mi. In venenatis blandit nibh at sollicitudin. Vestibulum dapibus mauris at orci maximus pellentesque.");
			Thread.sleep(5000);
			// Fill citations
			for (int i = 1; i <= 2; i++) {
				driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[4]/h5/a")).click();
				Thread.sleep(5000);
			}
			// Fill first citation text and URL
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[4]/div/div[1]/div[1]/textarea"))
					.sendKeys(
							"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus condimentum sagittis lacus, laoreet luctus ligula laoreet ut.");
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[4]/div/div[1]/div[2]/textarea"))
					.sendKeys(
							"https://stage.sided.co/debate/a-system-program-that-combines-the-separately-compiled-modules-of-a-program-into-a-form-suitable-for-execution-a-system-program-that-combines-the-separately-compiled-modules-of-a-program-into-a-form-suitable-for-execution-1");
			Thread.sleep(3000);
			// Fill second citation text and URL
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[4]/div/div[2]/div[1]/textarea"))
					.sendKeys(
							"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus condimentum sagittis lacus, laoreet luctus ligula laoreet ut.");
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[1]/div[4]/div/div[2]/div[2]/textarea"))
					.sendKeys(
							"https://stage.sided.co/debate/a-system-program-that-combines-the-separately-compiled-modules-of-a-program-into-a-form-suitable-for-execution-a-system-program-that-combines-the-separately-compiled-modules-of-a-program-into-a-form-suitable-for-execution-1");
			Thread.sleep(3000);

			// Select categories
			// select sports
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[2]/div/div/div[1]/label/span")).click();
			Thread.sleep(3000);
			// select politics
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[2]/div/div/div[2]/label/span")).click();
			Thread.sleep(3000);
			// select religion
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[2]/div/div/div[3]/label/span")).click();
			Thread.sleep(3000);

			// select Technology
			driver.findElement(
					By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[2]/div/div/div[4]/label/span")).click();
			Thread.sleep(3000);
			// Fill End date
			// driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[4]/div/div/input[2]")).click();
			// Thread.sleep(6000);
			// click back arrow to move on october month
			/*
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[1]/span[1]/svg")
			 * ).click(); Thread.sleep(3000);
			 */

			/*
			 * while(true) { String text=driver.findElement(By.
			 * xpath("//div[@class='flatpickr-calendar hasTime animate static open arrowBottom']//span[@class='cur-month'][contains(text(),'November')]"
			 * )).getText(); if(text.equals(month)) { break; } else {
			 * driver.findElement(By.xpath(
			 * "//*[@id=\\\"createDebate\\\"]/div/div[2]/div[4]/div/div/div/div[1]/span[2]/svg"
			 * )).click(); } }
			 */

			// click on next month arrow
			// driver.findElement(By.xpath("//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[1]/span[2]/svg")).click();
			// Thread.sleep(3000);
			// Thread.sleep(3000);

			/*
			 * //click a date driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[2]/div/div[2]/div/span[6],"
			 * +day+")]")).click();
			 * 
			 * Thread.sleep(3000); //Fill HH driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[3]/div[1]/input"
			 * )).sendKeys("12"); Thread.sleep(3000); //Fill Minutes
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[3]/div[2]/input"
			 * )).sendKeys("45"); Thread.sleep(3000); //select AM & PM for(int i=1; i<=2;
			 * i++) { driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[4]/div/div/div/div[3]/span[2]")).
			 * click(); Thread.sleep(3000); }
			 */
			// select Technology
			/*
			 * driver.findElement( By.xpath(
			 * "/html/body/div[8]/div/div/div/form/div/div[2]/div[2]/div/div/div[8]/label/span"
			 * )).click(); Thread.sleep(3000);
			 */
			/*
			 * // Debate card image upload
			 * 
			 * WebElement uploadElement = driver.findElement(By.id(
			 * "//*[@id=\\\"createDebate\\\"]/div/div[2]/div[6]/div/div[1]/label")); //
			 * enter the file path onto the file-selection input field
			 * uploadElement.sendKeys("C:\\newhtml.html");
			 * 
			 * 
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"createDebate\"]/div/div[2]/div[6]/div/div[1]/label")).click();
			 * Thread.sleep(3000);
			 */
			// Create debate
			driver.findElement(By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[1]/button")).click();

			// html/body/div[8]/div/div/div/form/div/div[2]/div[1]/button
			Thread.sleep(10000);

			// close browser
			driver.close();
		}

	}



}
