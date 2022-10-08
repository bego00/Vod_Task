package org.example.pages;

import io.cucumber.java.bs.A;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Vodafone_Iphone {
WebDriver driver;

public Vodafone_Iphone(WebDriver driver) {
		this.driver = driver;

}

public WebElement Click_English() {
		return driver.findElement(By.cssSelector("span[class=\"lang\"]"));

}

public WebElement Apple_brand() {
		By brand = By.xpath("//ul[@class='brandContainer-brands-list utag--brands']//li[5]//a");
		return  driver.findElement(By.cssSelector("ul>:nth-child(5).brand>a"));

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//		WebElement apple_brand = driver.findElement(By.cssSelector("ul>:nth-child(5).brand>a"));
//		wait.until(ExpectedConditions.visibilityOf(apple_brand));
//		return apple_brand;
}


public WebElement Select_Iphone() {
		//return  driver.findElement(By.xpath("//div[@id='home-0']//ul[1]//li[2]//div[2]//img"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500");
		WebElement Iphone = driver.findElement(By.xpath("(//*[@class=\"productList-item\"]/a)[1]"));
		wait.until(ExpectedConditions.visibilityOf(Iphone));
		return Iphone;
}

public WebElement Click_Add_To_Cart() {
		return driver.findElement(By.cssSelector(".addToBasket-btn>.btn"));
}

public WebElement Proceed_To_Checkout() {
		return driver.findElement(By.cssSelector(".cart_checkout >.btn"));
}

public WebElement Get_City() {
		return driver.findElement(By.cssSelector("select[class='btn dropdown-toggle checkout-dropdown border-radius_Style checkoutDeliveryFamilyFont']"));
}

public WebElement Get_Sector() {
		return driver.findElement(By.cssSelector("select[ class=\"btn dropdown-toggle checkout-dropdown border-radius_Style checkoutDeliveryFamilyFont ng-pristine ng-valid ng-touched\"]"));
}

public void Delivery_Options(String city, String sector) {
		Select City = new Select(Get_City());
		Select Sector = new Select(Get_Sector());

		City.selectByValue(city);
		Sector.selectByValue(sector);
}

public WebElement Deliver_To_My_Add() {
		return driver.findElement(By.cssSelector("div[class=\"ui-icon ui-icon-deliveryOpt tracker\"]"));
}

public WebElement Street_Name() {
		return driver.findElement(By.xpath("//form[@id='checkout-deliveryAdd']//input[@placeholder='Street Name']"));
}

public WebElement Building_Number() {
		return driver.findElement(By.xpath("//form[@id='checkout-deliveryAdd']//input[@maxlength='10']"));
}

public WebElement Floor_Number() {
		return driver.findElement(By.xpath("//form[@id='checkout-deliveryAdd']//input[@maxlength='2']"));
}

public WebElement LandMark() {
		return driver.findElement(By.xpath("//form[@id='checkout-deliveryAdd']//div[5]//input"));
}

WebElement AddressName() {
		return driver.findElement(By.xpath("//form[@id='checkout-deliveryAdd']//div[6]//input"));
}


public void Address_Details(String StreetName, String B_No, String F_No, String A_No, String LandMark, String AddName) {
		Street_Name().sendKeys(StreetName);
		Building_Number().sendKeys(B_No);
		Floor_Number().sendKeys(F_No);
		AddressName().sendKeys(A_No);
		LandMark().sendKeys(LandMark);
		AddressName().sendKeys(AddName);

}

public WebElement Continue_Button() {
		return driver.findElement(By.xpath("//form//div[@class='checkout-addressBtn']//button"));
}


public void Assert_Error_message() {
		String error = driver.findElement(By.cssSelector("#collapseTwo >" +
						" form > div > div >" +
						" div.col-md-6.col-sm-12.checkout-formControl." +
						"checkout-formControl1 > div:nth-child(1) > " +
						"app-alert > div > div > div > " +
						"div.alert-caption-alertText.checkoutAlertText" +
						" > div > div > div")).getText();
		String Actual = "Please enter a valid name";
		Assert.assertTrue(error.contains(Actual));
}
}

