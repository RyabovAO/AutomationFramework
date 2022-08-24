package tests.testcases;

import framework.baseTest.BaseTest;
import org.testng.annotations.Test;
import tests.steps.StepsTestCaseFour;
import tests.steps.StepsTestCaseOne;

public class TestCaseFour extends BaseTest {

    @Test
    public void testFour() {
        StepsTestCaseFour steps = new StepsTestCaseFour();

        new StepsTestCaseOne().goToHomePage();
        LOGGER.info("Шаг 2");
        steps.clickOnAlertsFrameWindowsAfterClickOnBrowserWindowsButton();
        LOGGER.info("Шаг 3");
        steps.stepThree();
        LOGGER.info("Шаг 4");
        steps.stepFour();
        LOGGER.info("Шаг 5");
        steps.stepFive();
        LOGGER.info("Шаг 6");
        steps.stepSix();
        LOGGER.info("Шаг 7");
        steps.stepSeven();
    }
}
