package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;

public class RandomUtils {

    Faker faker = new Faker();

    @Step("Generate random person data")
    public TextBoxEntity generateRandomTextBoxEntity() {

        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    @Step("Generate random person data for practice form")
    public PracticeFormEntity generateRandomPracticeFormEntity() {

        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setEmail(faker.internet().emailAddress());
        practiceFormEntity.setGender(faker.demographic().sex());
        practiceFormEntity.setMobileNumber(faker.phoneNumber().subscriberNumber(10));
        practiceFormEntity.setDateOfBirth(String.valueOf(faker.date().birthday()));
//        practiceFormEntity.setSubjects(faker.educator().course());
        practiceFormEntity.setSubjects("Computer Science");
        practiceFormEntity.setHobbies(faker.name().name());
//        practiceFormEntity.setUpLoadPicture("src/main/resources/pictures");
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
        practiceFormEntity.setState(faker.address().state());
        practiceFormEntity.setCity(faker.address().city());
//        practiceFormEntity.setState("NCR");
//        practiceFormEntity.setCity("Delhi");
        return practiceFormEntity;

    }

    @Step("Create random mock Employee data")
    public Employee createMokEmployee() {

        Employee employee = new Employee();
        employee.setFirstname(faker.name().firstName());
        employee.setLastname(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18, 100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(1000000, 20000000L));
        employee.setDepartment(faker.job().position());
        return employee;
    }
}
