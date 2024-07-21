package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class HandleDropDown extends Baseclass {
	
 public static void selectByVisibleText(WebElement wb, String value) {
	// Select sel =new Select(Wait.visibilityOf(wb));
	  // sel.selectByVisibleText(value);
	 
	 new Select(Wait.visibilityOf(wb)).selectByVisibleText(value);
 }
	
 
 
}
