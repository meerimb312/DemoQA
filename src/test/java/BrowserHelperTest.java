import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest {

    @Test
    void test1() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.BROWSERHELPER.getEndpoint());

        //driver navigation
//        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//        Thread.sleep(1000);
//        browserHelper.goBack();
//        Thread.sleep(1000);
//        browserHelper.goForward();
//        Thread.sleep(1000);
//        browserHelper.refreshThePage();

        //browser tabs manipulation

        driver.findElement(By.id("tabButton")).click();

        browserHelper.switchToWindow(0);

        driver.findElement(By.id("tabButton")).click();

        browserHelper.switchToWindow(0);

        driver.findElement(By.id("tabButton")).click();

        browserHelper.switchToWindow(0);
        driver.findElement(By.id("tabButton")).click();

        browserHelper.switchToWindow(1);//считаем слева направо

        browserHelper.switchToParentWindow();

    }
}
