package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class WebDriverFactory {

    private WebDriver webDriver;

    public WebDriver getWebDriver (String browserName) throws InstantiationException {

        String editedBrowserName = browserName.toLowerCase().trim();

        switch (editedBrowserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
                return webDriver = new ChromeDriver();
            case "opera":
                System.setProperty("webdriver.opera.driver", "D:\\SELENIUM\\operadriver.exe");
                return webDriver = new OperaDriver();
            case "ie":
                return webDriver = new InternetExplorerDriver();
            case "htmlunit":
                return webDriver = new HtmlUnitDriver();
            case "firefox":
                return webDriver = new FirefoxDriver();
            default:
                throw new InstantiationException("Browser is not instantiated");
        }
    }
}
