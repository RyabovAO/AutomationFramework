package tests.steps;

import org.testng.Assert;
import tests.constants.Constants;

public class StepsTestCaseFour extends StepsBase {

    public void clickOnAlertsFrameWindowsAfterClickOnBrowserWindowsButton() {
        LOGGER.info("Нажать кнопку Alerts, Frame & Windows");
        startPage.goToAlertsFrameWindowsPage();
        LOGGER.info("Кнопка нажата");
        LOGGER.info("На открывшейся странице в левом меню нажать кнопку Browser Windows");
        alertsPage.clickOnBrowserWindowButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.NEW_TAB_BUTTON),
                "Страница с формой Browser Window не открыта ");
        LOGGER.info("Открыта страница с формой Browser Window");
    }

    public void stepThree() {
        String text = "";
        LOGGER.info("Нажать кнопку New Tab");
        alertsPage.clickOnNewTabButton();
        LOGGER.info("Кнопка нажата");
        driverUtils.switchChildTab();
        text = element.findByXpath(Constants.SAMPLE_PAGE_TEXT).getText();
        Assert.assertEquals(text, Constants.NEW_TAB_TEXT,
                "Новая вкладка /sample со страницей This is a sample page не открыта");
        LOGGER.info("Открыта новая вкладка /sample со страницей This is a sample page");
    }

    public void stepFour() {
        LOGGER.info("Закрыть текущую вкладку");
        driverUtils.closeTab();
        LOGGER.info("Вкладка закрыта");
        driverUtils.switchChildTab();
        Assert.assertTrue(element.elementIsVisible(Constants.NEW_TAB_BUTTON),
                "Страница с формой Browser Windows не открыта");
        LOGGER.info("Открыта страница с формой Browser Windows");
    }

    public void stepFive() {
        LOGGER.info("Нажать кнопку Elements");
        alertsPage.clickOnElementsButton();
        LOGGER.info("Кнопка нажата");
        LOGGER.info("Нажать кнопку Links");
        alertsPage.clickOnLinksButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.HOME_LINK), "Страница с формой Links не открыта");
        LOGGER.info("Открыта страница с формой LInks");
    }

    public void stepSix() {
        LOGGER.info("Нажать на ссылку Home");
        alertsPage.clickToHomeLink();
        LOGGER.info("Переход выполнен");
        Assert.assertTrue(element.elementIsVisible(Constants.ID_START_PAGE),
                "Новая вкладка с главной страницей не открыта");
        LOGGER.info("Открыта новая вкладка с главной страницей");
    }

    public void stepSeven() {
        LOGGER.info("Переключиться на прошлую вкладку");
        driverUtils.switchParentTab();
        LOGGER.info("Вкладка переключилась");
        Assert.assertTrue(element.elementIsVisible(Constants.HOME_LINK), "Страница с формой Links не открыта");
        LOGGER.info("Открыта страница с формой Links");
    }
}
