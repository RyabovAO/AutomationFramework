package tests.pageObject;

import framework.basePage.BasePage;
import tests.constants.Constants;

public class StartPage extends BasePage {

    public void goToAlertsFrameWindowsPage() {
        button.clickButton(Constants.ALERTS_CARD);
    }

    public void goToElementsPage() {
        button.clickButton(Constants.ELEMENTS_CARD);
    }

}

