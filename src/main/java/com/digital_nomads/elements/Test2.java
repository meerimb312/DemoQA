package com.digital_nomads.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Test2 extends SetUp {



    @Test
    public void openLinks() {
        WebElement linkOnPageOfRestaurants = driver.findElement(By.xpath("//span[text()='Eды']"));
        linkOnPageOfRestaurants.click();

        List<WebElement> listOfRestaurants = driver.findElements(By.xpath("//div[(@class ='col-sm-6')]/div/div/p[1]"));

        WebElement textRestaurant = driver.findElement(By.xpath("//h2[normalize-space(text())='Все заведения']"));
        System.out.println(textRestaurant.getText());

        listOfRestaurants.stream()
                .filter(restaurant -> restaurant.getText().equalsIgnoreCase("Ресторан Пишпек"))
                .findFirst()
                .ifPresent(WebElement::click);
        System.out.println("Total Number of Restaurants: " + listOfRestaurants.size());
    }

//    @Test
//    void restaurantPishpekBreakfastMenu() {
//        WebElement breakfast = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_0']"));
//        breakfast.click();
//        WebElement brakfastHeader = driver.findElement(By.xpath("//h2[a[@name='menu_0']]"));
//        System.out.println("\n" + brakfastHeader.getText());
//        WebElement sectionBreakfast = brakfastHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> breakfastList = sectionBreakfast.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        breakfastList.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekColdSnackMenu() {
//        WebElement coldSnacksFast = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_1']"));
//        coldSnacksFast.click();
//        WebElement coldSnacksHeader = driver.findElement(By.xpath("//h2[a[@name='menu_1']]"));
//        System.out.println("\n" + coldSnacksHeader.getText());
//        WebElement productColdSnacks = coldSnacksHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuColdSnacks = productColdSnacks.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuColdSnacks.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekSaladsMenu() {
//        WebElement salads = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_2']"));
//        salads.click();
//        WebElement saladsHeader = driver.findElement(By.xpath("//h2[a[@name='menu_2']]"));
//        System.out.println("\n" + saladsHeader.getText());
//        WebElement productSalads = saladsHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuSalads = productSalads.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuSalads.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekSoupsMenu() {
//        WebElement soups = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_3']"));
//        soups.click();
//        WebElement soupsHeader = driver.findElement(By.xpath("//h2[a[@name='menu_3']]"));
//        System.out.println("\n" + soupsHeader.getText());
//        WebElement productSoups = soupsHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuSoups = productSoups.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuSoups.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekOrientalDishesMenu() {
//        WebElement orientalDishes = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_4']"));
//        orientalDishes.click();
//        WebElement orientalDishesHeader = driver.findElement(By.xpath("//h2[a[@name='menu_4']]"));
//        System.out.println("\n" + orientalDishesHeader.getText());
//        WebElement productOrientalDishes = orientalDishesHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuOrientalDishes = productOrientalDishes.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuOrientalDishes.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void restaurantPishpekCreamSoupsMenu() {
//        WebElement creamSoups = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_5']"));
//        creamSoups.click();
//        WebElement creamSoupsHeader = driver.findElement(By.xpath("//h2[a[@name='menu_5']]"));
//        System.out.println("\n" + creamSoupsHeader.getText());
//        WebElement productCreamSoups = creamSoupsHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuCreamSoups = productCreamSoups.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuCreamSoups.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void restaurantPishpekOrientalSoupsMenu() {
//
//        WebElement orientalSoups = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_6']"));
//        orientalSoups.click();
//        WebElement orientalSoupsHeader = driver.findElement(By.xpath("//h2[a[@name='menu_6']]"));
//        System.out.println("\n" + orientalSoupsHeader.getText());
//        WebElement productOrientalSoups = orientalSoupsHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuOrientalSoups = productOrientalSoups.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuOrientalSoups.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekAppetizersMenu() {
//        WebElement hotAppetizers = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_7']"));
//        hotAppetizers.click();
//        WebElement hotAppetizersHeader = driver.findElement(By.xpath("//h2[a[@name='menu_7']]"));
//        System.out.println("\n" + hotAppetizersHeader.getText());
//        WebElement productHotAppetizers = hotAppetizersHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuHotAppetizers = productHotAppetizers.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuHotAppetizers.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//
//    }
//
//    @Test
//    void restaurantPishpekBakeryMenu() {
//        WebElement bakery = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_8']"));
//        bakery.click();
//        WebElement bakeryHeader = driver.findElement(By.xpath("//h2[a[@name='menu_8']]"));
//        System.out.println("\n" + bakeryHeader.getText());
//        WebElement productBakery = bakeryHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuBakery = productBakery.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuBakery.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void restaurantPishpekPstaMenu() {
//
//        WebElement pasta = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_9']"));
//        pasta.click();
//        WebElement pastaHeader = driver.findElement(By.xpath("//h2[a[@name='menu_9']]"));
//        System.out.println("\n" + pastaHeader.getText());
//        WebElement productPasta = pastaHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuPasta = productPasta.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuPasta.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void restaurantPishpekSteaksMenu() {
//        WebElement steaks = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_10']"));
//        steaks.click();
//        WebElement steaksHeader = driver.findElement(By.xpath("//h2[a[@name='menu_10']]"));
//        System.out.println("\n" + steaksHeader.getText());
//        WebElement productSteaks = steaksHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuSteaks = productSteaks.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuSteaks.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void restaurantPishpekHotEuropeanDishesMenu() {
//
//        WebElement hotEuropeanDishes = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/restoran-pishpek#menu_11']"));
//        hotEuropeanDishes.click();
//        WebElement hotEuropeanDishesHeader = driver.findElement(By.xpath("//h2[a[@name='menu_11']]"));
//        System.out.println("\n" + hotEuropeanDishesHeader.getText());
//        WebElement productHotEuropeanDishes = hotEuropeanDishesHeader.findElement(By.xpath("./following-sibling::div[contains(@class, 'product')]"));
//        List<WebElement> menuHotEuropeanDishes = productHotEuropeanDishes.findElements(By.xpath(".//div[@class='food-title']/p[@class='product-name']"));
//        menuHotEuropeanDishes.stream()
//                .map(WebElement::getText)
//                .forEach(System.out::println);
    }



