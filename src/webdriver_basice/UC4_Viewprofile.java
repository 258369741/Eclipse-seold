package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC4_Viewprofile {

	
	@Test
	//view profile pass
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
		driver.manage().window().maximize();
	    driver.findElement(By.id("button")).click();
	    driver.findElement(By.name("se_studenid")).click();
	    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
	    driver.findElement(By.id("input-password")).click();
	    driver.findElement(By.id("input-password")).sendKeys("12345678");
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(700);
	    driver.findElement(By.id("button2")).click();
	    
	    String actualString = driver.findElement(By.xpath("/html/body/div/h2[1]")).getText();

		String expectedString = "ข้อมูลส่วนตัว";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);
		
	    driver.close();
	}
	
	
		@Test
		//view profile pass
		public void TC102() throws InterruptedException {
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
			driver.manage().window().maximize();
		    driver.findElement(By.id("button")).click();
		    driver.findElement(By.name("se_studenid")).click();
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("12345678");
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(700);
		    driver.findElement(By.id("button2")).click();
		    
		    String actualString = driver.findElement(By.xpath("/html/body/div/h2[2]")).getText();

			String expectedString = "ข้อมูลที่ทำงาน";

			// assertTrue(actualString.contains(expectedString));
			assertEquals(actualString, expectedString);

			Thread.sleep(500);
			
		    driver.close();
		}
		
		@Test
		//view profile pass
		public void TC103() throws InterruptedException {
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
			driver.manage().window().maximize();
		    driver.findElement(By.id("button")).click();
		    driver.findElement(By.name("se_studenid")).click();
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("12345678");
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(700);
		    driver.findElement(By.id("button2")).click();
		    
		    String actualString = driver.findElement(By.xpath("/html/body/div/a[15]")).getText();

			String expectedString = "ชื่อบริษัท";

			// assertTrue(actualString.contains(expectedString));
			assertEquals(actualString, expectedString);

			Thread.sleep(500);
			
		    driver.close();
		}
}
