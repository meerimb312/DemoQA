package com.digital_nomads.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends SetUp {

    private static final String CHECK_BOX_URL = "https://demoqa.com/checkbox";

    @Test
    public void testDesktop() {

        driver.get(CHECK_BOX_URL);

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

        driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]")).click();
        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]")).click();

        WebElement text = driver.findElement(By.xpath("//div[@id='result']"));
        String value = text.getText();

        String expected = "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands";
        Assert.assertEquals(value, expected);

    }

    @Test
    public void testDocument() {

        driver.get(CHECK_BOX_URL);

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

        driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]")).click();
        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[3]")).click();

        WebElement textDocument = driver.findElement(By.xpath("//div[@id='result']"));
        String value = textDocument.getText();

        String expected = "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general";

        Assert.assertEquals(value, expected);
    }

    @Test
    public void testDownloads() {

        driver.get(CHECK_BOX_URL);

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

        driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[4]")).click();
        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]")).click();

        WebElement textDownloads = driver.findElement(By.xpath("//div[@id='result']"));
        String value = textDownloads.getText();

        String expected = "You have selected :\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        Assert.assertEquals(value, expected);
    }

    @Test
    public void testHome() {

        driver.get(CHECK_BOX_URL);

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]")).click();

        WebElement text = driver.findElement(By.xpath("//div[@id='result']"));
        String value = text.getText();

        String expected = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        Assert.assertEquals(value, expected);
    }

    @Test
    public void testHomeWithoutSelection() {

        driver.get(CHECK_BOX_URL);

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]")).click();

        driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]")).click();
        WebElement homeWithoutAnySelections = driver.findElement(By.xpath("//span[@class='rct-title']"));

        Assert.assertTrue(homeWithoutAnySelections.isDisplayed());
    }
}
