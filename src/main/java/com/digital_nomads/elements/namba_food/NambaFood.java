package com.digital_nomads.elements.namba_food;

import com.digital_nomads.elements.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NambaFood extends SetUp {

    private final String NAMBAFOOD_URL = "https://nambafood.kg/";

    @Test
    public void testOrderFood() throws InterruptedException {

        String expectedResult = "John, спасибо, ваш заказ принят!";

        driver.get(NAMBAFOOD_URL);
        WebElement food = driver.findElement(By.xpath("//a[@href='/food']"));
        food.click();

        WebElement natFood = driver.findElement(By.xpath("//div[text()='Национальная кухня']"));
        natFood.click();

        WebElement aligator = driver.findElement(By.xpath("//a[@href='/alligator']"));
        aligator.click();

        WebElement salads = driver.findElement(By.xpath("//a[@href='#14']"));
        WebElement sezar = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[5]"));
        sezar.click();

        WebElement cart = driver.findElement(By.xpath("//div[@id='cart']"));
        cart.click();

        WebElement orderButton = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        orderButton.click();

        WebElement name = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        name.sendKeys("John");

        WebElement address = driver.findElement(By.xpath("//input[@id='food_order_address']"));
        address.sendKeys("Чуй 136");
        Thread.sleep(1000);

        WebElement floor = driver.findElement(By.xpath("//input[@id='food_order_door_code']"));
        floor.sendKeys("5");
        Thread.sleep(1000);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='food_order_phone']"));
        phoneNumber.sendKeys("0555789312");
        Thread.sleep(1000);

        WebElement cahPayment = driver.findElement(By.xpath("//li[@class='resp-tab-item resp-tab-active']"));
        SetUp.scrollToIntoView(driver,cahPayment);
        cahPayment.click();
        Thread.sleep(1000);
//
//        WebElement moneyChange = driver.findElement(By.xpath("//input[@id='food_order_money_change']"));
//        moneyChange.sendKeys("1000");
//
//        WebElement cashPayment = driver.findElement(By.xpath("//button[@id='payment_cash']"));
//        SetUp.scrollToIntoView(driver,cahPayment);
//        cahPayment.click();
//
//        Assert.assertEquals("John, спасибо, ваш заказ принят!", expectedResult);


    }
}
