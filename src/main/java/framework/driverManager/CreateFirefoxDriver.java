package framework.driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import static framework.constants.FrameworkConstants.INCOGNITO;

public class CreateFirefoxDriver implements CreateDriver {

    @Override
    public WebDriver create() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.addArguments(INCOGNITO);
        return new FirefoxDriver(options);
    }
}
