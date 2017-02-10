package Sanity;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GooglePageTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
    }

    @Test
    public void readPageTitleTest() {

        String expected = "Google";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
