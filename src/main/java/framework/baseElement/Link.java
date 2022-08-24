package framework.baseElement;

public class Link extends BaseElement {

    public void clickToLink(String xPath) {
        findByXpath(xPath).click();
    }
}
