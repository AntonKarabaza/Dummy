package tools;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
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
                DesiredCapabilities capabilitiesChrome = DesiredCapabilities.chrome();
                    capabilitiesChrome.setBrowserName("chrome");
                    capabilitiesChrome.setVersion("2.27");
                    capabilitiesChrome.setPlatform(Platform.WIN10);
                return webDriver = new RemoteWebDriver(new URL("http://10.34.41.252:4444/wd/hub"), capabilitiesChrome);
            case "opera":
                System.setProperty("webdriver.opera.driver", "D:\\SELENIUM\\operadriver.exe");
                return webDriver = new OperaDriver();
            case "ie":
                DesiredCapabilities capabilitiesIE = DesiredCapabilities.internetExplorer();
                    capabilitiesIE.setBrowserName("internet explorer");
                    capabilitiesIE.setVersion("3.1.0");
                    capabilitiesIE.setPlatform(Platform.WIN10);
                return webDriver = new RemoteWebDriver(new URL("http://10.34.41.252:4444/wd/hub"), capabilitiesIE);
            case "htmlunit":
                return webDriver = new HtmlUnitDriver();
            case "firefox":
                DesiredCapabilities capabilitiesFirefox = DesiredCapabilities.firefox();
                    capabilitiesFirefox.setBrowserName("firefox");
                    capabilitiesFirefox.setVersion("46.0.1");
                    capabilitiesFirefox.setPlatform(Platform.WIN10);
                return webDriver = new RemoteWebDriver(new URL("http://10.34.41.252:4444/wd/hub"), capabilitiesFirefox);
            default:
                throw new InstantiationException("Browser is not instantiated");
        }
    }
}
