import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test(groups = {"Smoke", "UI", "1721"}, description = "Alert test")
    void alertTest() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.ALERT.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();
        webElementActions.pause(5);

    }
}
