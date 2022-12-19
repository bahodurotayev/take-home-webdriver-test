package Test;

import PageObject._04DragAndDropPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static utils.BaseClass.*;

public class _04DragAndDrop  {
    static final String ulr = "http://localhost:7080/drag_and_drop";
    @Test
    void dragAndDrop() throws InterruptedException {
        setUp(ulr);

        Thread.sleep(3000);

        _04DragAndDropPage dragAndDropPage = new _04DragAndDropPage(driver);

        dragAndDropSwapColumn();

        SoftAssert assertion = new SoftAssert();

        assertion.assertTrue(dragAndDropPage.getHeaderA().toLowerCase().equals("b") && dragAndDropPage.getHeaderB().toLowerCase().equals("a") );

        assertion.assertAll();


        //tearDown();
    }
    private void dragAndDrop(WebElement from, WebElement to) {
        final String java_script =
                "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
                        "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
                        "ction(format,data){this.items[format]=data;this.types.append(for" +
                        "mat);},getData:function(format){return this.items[format];},clea" +
                        "rData:function(format){}};var emit=function(event,target){var ev" +
                        "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
                        "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
                        "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
                        "'drop',tgt);emit('dragend',src);";

        ((JavascriptExecutor)driver).executeScript(java_script, from, to);
    }
    public void dragAndDropSwapColumn() {
        WebElement columnABox = driver.findElement(By.id("column-a"));
        WebElement columnBBox = driver.findElement(By.id("column-b"));
        dragAndDrop(columnABox, columnBBox);
    }
}
