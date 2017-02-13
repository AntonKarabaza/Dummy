package pageobject;

import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("http://www.google.com/");
    }

    public String readHeader() {
        return driver.getTitle();
    }
}
