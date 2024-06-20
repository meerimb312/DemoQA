package com.demoqa.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SidePanelPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @Step("Login method")
    public SidePanelPage signIn(String userName, String password) {
        webElementActions.sendKeys(userNameInput, userName)
                .sendKeys(passwordInput, password)
                .click(loginBtn);

        return this;
    }


    //    public SidePanelPage chooseSidebarMenu(SidePanelMenu sidebarMenuName) {
//        WebElement element = DriverManager.getDriver().findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='" + sidebarMenuName.getMenu() + "']"));
//        element.click();
//        return this;
//    }
}

