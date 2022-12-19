package Test;

import PageObject._03ContextMenuPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static utils.BaseClass.*;

public class _03ContextMenu {
    static final String url = "http://localhost:7080/context_menu";
    @Test
    void contextMenu(){
        setUp(url);
        _03ContextMenuPage contextMenuPage = new _03ContextMenuPage(driver);

        Actions act = new Actions(driver);
        act.contextClick(contextMenuPage.boxContext).build().perform();

        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText().contains("You selected a context menu"), true);



        tearDown();
    }
}
