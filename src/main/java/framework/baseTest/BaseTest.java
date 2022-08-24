package framework.baseTest;

import framework.driverManager.WebDriverCreate;
import framework.utils.PropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static framework.constants.FrameworkConstants.*;

public abstract class BaseTest {

    protected final static Logger LOGGER = LogManager.getLogger();

    @Parameters("BrowserName")
    @BeforeMethod
    public void startTest(String name) {
        if (name.equalsIgnoreCase(CHROME)) {
            PropertiesReader.setPropertyValue(CHROME);
            LOGGER.info("Начало теста");
            LOGGER.info("Браузер: Chrome");
        }
        if (name.equalsIgnoreCase(FIREFOX)) {
            PropertiesReader.setPropertyValue(FIREFOX);
            LOGGER.info("Начало теста");
            LOGGER.info("Браузер: Firefox");
        }
        LOGGER.info("Шаг 1");
        LOGGER.info("Переход на главную страницу");
        WebDriverCreate.getBrowserDriver().get(URL);
    }

    @AfterMethod
    public void endTest() {
        WebDriverCreate.closeDriver();
        LOGGER.info("Тест закончен");
    }
}
