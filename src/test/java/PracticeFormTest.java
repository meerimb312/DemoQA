import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.enums.EndPoints;
import com.demoqa.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void practiceFormTest() throws InterruptedException {

        browserHelper.open(ConfigReader.getValue("baseURL") + EndPoints.PRACTICE_FORM.getEndpoint());

        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillUpPracticeForm(practiceFormEntity);
        Thread.sleep(5000);
        Assert.assertTrue(true);
    }
}
