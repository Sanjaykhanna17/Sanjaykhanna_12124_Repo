package com.bms.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class TestA {

	private WebDriver driver;

	@LocalServerPort
	private int port;
	

	@Test
	public void testAppPayee1() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("addPayee")).click();
		driver.findElement(By.name("payeeName")).sendKeys("Test001");
		driver.findElement(By.name("nickName")).sendKeys("TS1");
		driver.findElement(By.name("accountNumber")).sendKeys("1234567890");
		driver.findElement(By.name("addBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testAppPayee2() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("addPayee")).click();
		driver.findElement(By.name("payeeName")).sendKeys("Test002");
		driver.findElement(By.name("nickName")).sendKeys("TS2");
		driver.findElement(By.name("accountNumber")).sendKeys("1234567891");
		driver.findElement(By.name("addBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testAppPayee3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("addPayee")).click();
		driver.findElement(By.name("payeeName")).sendKeys("Test003");
		driver.findElement(By.name("addBtn")).click();
		driver.findElement(By.name("nickName")).sendKeys("TS3");
		driver.findElement(By.name("accountNumber")).sendKeys("1234567892");
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testAppPayee4() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("addPayee")).click();
		driver.findElement(By.name("payeeName")).sendKeys("Test001");
		driver.findElement(By.name("nickName")).sendKeys("TS1");
		driver.findElement(By.name("accountNumber")).sendKeys("1234567894");
		driver.findElement(By.name("addBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testAppPayee5() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("addPayee")).click();
		driver.findElement(By.name("payeeName")).sendKeys("Test004");
		driver.findElement(By.name("nickName")).sendKeys("TS4");
		driver.findElement(By.name("accountNumber")).sendKeys("1234567890");
		driver.findElement(By.name("addBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".MuiSvgIcon-fontSizeSmall")).click();
		driver.close();
	}

}
