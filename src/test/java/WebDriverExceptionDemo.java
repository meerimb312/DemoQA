import com.demoqa.drivers.DriverManager;
import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

public class WebDriverExceptionDemo {

    WebDriver driver = DriverManager.getDriver();

    @Test
    public void test1() {
        driver.get("https://demoqa.com/webtables");
        SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
        System.out.println("Session id is: "+sessionId);

        driver.close();
        driver.quit();
        System.out.println("After quit session ID is: "+sessionId);
//        driver.get("https://demoqa.com/webtables");
    }

}
