package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC5_Editprofile {

	

		@Test
		//test edit pass
		
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
		    Thread.sleep(700);
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    Thread.sleep(700);
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("12345678");
		    Thread.sleep(700);
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(700);
		    driver.findElement(By.id("button2")).click();
		    Thread.sleep(700);
		    driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		    driver.findElement(By.name("se_facebook")).click();
		    driver.findElement(By.name("se_facebook")).sendKeys("milkyboy");
		    Thread.sleep(700);
		    driver.findElement(By.name("submit")).click();
		    Thread.sleep(700);
		    
		    String actualString = driver.findElement(By.xpath("/html/body/div/h2[1]")).getText();
			String expectedString = "ข้อมูลส่วนตัว";

			// assertTrue(actualString.contains(expectedString));
			assertEquals(actualString, expectedString);

			Thread.sleep(500);
		    driver.close();
		}
		
		@Test
		//test edit fail
		
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
		    driver.findElement(By.cssSelector("form")).click();
		    driver.findElement(By.name("se_studenid")).click();
		    Thread.sleep(700);
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    Thread.sleep(700);
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("12345678");
		    Thread.sleep(700);
		    driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		    Thread.sleep(700);
		    driver.findElement(By.id("button2")).click();
		    Thread.sleep(700);
		    driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		    Thread.sleep(700);
		  
		    driver.findElement(By.name("submit")).click();
		    
		    Thread.sleep(700);
		    
		    String actualString = driver.findElement(By.xpath("/html/body/div/h2[2]")).getText();
			String expectedString = "ข้อมูลที่ทำงาน";

			// assertTrue(actualString.contains(expectedString));
			assertEquals(actualString, expectedString);

			Thread.sleep(500);
		    driver.close();
		}
		
		@Test
		
		//test edit fail
		
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
		    driver.findElement(By.cssSelector("form")).click();
		    driver.findElement(By.name("se_studenid")).click();
		    Thread.sleep(700);
		    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
		    Thread.sleep(700);
		    driver.findElement(By.id("input-password")).click();
		    driver.findElement(By.id("input-password")).sendKeys("12345678");
		    Thread.sleep(700);
		    driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		    Thread.sleep(700);
		    driver.findElement(By.id("button2")).click();
		    Thread.sleep(700);
		    driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		    Thread.sleep(700);
		  
		    driver.findElement(By.name("submit")).click();
		    
		    Thread.sleep(700);
		    
		    String actualString = driver.findElement(By.xpath("/html/body/div/a[3]")).getText();
			String expectedString = "ชื่อ";

			// assertTrue(actualString.contains(expectedString));
			assertEquals(actualString, expectedString);

			Thread.sleep(500);
		    driver.close();
		    
		}
			
}
