package Sanity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import tools.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {

    @Parameters("BrowserName")
    @BeforeClass
    public void setUp(String browserName) throws InstantiationException, MalformedURLException {
        WebDriverInstansiator.setWebDriver(browserName);
    }

    @AfterClass
    public void tearDown(){
        WebDriverInstansiator.getWebDriver().quit();
    }
}
