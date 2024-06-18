package com.digital_nomads.elements.kover_samolet;

import com.digital_nomads.elements.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoverSamolet extends SetUp {

    private static final String KOVER_SAMOLET_URL = "https://dostavka312.kg/category/11";

    @Test
    public void orderFood() {

        String expectedResult = "Благодарим Вас за заказ! Для подтверждения заказа в течение 5 минут с Вами свяжется оператор.";

        driver.get(KOVER_SAMOLET_URL);

        WebElement europeanFood = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/category/11/38']"));
        europeanFood.click();

        WebElement omarHayam = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/omar-ne-hayam']"));
        omarHayam.click();

        WebElement sezar = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[8]"));
        sezar.click();

        WebElement cart = driver.findElement(By.xpath("//div[@class='pulse2']"));
        cart.click();

        WebElement order = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/cart']"));
        SetUp.scrollToIntoView(driver, order);
        order.click();

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("John");

        WebElement address = driver.findElement(By.name("address"));
        address.sendKeys("Чуй 136");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0555789312");

        WebElement money = driver.findElement(By.name("money"));
        money.sendKeys("1000");

        WebElement orderButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        orderButton.click();

        WebElement text = driver.findElement(By.xpath("//h2[text()='Благодарим Вас за заказ! Для подтверждения заказа в течение 5 минут с Вами свяжется оператор.']"));
        String value = text.getText();

        Assert.assertEquals(value, expectedResult);
    }
}
