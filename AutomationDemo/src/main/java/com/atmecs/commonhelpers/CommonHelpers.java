package com.atmecs.commonhelpers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonHelpers {
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
    }

	public static void sendText(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
		
	}


	public static void dropDownMenu(WebDriver driver, String xpath, String valueToSelect) throws Exception {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByVisibleText(valueToSelect);
	}
	public static void switchTOWindows(WebDriver driver ,String elementPath) {
     String mainWindow=driver.getWindowHandle();
	Set<String> set =driver.getWindowHandles();
	Iterator<String> itr= set.iterator();
	while(itr.hasNext()){
	String childWindow=itr.next();
	if(!mainWindow.equals(childWindow)){
	driver.switchTo().window(childWindow);
	System.out.println("childwindow" + driver.switchTo().window(childWindow).getTitle());
	driver.close();
	}
	
    driver.switchTo().window(mainWindow);
	System.out.println("mainwindow" + driver.switchTo().window(mainWindow).getTitle());

    
	}
	}
}
