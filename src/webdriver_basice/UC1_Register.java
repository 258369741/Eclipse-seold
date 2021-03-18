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

class UC1_Register {

	// Register_pass
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
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("se_studentid")).click();
		driver.findElement(By.name("se_studentid")).sendKeys("614259053");
		driver.findElement(By.name("se_numna")).click();
		driver.findElement(By.name("se_numna")).sendKeys("นาย");
		driver.findElement(By.name("se_name")).click();
		driver.findElement(By.name("se_name")).sendKeys("วรทัต");
		driver.findElement(By.name("se_lastname")).click();
		driver.findElement(By.name("se_lastname")).sendKeys("ปั้นอินทร์");
		driver.findElement(By.name("se_idcard")).click();
		driver.findElement(By.name("se_idcard")).click();
		driver.findElement(By.name("se_idcard")).sendKeys("1739900691026");
		driver.findElement(By.name("se_session")).click();
		driver.findElement(By.name("se_session")).sendKeys("61/100");
		driver.findElement(By.name("se_yearend")).click();
		driver.findElement(By.name("se_yearend")).sendKeys("2560");
		driver.findElement(By.name("se_skill")).click();
		driver.findElement(By.name("se_skill")).sendKeys("บลาๆ");
		driver.findElement(By.name("se_tel")).click();
		driver.findElement(By.name("se_tel")).sendKeys("0852638675");
		driver.findElement(By.name("se_facebook")).click();
		driver.findElement(By.name("se_facebook")).sendKeys("milk_worathat");
		driver.findElement(By.name("se_email")).click();
		driver.findElement(By.name("se_email")).sendKeys("614259043@webmail.npru.ac.th");
		driver.findElement(By.name("se_lakete")).click();
		driver.findElement(By.name("se_lakete")).sendKeys("2/1");
		driver.findElement(By.name("se_mu")).click();
		driver.findElement(By.name("se_mu")).sendKeys("6");
		driver.findElement(By.name("se_district")).click();
		driver.findElement(By.name("se_district")).sendKeys("ไร่ใหม่");
		driver.findElement(By.name("se_aumpa")).click();
		driver.findElement(By.name("se_aumpa")).sendKeys("ชะอำ");
		driver.findElement(By.name("se_province")).click();
		driver.findElement(By.name("se_province")).sendKeys("เพชรบุรี");
		driver.findElement(By.name("work_name")).click();
		driver.findElement(By.name("work_name")).sendKeys("ตึกคอม");
		driver.findElement(By.name("work_rank")).click();
		driver.findElement(By.name("work_rank")).sendKeys("ลูกน้องจารย์");
		driver.findElement(By.name("work_lakete")).click();
		driver.findElement(By.name("work_lakete")).sendKeys("33/1");
		driver.findElement(By.name("work_mu")).click();
		driver.findElement(By.name("work_mu")).sendKeys("4");
		driver.findElement(By.name("work_district")).click();
		driver.findElement(By.name("work_district")).sendKeys("หนองปากโลง");
		driver.findElement(By.name("work_aumpua")).click();
		driver.findElement(By.name("work_aumpua")).sendKeys("เมือง");
		driver.findElement(By.name("work_province")).click();
		driver.findElement(By.name("work_province")).sendKeys("phetchaburi");
		driver.findElement(By.cssSelector(".form-group:nth-child(32)")).click();
		driver.findElement(By.name("work_province")).sendKeys("เพชรบุรี");
		driver.findElement(By.name("work_tel")).click();
		driver.findElement(By.name("work_tel")).sendKeys("0852638675");
		driver.findElement(By.name("se_password")).click();
		driver.findElement(By.name("se_password")).sendKeys("12345678");
		driver.findElement(By.cssSelector(".btn")).click();

		String actualString = driver.findElement(By.xpath("/html/body/div/h1")).getText();

		String expectedString = "Alumni Website";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

		driver.close();
	}

	// Register_fail
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
		Thread.sleep(2000);
		driver.get("http://localhost/seoldsk/index.php/seold/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("work_province")).click();
		driver.findElement(By.name("work_province")).sendKeys("phetchaburi");
		driver.findElement(By.cssSelector(".form-group:nth-child(32)")).click();
		driver.findElement(By.name("work_province")).sendKeys("เพชรบุรี");
		driver.findElement(By.name("work_tel")).click();
		driver.findElement(By.name("work_tel")).sendKeys("0852638675");
		driver.findElement(By.name("se_password")).click();
		driver.findElement(By.name("se_password")).sendKeys("12345678");
		driver.findElement(By.cssSelector(".btn")).click();

		String actualString = driver.findElement(By.xpath("/html/body")).getText();

		String expectedString = "ไม่สามารถสมัครสมาชิกได้";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

		driver.close();
	}

	// Register_fail
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
		Thread.sleep(1000);
		driver.get("http://localhost/seoldsk/index.php/seold/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Register")).click();
		;

		driver.findElement(By.cssSelector(".btn")).click();

		String actualString = driver.findElement(By.xpath("/html/body")).getText();

		String expectedString = "ไม่สามารถสมัครสมาชิกได้";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		driver.close();
	}

}
