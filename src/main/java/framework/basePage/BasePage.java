package framework.basePage;

import framework.baseElement.Button;
import framework.baseElement.Field;
import framework.baseElement.Link;
import framework.driverManager.DriverUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BasePage {

    protected final static Logger LOGGER = LogManager.getLogger();
    protected Button button = new Button();
    protected DriverUtils driverUtils = new DriverUtils();
    protected Field field = new Field();
    protected Link link = new Link();
}
