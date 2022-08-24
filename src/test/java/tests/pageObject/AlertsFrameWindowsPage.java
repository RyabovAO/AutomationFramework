package tests.pageObject;

import framework.basePage.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import tests.constants.Constants;

public class AlertsFrameWindowsPage extends BasePage {

    public void clickOnAlertsButton() {
        button.clickButton(Constants.ALERTS_BUTTON);
    }

    public void clickOnClickMeButton() {
        button.clickButton(Constants.CLICK_ME_TO_SEE_ALERT_BUTTON);
    }

    public void clickOkOnAlerts() {
        driverUtils.accept();
    }

    public void clickOnClickMeButtonConfirmBox() {
        button.clickButton(Constants.CLICK_ME_BUTTON_CONFIRM_BOX);
    }

    public void clickOnClickMeButtonProm() {
        button.clickButton(Constants.CLICK_ME_BUTTON_PROMPT);
    }

    public String getRandomText() {
        return RandomStringUtils.random(5);
    }

    public void sendTextToAlerts(String text) {
        driverUtils.sendKey(text);
    }

    public void clickOnNestedFrameButton() {
        button.clickButton(Constants.NESTED_FRAME);
    }

    public void clickOnFrameButton() {
        button.clickButton(Constants.FRAME_BUTTON);
    }

    public void clickOnBrowserWindowButton() {
        button.clickButton(Constants.BROWSER_WINDOW);
    }

    public void clickOnNewTabButton() {
        button.clickButton(Constants.NEW_TAB_BUTTON);
    }

    public void clickOnElementsButton() {
        button.clickButton(Constants.ELEMENT_BUTTON);
    }

    public void clickOnLinksButton() {
        button.clickButton(Constants.LINKS_BUTTON);
    }

    public void clickToHomeLink() {
        link.clickToLink(Constants.HOME_LINK);
    }
}
