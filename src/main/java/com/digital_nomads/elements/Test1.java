package com.digital_nomads.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 extends SetUp {

    @Test
    public void testOrder() {

        driver.get("https://dostavka312.kg/category/11");
//        List<WebElement> kafeList = driver.findElements(By.xpath("//div[@class='panel-heading']"));
        List<WebElement> kafeList = driver.findElements(By.xpath("//div[@class='col-sm-6']"));

        for (WebElement kafe : kafeList) {
            System.out.println(kafe.getText() + "\n======================================================");
            //Thread.sleep(9000);
        }


        for (WebElement kafeList1 : kafeList) {
            if (kafeList1.getText().equals("Ресторан \n" +
                    "Тоголока Молдо, 17/1а")) {

                WebElement submitButton = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek']"));
                // driver.get("https://dostavka312.kg/garnirygpt/restoran-pishpek");
                submitButton.click();
                List<WebElement> zavtraki = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[1]"));
                for (WebElement zav : zavtraki) {
                    System.out.println("ЗАВТРАКИ\n" + zav.getText() + "\n ---------------------------------------");
                }

                List<WebElement> holodnyeZakuski = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[2]"));
                for (WebElement holZavt : holodnyeZakuski) {
                    System.out.println("ХОЛОДНЫЕ ЗАКАЗЫ\n" + holZavt.getText() + "\n ---------------------------------------");
                }

                List<WebElement> sup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[4]"));
                for (WebElement sup1 : sup) {
                    System.out.println("СУП\n" + sup1.getText() + "\n ---------------------------------------");
                }

                List<WebElement> vostokKuhnya = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[5]"));
                for (WebElement vostok : vostokKuhnya) {
                    System.out.println("ВОСТОЧНАЯ КУХНЯ\n" + vostok.getText() + "\n ---------------------------------------");
                }

                List<WebElement> kremSup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[6]"));
                for (WebElement krSup : kremSup) {
                    System.out.println("КРЕМ СУП \n" + krSup.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> vostSup = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[7]"));
                for (WebElement vostochnyiSup : vostSup) {
                    System.out.println("ВОСТОЧНЫЙ СУП \n" + vostochnyiSup.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> goryachieSakuski = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[8]"));
                for (WebElement gorZakus : goryachieSakuski) {
                    System.out.println("ГОРЯЧИЕ ЗАКУСКИ \n" + gorZakus.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> vypechka = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[9]"));
                for (WebElement vypechka1 : vypechka) {
                    System.out.println("ВЫПЕЧКА \n" + vypechka1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> pasta = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[10]"));
                for (WebElement pasta1 : pasta) {
                    System.out.println("ПАСТА \n" + pasta1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> stake = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[11]"));
                for (WebElement stake1 : stake) {
                    System.out.println("СТЕЙК \n" + stake1.getText() + "\n ---------------------------------------\"");
                }

                List<WebElement> evropKuhnya = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[12]"));
                for (WebElement evropKuhnya1 : evropKuhnya) {
                    System.out.println("ГЩРЯЧИЕ БЛЮДА ЕВРОПЕЙСКОЙ КУХНИ \n" + evropKuhnya1.getText() + "\n ---------------------------------------\"");
                }


            }


        }System.out.println("Not found");
    }
}
