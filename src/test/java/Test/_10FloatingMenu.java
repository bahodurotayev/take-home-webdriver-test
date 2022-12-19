package Test;
import PageObject._10FloatingMenuPage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static utils.BaseClass.*;
public class _10FloatingMenu {
    static final String url = "http://localhost:7080/floating_menu";
    @Test
    void floatingMenu(){
        setUp(url);
        _10FloatingMenuPage floatingMenuPage = new _10FloatingMenuPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Assert.assertTrue(floatingMenuPage.isDisplayed());

        tearDown();
    }
}
