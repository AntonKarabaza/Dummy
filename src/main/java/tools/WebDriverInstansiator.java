package tools;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverInstansiator {

    private static InheritableThreadLocal<WebDriver> webDriver = new InheritableThreadLocal<>();
    private static WebDriverFactory factory = new WebDriverFactory();

    public static void setWebDriver(String browserName) throws InstantiationException, MalformedURLException {
        webDriver.set(factory.getWebDriver(browserName));
    }

    public static WebDriver getWebDriver() {
        return webDriver.get();
    }
}
