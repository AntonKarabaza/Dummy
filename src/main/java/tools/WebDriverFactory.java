package tools;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class WebDriverFactory {

    private WebDriver webDriver;

    public WebDriver getWebDriver (String browserName) throws InstantiationException, MalformedURLException {

        String editedBrowserName = browserName.toLowerCase().trim();

        switch (editedBrowserName) {
            case "chrome":
                DesiredCapabilities capabilityChrome = DesiredCapabilities.chrome();
                    capabilityChrome.setBrowserName("chrome");
                    capabilityChrome.setVersion("2.27");
                    capabilityChrome.setPlatform(Platform.WIN10);
                return webDriver = new RemoteWebDriver(new URL("http://10.34.41.252:4444/wd/hub"), capabilityChrome);
            case "opera":
                System.setProperty("webdriver.opera.driver", "D:\\SELENIUM\\operadriver.exe");
                return webDriver = new OperaDriver();
            case "ie":
                return webDriver = new InternetExplorerDriver();
            case "htmlunit":
                return webDriver = new HtmlUnitDriver();
            case "firefox":
                DesiredCapabilities capabilityFirefox = DesiredCapabilities.firefox();
                    capabilityFirefox.setBrowserName("firefox");
                    capabilityFirefox.setVersion("46.0.1");
                    capabilityFirefox.setPlatform(Platform.WIN10);
                return webDriver = new RemoteWebDriver(new URL("http://10.34.41.252:4444/wd/hub"), capabilityFirefox);
            default:
                throw new InstantiationException("Browser is not instantiated");
        }
    }
}
