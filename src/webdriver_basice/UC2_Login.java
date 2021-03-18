package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC2_Login {



	@Test
	//Login Pass
	public void TC101() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/seoldsk/index.php/seold/");
	    driver.findElement(By.id("button")).click();
	    driver.findElement(By.name("se_studenid")).click();
	    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
	    driver.findElement(By.id("input-password")).click();
	    driver.findElement(By.id("input-password")).sendKeys("12345678");
	    driver.findElement(By.name("login")).click();
	    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/center")).getText();

		String expectedString = "วรทัต";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);
	    driver.close();

	}
	// Login fail
		@Test
		public void TC102() throws InterruptedException {
			WebDriver driver = null;
			String browser = "chrome";

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get("http://localhost/seoldsk/index.php/seold/");
		    driver.findElement(By.id("button")).click();
		    driver.findElement(By.name("se_studenid")).click();
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("0000");
		    driver.findElement(By.name("login")).click();
		    Alert alert = driver.switchTo().alert();
		    String alertMessage = driver.switchTo().alert().getText();
		    System.out.println(alertMessage);
			Thread.sleep(1000);
			String expectedString = "คุณกรอกรหัสผ่านไม่ถูกต้องหรือกรุณาสมัครสมาชิกก่อนค่ะ !";
			assertTrue(alertMessage.equals(expectedString));
			alert.accept();
		    driver.close();
		}
		
		//Login fail 
		@Test
		public void TC103() throws InterruptedException {
			WebDriver driver = null;
			String browser = "chrome";

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.get("http://localhost/seoldsk/index.php/seold/");
		    driver.findElement(By.id("button")).click();
		    
		    driver.findElement(By.name("login")).click();
		    Alert alert = driver.switchTo().alert();
		    String alertMessage = driver.switchTo().alert().getText();
		    System.out.println(alertMessage);
			Thread.sleep(1000);
			String expectedString = "คุณกรอกรหัสผ่านไม่ถูกต้องหรือกรุณาสมัครสมาชิกก่อนค่ะ !";
			assertTrue(alertMessage.equals(expectedString));
			alert.accept();
		    driver.close();
		}
}