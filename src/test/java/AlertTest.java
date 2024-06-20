import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test(groups = {"Smoke", "UI", "1721"}, description = "Alert test")
    @Description("Verify that alert is present")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("GCPINT-8878")
    void alertTest() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.ALERT.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();
        webElementActions.pause(5);

    }
}
