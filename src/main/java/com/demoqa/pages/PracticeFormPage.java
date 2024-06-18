package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.PracticeFormEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class PracticeFormPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement genderMaleBtn;

    @FindBy(xpath = "//label[normalize-space(text())='Female']")
    public WebElement genderFemaleBtn;

    @FindBy(xpath = "//label[text()='Other']")
    public WebElement genderOtherBtn;

    @FindBy(id = "userNumber")
    public WebElement mobileNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(xpath = "//label[text()='Sports']")
    public WebElement hobbiesSportsBtn;

    @FindBy(xpath = "//label[text()='Reading']")
    public WebElement hobbiesReadingBtn;

    @FindBy(xpath = "//label[text()='Music']")
    public WebElement hobbiesMusicBtn;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPictureBtn;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "react-select-3-input")
    public WebElement selectStateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement selectCityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerBtn;

    @Step("Select DATE, MONTH AND YEAR {0}")
    public PracticeFormPage selectDateMonthYear(String dateMonthYear) {
        String[] dateMonthYearParts = dateMonthYear.split(" ");
        String date = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year = dateMonthYearParts[2];

        webElementActions.click(datePickerBtn);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));

        dropDownHelper.selectByVisibleText(monthDropDown, month)
                .selectByVisibleText(yearDropDown, year);

        //div[contains(@class,'react-datepicker__day') and not (contains(@class,'react-datepicker__day--outside-month')) and text()='1']
        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class,'react-datepicker__day') and not (contains(@class,'react-datepicker__day--outside-month')) and text()='" + date + "']")
        ));
        webElementActions.click(day);
        return this;

    }

    public final Random random = new Random();
    public final List<WebElement> hobbiesOptions = List.of(hobbiesSportsBtn, hobbiesReadingBtn, hobbiesMusicBtn);
    public final List<WebElement> genderOptions = List.of(genderMaleBtn, genderFemaleBtn, genderOtherBtn);

    WebElement randomGender = genderOptions.get(random.nextInt(genderOptions.size()));
    WebElement randomHobbies = hobbiesOptions.get(random.nextInt(hobbiesOptions.size()));

    private final Map<String, List<String>> stateCityMap = new HashMap<>() {{
        put("NCR", List.of("Delhi", "Gurgaon", "Noida"));
        put("Uttar Pradesh", List.of("Agra", "Lucknow", "Merrut"));
        put("Haryana", List.of("Karnal", "Panipat"));
        put("Rajasthan", List.of("Jaipur", "Jaiselmer"));
    }};

    @Step("Select random state and city")
    private void selectRandomStateAndCity() {
        // Выбор случайного штата
        List<String> states = stateCityMap.keySet().stream().collect(Collectors.toList());
        String randomState = states.get(random.nextInt(states.size()));
        selectStateInput.sendKeys(randomState);
        selectStateInput.sendKeys(Keys.ENTER);

        // Выбор случайного города
        List<String> cities = stateCityMap.get(randomState);
        String randomCity = cities.get(random.nextInt(cities.size()));
        selectCityInput.sendKeys(randomCity);
        selectCityInput.sendKeys(Keys.ENTER);
    }

    @Step("Fill up practice form")
    public PracticeFormPage fillUpPracticeForm(PracticeFormEntity practiceFormEntity) {

        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getEmail())
                .click(randomGender)
                .sendKeys(mobileNumberInput, practiceFormEntity.getMobileNumber());
//                .sendKeysWitEnter(dateOfBirthInput, practiceFormEntity.getDateOfBirth())
        selectDateMonthYear("30 June 2020");
        webElementActions.sendKeysWitEnter(subjectsInput, practiceFormEntity.getSubjects())
                .scrollToElement(randomHobbies)
                .click(randomHobbies)
//                .sendKeys(uploadPictureBtn, practiceFormEntity.getUpLoadPicture())
                .sendKeysWitEnter(currentAddressInput, practiceFormEntity.getCurrentAddress());
        selectRandomStateAndCity();
        webElementActions.click(submitBtn);
        return this;

    }


//    public PracticFormPage fillPracticForm(PracticFormEntity practicFormEntity) {
//        webElementActions.sendKeys(firstNameInput, practicFormEntity.getFirstNameInput())
//                .sendKeys(lastNameInput, practicFormEntity.getLastNameInput())
//                .sendKeys(emailInput, practicFormEntity.getEmailInput())
//                .jsClick(webElementActions.randomElementSelection("//input[@name ='gender']"))
//                .sendKeys(mobileNumberInput, practicFormEntity.getMobileNumberInput())
//                .sendKeysWithEnter(subjectsContainerInput, practicFormEntity.getSubjectsContainerInput())
//                .clickRandomElements("//input[@type='checkbox']");
//        webElementActions.sendKeys(uploadPicture, practicFormEntity.getPicturePath())
//                .sendKeys(currentAddressInput, practicFormEntity.getCurrentAddressInput())
//                .sendKeysWithEnter(stateInput, webElementActions.randomElementSelection("(//div[@class=' css-1hwfws3'])[1]", "//div[contains(@class,'menu')]//div[contains(@class,'option')]"))
//                .sendKeysWithEnter(cityInput, webElementActions.randomElementSelection("(//div[@class=' css-1hwfws3'])[2]", "//div[contains(@class,'menu')]//div[contains(@class,'option')]"))
//                .click(submitBtn);
//        return this;
//    }
}

