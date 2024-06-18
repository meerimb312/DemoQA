package com.digital_nomads.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox extends SetUp {

    @Test
    void textBoxTest() {

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Meerim");
    }

    @Test
    void textBoxTest1() {

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("meerima_312@hotmail.com");
    }

    @Test
    void textBoxTest2() {

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Seattle");
    }

    @Test
    void textBoxTest3() {

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Seattle");
    }

    @Test
    void textBoxTest4() {

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToIntoView(driver, submitButton);
        submitButton.click();
    }

    @Test
    void textBoxTest5() {

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Meerim");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("meerima_312@hotmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Seattle");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Seattle");

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToIntoView(driver, submitButton);
        submitButton.click();
    }

}
