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
                DesiredCapabilities capabilityChrome = new DesiredCapabilities();
                    capabilityChrome.setCapability("name", "GoogleTestChrome");
                    capabilityChrome.setCapability("browser_api_name", "Chrome56x64");
                    capabilityChrome.setCapability("os_api_name", "Win10");
                    capabilityChrome.setCapability("screen_resolution", "1366x768");
                    capabilityChrome.setCapability("record_video", "true");
                    capabilityChrome.setCapability("record_network", "true");
                return webDriver = new RemoteWebDriver(new URL(
                        "http://antonkarabaza%40gmail.com:u0a75a81b3953a3e@hub.crossbrowsertesting.com:80/wd/hub"),
                        capabilityChrome);
            case "opera":
                System.setProperty("webdriver.opera.driver", "D:\\SELENIUM\\operadriver.exe");
                return webDriver = new OperaDriver();
            case "edge":
                DesiredCapabilities capabilityEdge = new DesiredCapabilities();
                    capabilityEdge.setCapability("name", "GoogleTestEdge");
                    capabilityEdge.setCapability("browser_api_name", "Edge20");
                    capabilityEdge.setCapability("os_api_name", "Win10");
                    capabilityEdge.setCapability("screen_resolution", "1366x768");
                    capabilityEdge.setCapability("record_video", "true");
                    capabilityEdge.setCapability("record_network", "true");
                return webDriver = new RemoteWebDriver(new URL(
                        "http://antonkarabaza%40gmail.com:u0a75a81b3953a3e@hub.crossbrowsertesting.com:80/wd/hub"),
                        capabilityEdge);
            case "htmlunit":
                return webDriver = new HtmlUnitDriver();
            case "firefox":
                DesiredCapabilities capabilityFirefox = new DesiredCapabilities();
                    capabilityFirefox.setCapability("name", "GoogleTestFirefox");
                    capabilityFirefox.setCapability("browser_api_name", "FF46x64");
                    capabilityFirefox.setCapability("os_api_name", "Win10");
                    capabilityFirefox.setCapability("screen_resolution", "1366x768");
                    capabilityFirefox.setCapability("record_video", "true");
                    capabilityFirefox.setCapability("record_network", "true");
                return webDriver = new RemoteWebDriver(new URL(
                        "http://antonkarabaza%40gmail.com:u0a75a81b3953a3e@hub.crossbrowsertesting.com:80/wd/hub"),
                        capabilityFirefox);
            default:
                throw new InstantiationException("Browser is not instantiated");
        }
    }
}
