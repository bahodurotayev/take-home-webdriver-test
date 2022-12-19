package Test;

import PageObject._16NotificationPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static utils.BaseClass.*;

public class _16Notification {
    static final String url = "http://localhost:7080/notification_message_rendered";

    @Test
    void testNotification(){
        setUp(url);

        _16NotificationPage notificationPage = new _16NotificationPage(driver);
        notificationPage.clickLink();
        Assert.assertTrue(notificationPage.notificationMessage2());
        tearDown();
    }
}
