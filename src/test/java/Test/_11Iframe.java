package Test;
import PageObject._11IframePage;
import org.junit.Assert;
import org.testng.annotations.Test;

import static utils.BaseClass.*;

public class _11Iframe {

    static final String url ="http://localhost:7080/iframe";
    String text = "Iframe test";
    @Test
    void iFrame(){
        setUp(url);
        _11IframePage iframePage = new _11IframePage(driver);
        driver.switchTo().frame("mce_0_ifr");
        iframePage.textBoxContent.clear();
        iframePage.setTextBoxContent(text);
        Assert.assertEquals(iframePage.getText(), text);
        tearDown();
    }

}
