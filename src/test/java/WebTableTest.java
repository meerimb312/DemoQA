import com.demoqa.entities.Employee;
import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest {

    @Test(groups = {"Regression", "API", "1782"})
    @Description("Verify that WebTable form work correctly")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8880")
    public void testWebTable() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.WEBTABLES.getEndpoint());
        Employee employee = randomUtils.createMokEmployee();

        // Добавление первого сотрудника
        Employee employee1 = randomUtils.createMokEmployee();
        demoQAPages.getWebTablePage().addNewEmployee(employee1);

        // Получение и вывод списка сотрудников до добавления второго сотрудника
        List<Employee> employees = demoQAPages.getWebTablePage().getEmployeesFromTable();
        System.out.println("Employees before adding second employee:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Добавление второго сотрудника с таким же email и обработка исключения
        Employee employee2 = new Employee("Test", "Test", 18, employee1.getEmail(), 5000, "IT");
        demoQAPages.getWebTablePage().addNewEmployee(employee2);
        employees = demoQAPages.getWebTablePage().getEmployeesFromTable();
        System.out.println("Employees after adding second employee:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Удаление сотрудника по email
        demoQAPages.getWebTablePage().deleteEmployeeByEmail("kierra@example.com");

        // Редактирование сотрудника
        demoQAPages.getWebTablePage().editEmployee(employee1.getFirstname(), employee1.getLastname(), employee1.getAge(),
                employee1.getEmail(), employee1.getSalary(), employee1.getDepartment(),
                "Test2", "Test2", 18, "test@mail.com", 5000, "IT");

        // Повторное получение и вывод списка сотрудников
        employees = demoQAPages.getWebTablePage().getEmployeesFromTable();
        System.out.println("Employees after deletion:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}


//    @Test(description = "verify updates")
//    public void editValuesTest() {
//        driver.get("https://demoqa.com/webtables");
//        List<Employee> employees = demoQAPages.getWebTablePage().editEmployeeData("cierra@example.com", "firstName", "Test");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//
//    }
//@Test
//    public void test1(){
//    driver.get("https://demoqa.com/webtables");
//    List<Employee> employees = demoQAPages.getWebTablePage().getEmployeesFromTable();
//             demoQAPages.getWebTablePage().editEmployee("Cierra", "Vega", new Employee("Sara","Sara",40,"sara@gmail.com",1000,"architeckt"));
//        for (Employee employee1 : employees) {
//            System.out.println(employee1);
//        }
//}



