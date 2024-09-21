import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class SampleTest extends BaseTest {
    @Test
    void test01() {
        System.out.println(driver.getTitle());
    }
}