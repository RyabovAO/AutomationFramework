package framework.driverManager;

import framework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static framework.constants.FrameworkConstants.*;

public class BrowserFactory {

    protected static WebDriver getDriver() {
        WebDriver driver = null;

        switch (PropertiesReader.getPropertyValue(BROWSER_NAME)) {
            case CHROME:
                driver = new CreateChromeDriver().create();
                break;
            case FIREFOX:
                driver = new CreateFirefoxDriver().create();
                break;
            default:
                Assert.fail("Неверное имя браузера");
        }
        driver.manage().timeouts().implicitlyWait(DRIVER_IMPLICIT_WAIT_TIMER, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}


