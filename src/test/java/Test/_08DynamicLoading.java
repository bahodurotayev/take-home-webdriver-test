package Test;
import PageObject._08DynamicLoadingPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static utils.BaseClass.*;
public class _08DynamicLoading {
    static final String url = "http://localhost:7080/dynamic_loading/2";
    @Test
    void dynamicLoading(){
        setUp(url);

        _08DynamicLoadingPage dynamicLoadingPage = new _08DynamicLoadingPage(driver);
        dynamicLoadingPage.clickStartButton();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(dynamicLoadingPage.getTextMessage(),"Hello World!");
        assertion.assertAll();
        tearDown();
    }
}
