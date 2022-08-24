package tests.steps;

import org.testng.Assert;
import tests.constants.Constants;

public class StepsTestCaseTwo extends StepsBase {

    public void clickOnAlertsFrameWindowsAfterClickOnNestedFramesButton() {
        LOGGER.info("Нажать кнопку Alerts, Frame & Windows");
        startPage.goToAlertsFrameWindowsPage();
        LOGGER.info("Кнопка нажата");
        LOGGER.info("На открывшейся странице в левом меню нажать кнопку Nested Frames");
        alertsPage.clickOnNestedFrameButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.NESTED_FRAME_ID),
                "Страница с формой Nested Frame не открыта");
        LOGGER.info("Открыта страница с формой Frames");
    }

    public void clickOnFramesButton() {
        LOGGER.info("В левом меню нажать кнопку Frames");
        alertsPage.clickOnFrameButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.FRAME_ONE), "Страница с формой Frame не открыта");
        LOGGER.info("Открыта страница с формой Frame");
        Assert.assertTrue(compareText(), "Надпись из верхнего фрейма не соответствует надписи из нижнего");
        LOGGER.info("Надпись из верхнего фрейма соответствует надписи из нижнего");
    }

    private boolean compareText() {
        String textFrameOne = "";
        String textFrameTwo = "";
        driverUtils.switchToFrame(Constants.FRAME_ONE);
        textFrameOne = element.findByXpath(Constants.FRAME_TEXT).getText();
        driverUtils.switchToParentFrame();
        driverUtils.switchToFrame(Constants.FRAME_TWO);
        textFrameTwo = element.findByXpath(Constants.FRAME_TEXT).getText();
        return textFrameOne.equals(textFrameTwo);
    }
}
