import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.demoqa.listener.ScreenshotListener.class)

public class FrameTest extends BaseTest {

    @Test(groups = {"Regression", "API", "1772"})
    @Description("Verify that driver switch to another frame")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.MINOR)
    @Story("GCPINT-8879")
    public void iFrameTest() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
