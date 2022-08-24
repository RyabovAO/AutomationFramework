package framework.driverManager;

import org.openqa.selenium.WebDriver;

public class WebDriverCreate {

    private static WebDriver driver;

    private WebDriverCreate() {
    }

    public static WebDriver getBrowserDriver() {
        if (driver == null) {
            driver = BrowserFactory.getDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.manage().deleteAllCookies();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
