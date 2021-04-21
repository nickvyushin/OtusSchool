import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lesson3 {

    private Logger logger = LogManager.getLogger(Lesson3.class);
    protected static WebDriver driver;

    @Before
    public void StartUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Driver up");
    }

    @After
    public void EndTest() {
        if (driver!=null)
            driver.quit();
        logger.info("Browser closed");
    }

    @Test
    public void LogExample() {
        logger.info("Start test");
    }

    @Test
    public void WebDriverTest() {
        driver.get("https://otus.ru");
        logger.info("Site is opened");
    }
}
