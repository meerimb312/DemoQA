package com.digital_nomads.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

    public static void scrollOnce(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript(
                "window.scrollBy(0, 500);");
    }

    public static void scrollToFooter(WebDriver driver) {
        ((JavascriptExecutor)driver).executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollToIntoView(
            WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
