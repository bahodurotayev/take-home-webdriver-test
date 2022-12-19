package utils;

import java.io.File;

public class Constant {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/driver/chromedriver.exe";
    public static final String EDGE_DRIVER_PATH = System.getProperty("user.dir") + "/driver/msedgedriver.exe";
    public static final String FILE_DOWNLOAD = System.getProperty("user.dir") + File.separator + "/download";
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/config/configuration.properties";
}
