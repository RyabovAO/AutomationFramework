package tests.steps;

import org.testng.Assert;
import tests.constants.Constants;

public class StepsTestCaseThree extends StepsBase {

    public void clickOnElementsAfterClickOnWebTablesButton() {
        LOGGER.info("Нажать кнопку Elements");
        startPage.goToElementsPage();
        LOGGER.info("Кнопка нажата");
        LOGGER.info("На открывшейся странице в левом меню нажать кнопку Web Tables");
        elementsPage.clickOnWebTableButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.ADD_BUTTON), "Страница с формой Web Tables не открыта");
        LOGGER.info("Открыта страница с формой Web Tables");
    }

    public void clickOnAddButton() {
        LOGGER.info("Нажать кнопку Add");
        elementsPage.clickOnAddButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.REGISTRATION_FORM),
                "Форма Registration Form не появилась");
        LOGGER.info("На странице появилась форма Registration Form");
    }

    public void inputUserDataAndClickSubmitButton(String firstName, String lastName, String email, String age, String salary,
                                                  String department) {
        LOGGER.info("Ввести данные пользователя:");
        LOGGER.info("Ввести firstName пользователя");
        regForm.inputFistName(firstName);
        LOGGER.info("firstName введено");
        LOGGER.info("Ввести lastName пользователя");
        regForm.inputLastName(lastName);
        LOGGER.info("lastName введено");
        LOGGER.info("Ввести email пользователя");
        regForm.inputEmail(email);
        LOGGER.info("email введено");
        LOGGER.info("Ввести age пользователя");
        regForm.inputAge(age);
        LOGGER.info("age введено");
        LOGGER.info("Ввести salary пользователя");
        regForm.inputSalary(salary);
        LOGGER.info("salary введено");
        LOGGER.info("Ввести department пользователя");
        regForm.inputDepartment(department);
        LOGGER.info("department введено");
        LOGGER.info("Нажать кнопку Submit");
        regForm.clickOnSubmitButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsNotVisible(Constants.REGISTRATION_FORM), "Форма регистрации закрыта ");
        LOGGER.info("Форма регистрации закрыта");
        Assert.assertTrue(element.elementIsVisible(Constants.TABLE_ENTRY),
                "В таблице не появились данные пользователя");
        LOGGER.info("В таблице появились данные пользователя");
    }

    public void clickOnDeleteButton() {
        LOGGER.info("Нажать кнопку Delete в строке пользователя");
        elementsPage.clickOnDeleteButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(compareNumberOfRow(), "Количество записей в таблице не изменилось");
        LOGGER.info("Количество записей в таблице изменилось");
        Assert.assertTrue(element.elementIsNotVisible(Constants.TABLE_ENTRY), "Пользователь не удалился из таблицы");
        LOGGER.info("Пользователь удалился из таблицы");
    }

    private boolean compareNumberOfRow() {
        int num = element.findNumberOfElements(Constants.NUMBER_OF_ROW);
        return num <= Constants.NUM;
    }
}
