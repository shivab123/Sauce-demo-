package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class AddToCartPage extends Baseclass {

	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	@FindBys(@FindBy(xpath="//div[@class='inventory_item_description']//button"))
	private List<WebElement> addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement container;
	
	@FindBy(name="checkout")
	private WebElement checkout;
	
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userClickOnFilter(String drop) {
		
		Wait.click(dropdown);
		HandleDropDown.selectByVisibleText(dropdown, drop);	
	}
	
	public void addtocart(int value ) {
		
		int count=0;
		int maxcount=value;
		for(WebElement abc: addtocart) {
			if(maxcount > count) {
				count++;
				Wait.click(abc);
			}

		}
	
	}
	 public void clcikOnContainer(WebElement wb) {
		 Wait.click(container);	 
	 }
	
	 public void checkout(WebElement wb) {
		  Wait.click(checkout);
	 }
}

