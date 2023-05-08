package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    //Mouse Hoover on WomenLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;
    // By womenLink = By.xpath("//span[normalize-space()='Women']");

    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topLink;
    //  By topLink = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    //click on jacket menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;
    // By jacketLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    //Mouse Hoover on MenLink

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menLink;
    // By menLink = By.xpath("//span[normalize-space()='Men']");

    // Mouse hoover Bottoms
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomLink;
    //By bottomLink = By.xpath("//a[@id='ui-id-18']");

    //click on pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;
    // By pantsLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    // Mouse Hoover on GearLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;
    // By gearLink = By.xpath("//span[normalize-space()='Gear']");

    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;
    //By bags = By.xpath("//span[normalize-space()='Bags']");


    public void mouserHooverToWomenMenu() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To WomenMenu " + womenLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Women Menu" + womenLink);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(womenLink)).build().perform();
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To Top Menu " + topLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Top Menu Link" + topLink);
        mouseHoverToElement(topLink);
    }

    public void clickOnJacket() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To Jacket Menu " + jacketLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Jacket Menu Link" + jacketLink);
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHooverToMenMenu() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To Men Menu " + menLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Men Menu Link" + menLink);
        mouseHoverToElement(menLink);
    }

    public void mouseHooverToBottomsMenu() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To Bottom Menu " + bottomLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Bottom Menu Link" + bottomLink);
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Click On Pants " + pantsLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Click On Pants" + pantsLink);
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Mouse Hoover To Gear Menu " + gearLink.toString());
        CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Gear Menu Link" + gearLink);
        mouseHoverToElement(gearLink);
    }

    // Click on Bags
    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click On Bags " + bags.toString());
        CustomListeners.test.log(Status.PASS, "User successful Click On Bags" + bags);
        clickOnElement(bags);
    }
}
