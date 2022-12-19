package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class BaseClass {
    public static WebDriver driver;


    public static void setUp(String url){
        ConfigReader.loadProperties(Constant.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getProperties("chrome").toLowerCase()){
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.verboseLogging", Constant.EDGE_DRIVER_PATH);
                driver = new EdgeDriver();
            }
        }
        driver.get(url);


    }

    public static void tearDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        if (driver != null){
            driver.quit();
        }
    }
}
