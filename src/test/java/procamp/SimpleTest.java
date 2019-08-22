package procamp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    private WebDriver driver;

    @Before
    public void startBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void stopBrowser()
    {
        driver.quit();
    }

    @Test
    public void test()
    {
        driver.get("https://www.seleniumhq.org/");
    }
}