package Test;
import PageObject._02CheckBoxPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static utils.BaseClass.*;

public class _02CheckBox {
    static final String url = "http://localhost:7080/checkboxes";
    @Test
    void checkBox(){
        setUp(url);
        SoftAssert assertion = new SoftAssert();
        _02CheckBoxPage checkBoxPage = new _02CheckBoxPage(driver);

        boolean isSelected = checkBoxPage.chkbox1.isSelected();
        System.out.println("CheckBox 1 is Selected = " + isSelected);
        assertion.assertTrue(isSelected);

        boolean isSelected2 = checkBoxPage.chkbox2.isSelected();
        System.out.println("CheckBox 2 is Selected = " + isSelected2);
        assertion.assertFalse(isSelected2);
        assertion.assertAll();
        tearDown();

    }
}
