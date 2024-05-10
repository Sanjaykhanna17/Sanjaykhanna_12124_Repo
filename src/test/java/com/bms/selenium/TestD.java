package com.bms.selenium;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class TestD {

	private WebDriver driver;

	@LocalServerPort
	private int port;
	

	@Test
	public void testDeletePayee1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.findElement(By.name("delete1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
