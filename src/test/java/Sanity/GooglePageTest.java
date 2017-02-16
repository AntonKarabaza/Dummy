package Sanity;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobject.GooglePage;
import tools.WebDriverInstansiator;

public class GooglePageTest extends BaseTest {

    private GooglePage googlePage;

    @BeforeClass
    public void setUp() {
        googlePage = new GooglePage(WebDriverInstansiator.getWebDriver());
        googlePage.open();
    }

    @Test
    public void readPageTitleTest() {

        String expected = "Google1";
        String actual = googlePage.readHeader();
        Assert.assertEquals(actual, expected);
    }
}
