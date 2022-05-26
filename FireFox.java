package org.gecko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://fb.com");
		d.findElement(By.id("email")).sendKeys("azhagu");
		d.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(100);
		d.findElement(By.xpath("//div[@id=\"u_0_c_K4\"]")).click();
		d.close();
	}
	

}
