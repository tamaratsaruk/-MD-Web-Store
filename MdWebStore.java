package com.mdwebstore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MdWebStore {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.mdwebstore.it/");
	   driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[2]/div[3]/div/ul/li/div/a/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input")).sendKeys("tamaraburlaka@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")).sendKeys("delicious94");
	    driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();
	  
	 
	    Thread.sleep(3000);
	    driver.quit();
	    
	    
		
	}
}
