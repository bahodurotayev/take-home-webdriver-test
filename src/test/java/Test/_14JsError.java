package Test;
import PageObject._14JsErrorPage;
import org.junit.Assert;
import org.testng.annotations.Test;

import static utils.BaseClass.*;

public class _14JsError {
    static final String url = "http://localhost:7080/javascript_error";

    @Test
    void testJsError(){
        setUp(url);

        _14JsErrorPage jsErrorPage = new _14JsErrorPage(driver);
        Assert.assertTrue(jsErrorPage.getTextError().contains("This page has a JavaScript error in the onload event."));
        tearDown();
    }
}
