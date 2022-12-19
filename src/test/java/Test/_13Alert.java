package Test;
import PageObject._13AlertPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static utils.BaseClass.*;


public class _13Alert {
    static final String url = "http://localhost:7080/javascript_alerts";

    @Test
    void testAlert() throws InterruptedException {
        setUp(url);

        _13AlertPage alertPage = new _13AlertPage(driver);

        alertPage.clickAlertButton();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        Assert.assertEquals(alertText, "I am a JS Alert");

        alertPage.clickConfirmButton();
        String confirmText = alert.getText();
        alert.accept();
        Assert.assertEquals(confirmText,"I am a JS Confirm");

        alertPage.clickPromptButton();
        alert.sendKeys("Bahodur");
        alert.accept();

        alertPage.verifyText("Bahodur");

        tearDown();
    }
}
