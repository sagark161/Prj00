package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static WebDriver driver = null;

    // Factory method to get the WebDriver instance based on the browser type
    private static WebDriver getDriver(String browserType) {
        //WebDriver driver = null;

        switch (browserType) {
            case "CHROME":
                driver = new ChromeDriver();
                break;

            case "FIREFOX":
                driver = new FirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }

        // Additional configurations (optional)
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver launchApp(String browserType, String url) {
        driver = BrowserFactory.getDriver(browserType);
        driver.get(url);
        return driver;
    }

}
