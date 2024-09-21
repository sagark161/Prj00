import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class BaseTest {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/param.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("browser"));
        driver = BrowserFactory.launchApp(prop.getProperty("browserType"), prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
