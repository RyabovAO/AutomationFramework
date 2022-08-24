package tests.testcases;

import framework.baseTest.BaseTest;
import org.testng.annotations.Test;
import tests.steps.StepsTestCaseOne;
import tests.steps.StepsTestCaseTwo;

public class TestCaseTwo extends BaseTest {

    @Test
    public void testTwo() {
        StepsTestCaseTwo steps = new StepsTestCaseTwo();

        new StepsTestCaseOne().goToHomePage();
        LOGGER.info("Шаг 2");
        steps.clickOnAlertsFrameWindowsAfterClickOnNestedFramesButton();
        LOGGER.info("Шаг 3");
        steps.clickOnFramesButton();
    }
}
