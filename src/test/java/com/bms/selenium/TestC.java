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
public class TestC {

	private WebDriver driver;
	
	@LocalServerPort
	private int port;
	

	@Test
	public void testEditPayee1() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:"+port);
		driver.findElement(By.name("edit1")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test006");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS6");
		driver.findElement(By.name("editBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testEditPayee2() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:"+port);
		driver.findElement(By.name("edit2")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test005");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS5");
		driver.findElement(By.name("editBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testEditPayee3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:"+port);
		driver.findElement(By.name("edit2")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test004");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS5");
		driver.findElement(By.name("cancelBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
