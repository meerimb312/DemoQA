package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WebTablePage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;

    @FindBy(id = "firstName")
    public WebElement firstnameInput;

    @FindBy(id = "lastName")
    public WebElement lastnameInput;

    @FindBy(id = "age")
    public WebElement ageInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "salary")
    public WebElement salaryInput;

    @FindBy(id = "department")
    public WebElement departmentInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "delete-record-1")
    public WebElement deleteRecord;

    @FindBy(id = "edit-record-1")
    public WebElement editRecord;

    //div[@class='action-buttons']//span[@title='Edit']

    @Step("Check person by e-mail and add person if e-mail doesn't exist")
    public ArrayList<WebElement> email() {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.id("userEmail"));
        ArrayList<WebElement> email = new ArrayList<>();
        for (int i = 0; i < rows.size() - 1; i++) {
            for (int j = i + 1; j < rows.size(); j++) {
                if (rows.get(i).equals(rows.get(j))) {
                    email.add(rows.get(i));

                }
            }
        }
        return email;
    }

    // Метод для добавления нового сотрудника
    @Step("Add new employee{0}")
    public WebTablePage addNewEmployee(Employee employee) {
        webElementActions.click(addNewBtn)
                .sendKeys(firstnameInput, employee.getFirstname())
                .sendKeys(lastnameInput, employee.getLastname())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(emailInput, employee.getEmail())
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);

        return this;
    }

    // Метод для получения списка сотрудников из таблицы и проверки на дубликаты email
    @Step("Get all employees from table")
    public ArrayList<Employee> getEmployeesFromTable() {
        try {
            List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
            ArrayList<Employee> employees = new ArrayList<>();
            HashSet<String> emailSet = new HashSet<>();

            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
                if (cells.size() < 6) {
                    continue;
                }

                String firstName = cells.get(0).getText();
                String lastName = cells.get(1).getText();
                String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
                String email = cells.get(3).getText();
                String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
                String department = cells.get(5).getText();

                if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty()
                        || salaryText.isEmpty() || department.isEmpty()) {
                    continue;
                }

                int age = Integer.parseInt(ageText.trim());
                long salary = Long.parseLong(salaryText.trim());

                Employee employee = new Employee(firstName, lastName, age, email, salary, department);
                if (!emailSet.add(email)) {
                    throw new Exception("Duplicate email found: " + email);
                }

                employees.add(employee);
            }
            return employees;
        } catch (Exception e) {
            System.err.println("Error occurred while getting employees from table: " + e.getMessage());
            return new ArrayList<>(); // Возвращаем пустой список в случае ошибки
        }
    }

    // Метод для удаления сотрудника по email
    @Step("Delete employee by email {0}")
    public WebTablePage deleteEmployeeByEmail(String email) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            if (cells.size() > 3 && cells.get(3).getText().equals(email)) {
                WebElement deleteButton = row.findElement(By.cssSelector("span[id^='delete-record-']"));
                deleteButton.click();
                break;
            }
        }
        return this;
    }

    // Метод для редактирования информации о сотруднике
    @Step("Edit employee")
    public WebTablePage editEmployee(String oldFirstName, String oldLastName, int oldAge, String oldEmail, long oldSalary, String oldDepartment,
                                     String newFirstName, String newLastName, int newAge, String newEmail, long newSalary, String newDepartment) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            if (cells.size() < 6) {
                continue;
            }
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
            String department = cells.get(5).getText();

            if (firstName.equals(oldFirstName) && lastName.equals(oldLastName) && ageText.equals(String.valueOf(oldAge))
                    && email.equals(oldEmail) && salaryText.equals(String.valueOf(oldSalary)) && department.equals(oldDepartment)) {
                WebElement editButton = row.findElement(By.cssSelector("span[id^='edit-record-']"));
                editButton.click();

                // Редактирование информации о сотруднике
                firstnameInput.clear();
                firstnameInput.sendKeys(newFirstName);
                lastnameInput.clear();
                lastnameInput.sendKeys(newLastName);
                ageInput.clear();
                ageInput.sendKeys(String.valueOf(newAge));
                emailInput.clear();
                emailInput.sendKeys(newEmail);
                salaryInput.clear();
                salaryInput.sendKeys(String.valueOf(newSalary));
                departmentInput.clear();
                departmentInput.sendKeys(newDepartment);
                submitBtn.click();

                return this;
            }
        }
        return this; //сотрудник не найден
    }
}

//    public static void deleteEmployee(String firstName, String lastName) {
//        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
//            if (cells.get(0).getText().equals(firstName) && cells.get(1).getText().equals(lastName)) {
//                cells.get(cells.size() - 1).findElement(By.cssSelector(".submit")).click();
//                break;
//            }
//        }
//    }


//    public static void editEmployee(String firstName, String lastName, Employee newDetails) {
//        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.cssSelector(".rt-tr"));
//            if (cells.get(0).getText().equals(firstName) && cells.get(1).getText().equals(lastName)) {
//                // Assuming there are input fields to edit the employee details
//                cells.get(0).findElement(By.cssSelector("#firstName")).clear();
//                cells.get(0).findElement(By.cssSelector("#firstName")).sendKeys(newDetails.getFirstname());
//
//                cells.get(1).findElement(By.id("lastName")).clear();
//                cells.get(1).findElement(By.id("lastName")).sendKeys(newDetails.getLastname());
//
//                cells.get(2).findElement(By.id("age")).clear();
//                cells.get(2).findElement(By.id("age")).sendKeys(String.valueOf(newDetails.getAge()));
//
//                cells.get(3).findElement(By.id("userEmail")).clear();
//                cells.get(3).findElement(By.id("userEmail")).sendKeys(newDetails.getEmail());
//
//                cells.get(4).findElement(By.id("salary")).clear();
//                cells.get(4).findElement(By.id("salary")).sendKeys(String.valueOf(newDetails.getSalary()));
//
//                cells.get(5).findElement(By.id("department")).clear();
//                cells.get(5).findElement(By.id("department")).sendKeys(newDetails.getDepartment());
//
//                // Assuming there's a save button in the last cell
//                cells.get(cells.size() - 1).findElement(By.id(".submit")).click();
//                break;
//            }
//        }
//    }
//}

//    public void editEmployee(String firstName, String lastName, Employee newDetails) {
//        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
//            if (cells.get(0).getText().equals(firstName) && cells.get(1).getText().equals(lastName)) {
//                // Locate and clear the input fields, then send new data
//                WebElement firstNameInput = cells.get(0).findElement(By.xpath("//input[@placeholder='First Name']"));
//                WebElement lastNameInput = cells.get(1).findElement(By.id("lastName"));
//                WebElement ageInput = cells.get(2).findElement(By.id("age"));
//                WebElement emailInput = cells.get(3).findElement(By.id("userEmail"));
//                WebElement salaryInput = cells.get(4).findElement(By.id("salary"));
//                WebElement departmentInput = cells.get(5).findElement(By.id("department"));
//
//                firstNameInput.clear();
//                firstNameInput.sendKeys(newDetails.getFirstname());
//                lastNameInput.clear();
//                lastNameInput.sendKeys(newDetails.getLastname());
//                ageInput.clear();
//                ageInput.sendKeys(String.valueOf(newDetails.getAge()));
//                emailInput.clear();
//                emailInput.sendKeys(newDetails.getEmail());
//                salaryInput.clear();
//                salaryInput.sendKeys(String.valueOf(newDetails.getSalary()));
//                departmentInput.clear();
//                departmentInput.sendKeys(newDetails.getDepartment());
//
//                // Click the save button using a dynamic XPath
//                row.findElement(By.id("submit")).click();
//                break;
//            }
//        }
//    }
//}
