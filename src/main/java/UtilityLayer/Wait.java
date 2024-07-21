package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.Baseclass;

public class Wait extends Baseclass {

	public static WebElement visibilityOf(WebElement wb) {
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	public static void click( WebElement wb) {
		
		 new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	public static void sendKeys(String value, WebElement wb) {
		
		visibilityOf(wb).sendKeys(value);
	}
	
}
