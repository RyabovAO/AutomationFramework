package framework.baseElement;

import framework.driverManager.WebDriverCreate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.constants.FrameworkConstants.DRIVER_EXPLICIT_WAIT_TIMER;

public abstract class BaseElement {

    protected WebDriver driver;

    public BaseElement() {
        this.driver = WebDriverCreate.getBrowserDriver();
    }

    public boolean elementIsVisible(String xPath) {
        return waitElement(xPath).isDisplayed();
    }

    public boolean elementIsNotVisible(String xPath) {
        return new WebDriverWait(driver, DRIVER_EXPLICIT_WAIT_TIMER).
                until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPath)));
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public int findNumberOfElements(String xPath) {
        return driver.findElements(By.xpath(xPath)).size();
    }

    public WebElement waitElement(String elem) {
        return new WebDriverWait(driver, DRIVER_EXPLICIT_WAIT_TIMER).
                until(ExpectedConditions.elementToBeClickable(findByXpath(elem)));
    }
}
