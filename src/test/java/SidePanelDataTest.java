import com.demoqa.data.SideMenuData;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.drivers.DriverManager.getDriver;

public class SidePanelDataTest extends BaseTest {

    @Test(description = "TC-01 Open Login Base URL", groups = {"Smoke", "Regression"})
    @Story("LoginPage")
    @Severity(SeverityLevel.BLOCKER)
    @Description("To verify that the login URL and title of the application are correct and as expected.")
    @Link(SideMenuData.LOGIN_URL)
    public void testLoginBaseUrl() {

        Allure.step("Open LoginURL and SignIn");
        getDriver().get(SideMenuData.LOGIN_URL);
        sidePanelPage.signIn(SideMenuData.userName, SideMenuData.PASSWORD);
    }

    @Test(
            groups = {"Smoke", "Regression"},
            description = "TC-02 Side Menu Navigation",
            dataProvider = "sideMenuData",
            dataProviderClass = SideMenuData.class)
    @Story("SideNavigation")
    @Severity(SeverityLevel.CRITICAL)
    @Description("To verify that the side menu navigation on the website functions correctly by ensuring that " +
            "clicking on menu items directs the user to the expected URL with the expected title.")
    @Link(SideMenuData.ORANGE_BASE_URL)
    public void testNavigationMenu(String ORANGE_BASE_URL, By sideMenuData, String expectedUrl, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(ORANGE_BASE_URL);

        Allure.step("Click on " + sideMenuData.toString());
        getDriver().findElement(sideMenuData).click();

        Allure.step("Collect actualURL, actualTitle");
        final String actualUrl = getDriver().getCurrentUrl();
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualUrl, expectedUrl);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
