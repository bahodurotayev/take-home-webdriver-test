package Test;
import PageObject._07DynamicControlPage;
import org.junit.rules.Timeout;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utils.BaseClass.*;

public class _07DynamicControl {

    static final String url = "http://localhost:7080/dynamic_controls";
    @Test
    void dynamicControl(){
        setUp(url);

        _07DynamicControlPage dynamicControlPage = new _07DynamicControlPage(driver);
        dynamicControlPage.clickRemove();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(dynamicControlPage.getButtonText(), "It's gone!");

        if(dynamicControlPage.enableTextForm()){
            System.out.println("Text box is enabled");
        }else {
            System.out.println("Text box disabled");
        }

        dynamicControlPage.clickEnableButton();
        assertion.assertTrue(dynamicControlPage.textBoxIsNowEnabled());
        dynamicControlPage.clickDisableButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        assertion.assertFalse(dynamicControlPage.enableTextForm());

        tearDown();
    }
}
