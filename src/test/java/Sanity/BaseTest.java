package Sanity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import tools.WebDriverInstansiator;

public class BaseTest {

    @Parameters("BrowserName")
    @BeforeClass
    public void setUp(String browserName) throws InstantiationException {
        WebDriverInstansiator.setWebDriver(browserName);
    }

    @AfterClass
    public void tearDown(){
        WebDriverInstansiator.getWebDriver().quit();
    }
}
