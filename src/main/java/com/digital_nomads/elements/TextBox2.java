package com.digital_nomads.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBox2 extends SetUp {
    private final static String DEMOQA_URL = "https://demoqa.com/text-box";

    @Test
    public void testForm() {

        driver.get(DEMOQA_URL);

        String name = "Meerim";
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys(name);

        String email = "meerima_312@hotmail.com";
        WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        userEmail.sendKeys(email);

        String currentAddress = "Seattle";
        WebElement currAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currAddress.sendKeys(currentAddress);

        String permanentAddress = "Seattle";
        WebElement permAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permAddress.sendKeys(permanentAddress);

        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        scrollToIntoView(driver, submitButton);
        submitButton.click();

        Assert.assertEquals(name, "Meerim");
        Assert.assertEquals(email, "meerima_312@hotmail.com");
        Assert.assertEquals(currentAddress, "Seattle");
        Assert.assertEquals(permanentAddress, "Seattle");
    }
}



