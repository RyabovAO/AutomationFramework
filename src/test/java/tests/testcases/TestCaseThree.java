package tests.testcases;

import framework.baseTest.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.steps.StepsTestCaseOne;
import tests.steps.StepsTestCaseThree;

public class TestCaseThree extends BaseTest {

    @Parameters({"fistName", "lastName", "email", "age", "salary", "department"})
    @Test
    public void testThree(String fistName, String lastName, String email, String age, String salary, String depart) {
        StepsTestCaseThree steps = new StepsTestCaseThree();

        new StepsTestCaseOne().goToHomePage();
        LOGGER.info("Шаг 2");
        steps.clickOnElementsAfterClickOnWebTablesButton();
        LOGGER.info("Шаг 3");
        steps.clickOnAddButton();
        LOGGER.info("Шаг 4");
        steps.inputUserDataAndClickSubmitButton(fistName, lastName, email, age, salary, depart);
        LOGGER.info("Шаг 5");
        steps.clickOnDeleteButton();
    }
}
