package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;

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

class UC3_Search {

	
	//test search 01 pass (search by id)
	@Test
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
	    driver.findElement(By.name("title")).click();
	    driver.findElement(By.name("title")).sendKeys("614259043");
	    driver.findElement(By.name("submit")).click();
	    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/center")).getText();

		String expectedString = "วรทัต";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);
	    driver.close();
	}
	
	//test search 02 pass (search by province)
		@Test
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
			    Thread.sleep(700);
			    driver.findElement(By.name("se_studenid")).click();
			    Thread.sleep(700);
			    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
			    Thread.sleep(700);
			    driver.findElement(By.id("input-password")).click();
			    Thread.sleep(700);
			    driver.findElement(By.id("input-password")).sendKeys("12345678");
			    Thread.sleep(700);
			    driver.findElement(By.name("login")).click();
			    Thread.sleep(700);
			    driver.findElement(By.cssSelector("form:nth-child(2) > .input-search")).click();
			    Thread.sleep(700);
			    driver.findElement(By.cssSelector("form:nth-child(2) > .input-search")).sendKeys("เพชรบุรี");
			    Thread.sleep(700);
			    driver.findElement(By.cssSelector("form:nth-child(2) > input:nth-child(2)")).click();
			    Thread.sleep(700);
			    
			    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/center")).getText();

				String expectedString = "614259043";

				// assertTrue(actualString.contains(expectedString));
				assertEquals(actualString, expectedString);

				Thread.sleep(500);
			    driver.close();
	
		}
		
		//test search 03 pass (search by name)
				@Test
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
				    driver.findElement(By.cssSelector("form:nth-child(3) > .input-search")).click();
				    Thread.sleep(700);
				    driver.findElement(By.cssSelector("form:nth-child(3) > .input-search")).sendKeys("ธนายุทธ");
				    driver.findElement(By.cssSelector("form:nth-child(3) > input:nth-child(2)")).click();

				    
				    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/center")).getText();
					String expectedString = "ธนายุทธ";

					// assertTrue(actualString.contains(expectedString));
					assertEquals(actualString, expectedString);

					Thread.sleep(500);
				    driver.close();
				}
				
			//test search 04 pass (search by yearend)
			@Test
					public void TC104() throws InterruptedException {
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
				    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
				    driver.findElement(By.cssSelector("form")).click();
				    driver.findElement(By.id("input-password")).click();
				    driver.findElement(By.id("input-password")).sendKeys("12345678");
				    driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
				    driver.findElement(By.cssSelector("form:nth-child(4) > .input-search")).click();
				    Thread.sleep(700);
				    driver.findElement(By.cssSelector("form:nth-child(4) > .input-search")).sendKeys("2564");
				    driver.findElement(By.cssSelector("form:nth-child(4) > input:nth-child(2)")).click();
				    
				    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/center")).getText();
					String expectedString = "ชนากาต์";

					// assertTrue(actualString.contains(expectedString));
					assertEquals(actualString, expectedString);

					Thread.sleep(500);
				    driver.close();
				    
			}
			
			//test search 05 pass (search by session)
			@Test
					public void TC105() throws InterruptedException {
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
				    Thread.sleep(700);
				    driver.findElement(By.name("se_studenid")).click();
				    Thread.sleep(700);
				    driver.findElement(By.name("se_studenid")).sendKeys("614259043");
				    Thread.sleep(700);
				    driver.findElement(By.id("input-password")).click();
				    Thread.sleep(700);
				    driver.findElement(By.id("input-password")).sendKeys("12345678");
				    Thread.sleep(700);
				    driver.findElement(By.name("login")).click();
				    Thread.sleep(700);
				    driver.findElement(By.cssSelector("form:nth-child(5) > .input-search")).click();
				    Thread.sleep(900);
				    driver.findElement(By.cssSelector("form:nth-child(5) > .input-search")).sendKeys("61/99");
				    Thread.sleep(700);
				    driver.findElement(By.cssSelector("form:nth-child(5) > input:nth-child(2)")).click();
				    

				    String actualString = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[5]/center")).getText();
					String expectedString = "0852638675";

					// assertTrue(actualString.contains(expectedString));
					assertEquals(actualString, expectedString);

					Thread.sleep(500);
				    driver.close();
			
				
			}
}
