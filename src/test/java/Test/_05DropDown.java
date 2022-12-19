package Test;

import PageObject._05DropDownPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static utils.BaseClass.*;

public class _05DropDown {
    static final String url = "http://localhost:7080/dropdown";
    @Test
    void dropDown(){
        setUp(url);

        _05DropDownPage dropDownPage = new _05DropDownPage(driver);
        dropDownPage.clickDropDown();
        SoftAssert assertion = new SoftAssert();
        dropDownPage.selectOption1();
        assertion.assertTrue(dropDownPage.getText().contains("Option 1"));

        driver.navigate().refresh();

        dropDownPage.selectOption2();
        assertion.assertTrue(dropDownPage.getText().contains("Option 2"));

        assertion.assertAll();
        tearDown();
    }
}
