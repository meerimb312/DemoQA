import com.demoqa.entities.TextBoxEntity;
import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.demoqa.listener.ScreenshotListener.class)

public class TextBoxTest extends BaseTest {

    @Test(groups = {"Regression", "API", "1772"})
    @Description("Verify that TextBox form work correctly")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8880")
    public void textBoxTest() throws InterruptedException {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.TEXTBOX.getEndpoint());

        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
        demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
        Thread.sleep(3000);

        Assert.assertTrue(true);
    }
}
