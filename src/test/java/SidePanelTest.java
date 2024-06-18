
import com.demoqa.enums.SidePanelMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SidePanelTest extends BaseTest {


    @Test
    public void selectCategoryTest() {
        browserHelper.open("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        // открывается окно для введения пароля и логина
//        sidePanelPage.fillUpUserPassword("Admin", "admin123");
        WebElement loginButton = driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
        loginButton.click();


        webElementActions.pause(5); // ждем 5 секунд

//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.PIM); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.LEAVE); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.TIME); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.RECRUITMENT); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.MYINFO); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.PERFORMANCE); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.DASHBOARD); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.DIRECTORY); // здесь указать нужную вкладку
//        sidePanelPage.chooseSidebarMenu(SidePanelMenu.MAINTENANCE); // здесь указать нужную вкладку
////        sidePanelPage.chooseSidebarMenu(SidePanelMenu.CLAIM); // здесь указать нужную вкладку
////        sidePanelPage.chooseSidebarMenu(SidePanelMenu.BUZZ); // здесь указать нужную вкладку
        webElementActions.pause(5);

    }
}
