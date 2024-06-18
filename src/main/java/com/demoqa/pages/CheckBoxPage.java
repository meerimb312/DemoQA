package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement homeBtn;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[1]")
    public WebElement homeCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[2]")
    public WebElement desktopCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[3]")
    public WebElement notesCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[4]")
    public WebElement commandsCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[5]")
    public WebElement documentsCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[6]")
    public WebElement workspaceCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[7]")
    public WebElement reactCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[8]")
    public WebElement angularCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[9]")
    public WebElement veuCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[10]")
    public WebElement officeCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[11]")
    public WebElement downloadsCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[12]")
    public WebElement wordFileCheckBoxClick;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[3]")
    public WebElement excelFileCheckBoxClick;

    public CheckBoxPage checkBoxPageForm() {


        return this;
    }


}
