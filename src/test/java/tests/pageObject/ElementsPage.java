package tests.pageObject;

import framework.basePage.BasePage;
import tests.constants.Constants;

public class ElementsPage extends BasePage {

    public void clickOnWebTableButton() {
        button.clickButton(Constants.WEB_TABLES_BUTTON);
    }

    public void clickOnAddButton() {
        button.clickButton(Constants.ADD_BUTTON);
    }

    public void clickOnDeleteButton() {
        button.clickButton(Constants.DELETE_BUTTON);
    }
}
