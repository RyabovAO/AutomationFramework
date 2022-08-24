package tests.steps;


import framework.baseElement.Element;
import framework.driverManager.DriverUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tests.pageObject.AlertsFrameWindowsPage;
import tests.pageObject.ElementsPage;
import tests.pageObject.RegistrationForm;
import tests.pageObject.StartPage;

public class StepsBase {

    protected final static Logger LOGGER = LogManager.getLogger();
    protected StartPage startPage = new StartPage();
    protected AlertsFrameWindowsPage alertsPage = new AlertsFrameWindowsPage();
    protected Element element = new Element();
    protected DriverUtils driverUtils = new DriverUtils();
    protected ElementsPage elementsPage = new ElementsPage();
    protected RegistrationForm regForm = new RegistrationForm();
}
