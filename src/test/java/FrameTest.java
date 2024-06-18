import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.demoqa.listener.ScreenshotListener.class)

public class FrameTest extends BaseTest {

    @Test(description = "Verify that driver switch to another frame")
    public void iFrameTest() {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
