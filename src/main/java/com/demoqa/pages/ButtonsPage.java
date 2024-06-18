package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickBtnMessage;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickBtnMessage;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickme;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;
}
