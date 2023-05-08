package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    //********* Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hooverPantSize;
    // By hooverPantSize = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement pantSize;
    // By pantSize = By.xpath("//div[@id='option-label-size-143-item-175']");

    //******** Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement hooverPantColour;
    // By hooverPantColour = By.xpath("(//div[@class='swatch-option color'])[1]");
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement pantColour;
    // By pantColour = By.xpath("//div[@id='option-label-color-93-item-49']");

    //******** Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHooverToBoth;
    // By mouseHooverToBoth = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart;
    // By addToCart = By.xpath("//span[normalize-space()='Add to Cart']");

    //******** Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyShoppingCart;
    // By verifyShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    //********** Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    // By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void clickOnPantSize() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Pant Size " + pantSize.toString());
        CustomListeners.test.log(Status.PASS, "User Successfully Click on Pant Size" + pantSize);
        mouseHoverToElement(hooverPantSize);
        mouseHoverToElementAndClick(pantSize);
    }

    public void clickOnPantColour() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on Pant Colour " + pantColour.toString());
        CustomListeners.test.log(Status.PASS, "User Successfully Click on Pant Colour" + pantColour);
        mouseHoverToElement(hooverPantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click On Add To Cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "User Successfully Click on Add To Cart " + addToCart);
        mouseHoverToElement(mouseHooverToBoth);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Verify Add Items " + verifyShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "User Successfully Verify Added Items To The ShoppingCart " + verifyShoppingCart);
        return getTextFromElement(verifyShoppingCart);
    }

    public void shoppingCartLink() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Shopping Cart Link " + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "User Successfully Click Shopping Cart " + shoppingCart);
        clickOnElement(shoppingCart);
    }

}


