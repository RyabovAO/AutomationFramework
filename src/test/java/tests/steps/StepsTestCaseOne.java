package tests.steps;

import org.testng.Assert;
import tests.constants.Constants;

public class StepsTestCaseOne extends StepsBase {

    public void goToHomePage() {
        Assert.assertTrue(element.elementIsVisible(Constants.ID_START_PAGE), "Главная страница не открыта");
        LOGGER.info("Главная страница открыта");
    }

    public void clickOnAlertsFrameWindowsAfterClickOnAlertsButton() {
        LOGGER.info("Нажать кнопку Alerts, Frame & Windows");
        startPage.goToAlertsFrameWindowsPage();
        LOGGER.info("Кнопка нажата");
        LOGGER.info("На открывшейся странице нажать кнопку Alerts");
        alertsPage.clickOnAlertsButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(element.elementIsVisible(Constants.ALERTS_BUTTON_PRESSED),
                "На странице не появилась форма Alerts");
        LOGGER.info("На странице появилась форма Alerts");
    }

    public void clickButtonToSeeAlert() {
        LOGGER.info("Нажать на кнопку Click button to see alert");
        alertsPage.clickOnClickMeButton();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(driverUtils.assertAlerts(), "Окно алерт с текстом You clicked a button не открылось");
        LOGGER.info("Открыт алерт с тестом You clicked a button");
    }

    public void clickOk() {
        LOGGER.info("Нажать кнопку OK");
        alertsPage.clickOkOnAlerts();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(driverUtils.alertIsClose(Constants.ALERTS_BUTTON), "Алерт не закрылся");
        LOGGER.info("Алерт закрылся");
    }

    public void clickOnButtonClickConfirmBoxWillAppear() {
        LOGGER.info("Нажать на кнопку On button click, confirm box will appear");
        alertsPage.clickOnClickMeButtonConfirmBox();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(driverUtils.assertAlerts(), "Окно алерт с текстом Do you confirm action не открылось");
        LOGGER.info("Открыт алерт с текстом Do you confirm action?");
    }

    public void clickOkButton() {
        LOGGER.info("Нажать кнопку OK");
        alertsPage.clickOkOnAlerts();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(driverUtils.alertIsClose(Constants.ALERTS_BUTTON),
                "Алерт не закрылся Надпись 'You selected Ok' не появилась");
        LOGGER.info("Алерт закрылся. Рядом с кнопкой появилась надпись You selected Ok");
    }

    public void clickOnButtonClickPromptBoxWillAppear() {
        LOGGER.info("Нажать на кнопку On button click, prompt box will appear");
        alertsPage.clickOnClickMeButtonProm();
        LOGGER.info("Кнопка нажата");
        Assert.assertTrue(driverUtils.assertAlerts(), "Алерт с текстом 'Please enter your name' не открылся");
        LOGGER.info("Открыт алерт с текстом Please enter your name");
    }

    public void inputRandomText() {
        LOGGER.info("Ввести случайно сгенерированный текст");
        String randomText = alertsPage.getRandomText();
        alertsPage.sendTextToAlerts(randomText);
        LOGGER.info("Текст введен");
        LOGGER.info("Нажать кнопку Ok");
        driverUtils.accept();
        LOGGER.info("Кнопка нажата");
        String text = element.waitElement(Constants.PROMPT_TEXT).getText().substring(12);
        Assert.assertEquals(randomText, text, "Алерт закрылся Появившейся текст соответствует введенному в Алерт");
        LOGGER.info("Алерт закрылся Появившейся текст соответствует введенному в Алерт");
    }
}
