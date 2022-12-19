package Test;

import PageObject._15NewTabPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import static utils.BaseClass.*;

public class _15NewTab {
    static final String url = "http://localhost:7080/windows";

    @Test
    void newOpenNewTask(){
        setUp(url);

        _15NewTabPage newTabPage = new _15NewTabPage(driver);
        newTabPage.clickLink();

        driver.getWindowHandle();

        Assert.assertTrue(newTabPage.text.isDisplayed());

        tearDown();
    }
}
