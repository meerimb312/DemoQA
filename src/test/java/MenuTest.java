import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @Test(description = "Verify move to element methods is working")
    public void moveToElementTest() throws InterruptedException {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.MENU.getEndpoint());
        webElementActions.moveToElement(demoQAPages.getMenuPage().mainItem2);

    }
}
