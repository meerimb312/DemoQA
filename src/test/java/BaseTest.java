import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.*;
import com.demoqa.pages.DemoQAPages;
import com.demoqa.pages.SelectPage;
import com.demoqa.pages.SidePanelPage;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected DemoQAPages demoQAPages;
    protected DropDownHelper dropDownHelper;
    protected SelectPage selectPage;
    protected IframeHelper iframeHelper;

    protected SidePanelPage sidePanelPage;


    @BeforeClass(alwaysRun = true)
    public void setUp() {

        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        demoQAPages = new DemoQAPages();
        dropDownHelper = new DropDownHelper(driver);
        selectPage = new SelectPage();
        iframeHelper = new IframeHelper(driver);
        sidePanelPage = new SidePanelPage();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.closeDriver();
    }
}
