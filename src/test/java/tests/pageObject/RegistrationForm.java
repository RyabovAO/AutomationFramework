package tests.pageObject;

import framework.basePage.BasePage;
import tests.constants.Constants;

public class RegistrationForm extends BasePage {

    public void inputFistName(String fistName) {
        field.inputChars(Constants.FIST_NAME_FIELD, fistName);
    }

    public void inputLastName(String LastName) {
        field.inputChars(Constants.LAST_NAME_FIELD, LastName);
    }

    public void inputEmail(String email) {
        field.inputChars(Constants.EMAIL_FIELD, email);
    }

    public void inputAge(String age) {
        field.inputChars(Constants.AGE_FIELD, age);
    }

    public void inputSalary(String salary) {
        field.inputChars(Constants.SALARY_FIELD, salary);
    }

    public void inputDepartment(String department) {
        field.inputChars(Constants.DEPARTMENT_FIELD, department);
    }

    public void clickOnSubmitButton() {
        button.clickButton(Constants.SUBMIT_BUTTON);
    }
}
