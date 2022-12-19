package Test;
import PageObject._06DynamicContentPage;
import org.junit.Assert;
import org.testng.annotations.Test;

import static utils.BaseClass.*;
public class _06DynamicContent {
    static final String url = "http://localhost:7080/dynamic_content";

    @Test
    void dynamicContent(){
        setUp(url);

        _06DynamicContentPage dynamicContentPage = new _06DynamicContentPage(driver);

        String text1 = dynamicContentPage.getText();
        System.out.println("text1 = " + text1);

        driver.navigate().refresh();

        String text2 = dynamicContentPage.getText();
        System.out.println("text2 = " + text2);

        Assert.assertNotEquals(text1, text2);

        tearDown();
    }
}
