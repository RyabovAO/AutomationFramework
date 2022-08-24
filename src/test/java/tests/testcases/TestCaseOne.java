package tests.testcases;

import framework.baseTest.BaseTest;
import org.testng.annotations.Test;
import tests.steps.StepsTestCaseOne;

public class TestCaseOne extends BaseTest {

    @Test
    public void testOne() {
        StepsTestCaseOne steps = new StepsTestCaseOne();

        steps.goToHomePage();
        LOGGER.info("Шаг 2");
        steps.clickOnAlertsFrameWindowsAfterClickOnAlertsButton();
        LOGGER.info("Шаг 3");
        steps.clickButtonToSeeAlert();
        LOGGER.info("Шаг 4");
        steps.clickOk();
        LOGGER.info("Шаг 5");
        steps.clickOnButtonClickConfirmBoxWillAppear();
        LOGGER.info("Шаг 6");
        steps.clickOkButton();
        LOGGER.info("Шаг 7");
        steps.clickOnButtonClickPromptBoxWillAppear();
        LOGGER.info("Шаг 8");
        steps.inputRandomText();
    }

}
