package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SelectPage extends BasePage {

    @FindBy(xpath = "(//div[@class =  ' css-yk16xz-control'])[1]")
    public WebElement selectValue;

    @FindBy(xpath = "//div[contains(@class,'option')]")
    public List<WebElement> selectValueOptions;

    @FindBy(xpath = "(//div[@class =  ' css-yk16xz-control'])[2]")
    public WebElement selectOne;

    @FindBy(xpath = "(//div[@class =  ' css-yk16xz-control'])[3]")
    public WebElement selectMultiselectDropDown;

    @FindBy(id = "oldSelectMenu")
    public WebElement oldSelectMenu;

    @FindBy(id = "cars")
    public WebElement StandardMultiSelect;

    @Step("Select all options")
    public List<String> getAllDivOptions(WebElement divElement, String optionsXPath) {
        divElement.click();
        List<WebElement> options = DriverManager.getDriver().findElements(By.xpath(optionsXPath));
        return options.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    @Step("Select one option")
    public List<String> getSelectOneOptions() {
        return getAllDivOptions(selectOne, "//*[@class=' css-26l3qy-menu']");
    }

}
