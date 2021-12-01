package testcases.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {
            String browser=ConfigFileReader.get("browserName");

            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = WebDriverManager.chromedriver().remoteAddress("http://localhost:4444/wd/hub").create();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= WebDriverManager.firefoxdriver().remoteAddress("http://localhost:4444/wd/hub").create();
                    break;
            }
        }
        return driver;
    }



    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
