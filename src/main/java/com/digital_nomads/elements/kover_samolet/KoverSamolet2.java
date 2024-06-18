package com.digital_nomads.elements.kover_samolet;

import com.digital_nomads.elements.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class KoverSamolet2 extends SetUp {

    private static final String KOVER_SAMOLET_URL = "https://dostavka312.kg/";

    @Test
    public void testMenu() {

        driver.get(KOVER_SAMOLET_URL);

        WebElement foods = driver.findElement(By.xpath("//span[text()='Eды']"));
        foods.click();

//      List<WebElement> foodList = driver.findElements(By.xpath("//div[@class='col-sm-6']/following-sibling::div[1]"));  //171
        List<WebElement> foodList = driver.findElements(By.xpath("//div[@class='col-sm-6']"));              //172

        for (WebElement food : foodList) {
            System.out.println(food.getText() + "\n");

        }
        System.out.println("Всего :" + foodList.size());

        for (WebElement food : foodList) {
            if (food.getText().equals("Пишпек")) {
                WebElement pishpek = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek']"));
                pishpek.click();
            }
        }

        System.out.println("\n***** Завтраки ********\n");

        WebElement pishpek = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek']"));
        pishpek.click();

        List<WebElement> breakfastList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[1]"));
        for (WebElement menu : breakfastList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Холодные закуски ********\n");

        List<WebElement> coldApptList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[2]"));
        for (WebElement menu : coldApptList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Салаты ********\n");

        List<WebElement> saladsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[3]"));
        for (WebElement menu : saladsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Супы ********\n");

        List<WebElement> soupsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[4]"));
        for (WebElement menu : soupsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Горячие блюда восточной кухни ********\n");

        List<WebElement> hotDishList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[5]"));
        for (WebElement menu : hotDishList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Крем супы ********\n");

        List<WebElement> creamSoupsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[6]"));
        for (WebElement menu : creamSoupsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Восточные супы ********\n");

        List<WebElement> orientalSoupsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[7]"));
        for (WebElement menu : orientalSoupsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Горячие закуски ********\n");

        List<WebElement> hotApptList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[8]"));
        for (WebElement menu : hotApptList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Выпечка ********\n");

        List<WebElement> pastriesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[9]"));
        for (WebElement menu : pastriesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Паста ********\n");

        List<WebElement> pastasList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[10]"));
        for (WebElement menu : pastasList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Стейки ********\n");

        List<WebElement> stakesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[11]"));
        for (WebElement menu : stakesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Горячие блюда европейской кухни ********\n");

        List<WebElement> hotEurDishesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[12]"));
        for (WebElement menu : hotEurDishesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Блюда из рыбы ********\n");

        List<WebElement> fishDishesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[13]"));
        for (WebElement menu : fishDishesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Шашлыки ********\n");

        List<WebElement> barbekuList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[14]"));
        for (WebElement menu : barbekuList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Блюда на компанию ********\n");

        List<WebElement> companyMealsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[15]"));
        for (WebElement menu : companyMealsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Гарниры ********\n");

        List<WebElement> garnishesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[16]"));
        for (WebElement menu : garnishesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Соусы ********\n");

        List<WebElement> sausesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[17]"));
        for (WebElement menu : sausesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Пицца ********\n");

        List<WebElement> pizzaList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[18]"));
        for (WebElement menu : pizzaList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Десерты ********\n");

        List<WebElement> dessertsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[19]"));
        for (WebElement menu : dessertsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Роллы ********\n");

        List<WebElement> rollsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[20]"));
        for (WebElement menu : rollsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Горячие роллы ********\n");

        List<WebElement> hotRollsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[21]"));
        for (WebElement menu : hotRollsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Классические роллы ********\n");

        List<WebElement> classicRollsList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[22]"));
        for (WebElement menu : classicRollsList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Ассорти из ролл ********\n");

        List<WebElement> rollAssortList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[23]"));
        for (WebElement menu : rollAssortList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Лимонады ********\n");

        List<WebElement> lemonadesList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[24]"));
        for (WebElement menu : lemonadesList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** Прохладительные напитки ********\n");

        List<WebElement> softDrinksList = driver.findElements(By.xpath("//*[@id='WWMainPage']/div[25]"));
        for (WebElement menu : softDrinksList) {
            System.out.println(menu.getText());
        }

        System.out.println("\n***** All menu ********\n");

        List<WebElement> allMenuList = driver.findElements(By.xpath("(//div[@id='WWMainPage'])[1]"));
        for (WebElement menu : allMenuList) {
            System.out.println(menu.getText());
        }
    }

}
