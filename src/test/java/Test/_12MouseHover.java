package Test;

import PageObject._12MouseHoverPage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static utils.BaseClass.*;

public class _12MouseHover {
    static final String url = "http://localhost:7080/hovers";

    @Test
    void mouseHover(){
        setUp(url);

        _12MouseHoverPage mouseHoverPage = new _12MouseHoverPage(driver);

        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverPage.img1).build().perform();
        Assert.assertTrue(mouseHoverPage.caption1.isDisplayed());

        actions.moveToElement(mouseHoverPage.img2).build().perform();
        Assert.assertTrue(mouseHoverPage.caption2.isDisplayed());

        actions.moveToElement(mouseHoverPage.img3).build().perform();
        Assert.assertTrue(mouseHoverPage.caption3.isDisplayed());

        tearDown();
    }
}
