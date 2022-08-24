package framework.driverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverUtils {

    protected WebDriver driver = WebDriverCreate.getBrowserDriver();

    public boolean assertAlerts() {
        String text = driver.switchTo().alert().getText();
        return text.length() != 0;
    }

    public boolean alertIsClose(String xPath) {
        return driver.findElement(By.xpath(xPath)).isDisplayed();
    }

    public void accept() {
        driver.switchTo().alert().accept();
    }

    public void sendKey(String key) {
        driver.switchTo().alert().sendKeys(key);
    }

    public void switchToFrame(String xPath) {
        driver.switchTo().frame(driver.findElement(By.xpath(xPath)));
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void switchChildTab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }

    public void switchParentTab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().defaultContent());
    }

    public void closeTab() {
        driver.close();
    }
}