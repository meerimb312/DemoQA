import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {

    @Test(groups = {"Regression", "API", "1775"})
    @Description("Verify ariaValueNow is stopped at value = 52")
    @Owner("MeerimB")
    @Tag("Smoke")
    @Severity(SeverityLevel.NORMAL)
    @Story("GCPINT-8877")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.PROGRESSBAR.getEndpoint());
        webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn);

        String valueNow; // Создаем переменную для хранения текущего значения aria-valuenow
        while (true) { // Начало бесконечного цикла, пока не прервется с помощью break
            valueNow = demoQAPages.getProgressBarPage().aria_valuenow.getAttribute("aria-valuenow"); // Извлечение текущего значения aria-valuenow
            if (valueNow.equals("52")) { // Проверка
                webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn); // Остановка процесса в связи с выполнением условия выше
                break;
            }
        }
        Assert.assertEquals(valueNow, "52"); // Сравнение полученного значения с ожидаемым

    }

}
