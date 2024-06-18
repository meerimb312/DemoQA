import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.demoqa.listener.ScreenshotListener.class)

public class ButtonsTest extends BaseTest {

    @Test(groups = {"Smoke", "UI", "1771"}, description = "Verify double click button is working property")
    @Description("Verify that double click button is present")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Button")
    public void doubleClickTest() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.BUTTONS.getEndpoint());
        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);

        Assert.assertEquals(demoQAPages.getButtonsPage().doubleClickBtnMessage.getText(), "You have done a double click");
    }


    @Test(groups = {"Regression", "API", "1772"}, description = "Verify right click button is working property")
    @Description("Verify that right click button is present")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Button")
    public void rightClickTest() {
        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.BUTTONS.getEndpoint());
        webElementActions.rightClick(demoQAPages.getButtonsPage().rightClickBtn);

        Assert.assertEquals(demoQAPages.getButtonsPage().rightClickBtnMessage.getText(), "You have done a right click");
    }

    @Test(groups = {"E2E", "SQL", "1773"}, description = "Verify click me button is working property")
    @Description("Verify that clickme button is present")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Button")
    public void dynamicClickTest() {
        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.BUTTONS.getEndpoint());
        webElementActions.click(demoQAPages.getButtonsPage().clickme);

        Assert.assertEquals(demoQAPages.getButtonsPage().dynamicClickMessage.getText(), "You have done a dynamic click");
    }
}
