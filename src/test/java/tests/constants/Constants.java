package tests.constants;

public class Constants {

    public final static String ID_START_PAGE = "//*[@id='fixedban']";

    public final static String ALERTS_CARD = "//*[contains(text(), 'Alerts')]";
    public final static String ALERTS_BUTTON = "//*[@id='item-1']//*[contains(text(), 'Alerts')]//parent::li";
    public final static String ALERTS_BUTTON_PRESSED = "//*[contains(@class,'active')]";
    public final static String CLICK_ME_TO_SEE_ALERT_BUTTON = "//*[@id='alertButton']";
    public final static String CLICK_ME_BUTTON_CONFIRM_BOX = "//*[@id='confirmButton']";
    public final static String CLICK_ME_BUTTON_PROMPT = "//*[@id='promtButton']";
    public final static String PROMPT_TEXT = "//*[@id='promptResult']";

    public final static String NESTED_FRAME = "//*[@class='element-list collapse show']//*[@id='item-3']";
    public final static String NESTED_FRAME_ID = "//*[@id='frame1']";
    public final static String FRAME_BUTTON = "//*[@class='element-list collapse show']//*[@id='item-2']";
    public final static String FRAME_ONE = "//*[@id='frame1']";
    public final static String FRAME_TWO = "//*[@id='frame2']";
    public final static String FRAME_TEXT = "//*[@id='sampleHeading']";

    public final static String ELEMENTS_CARD = "//*[@class='category-cards']//*[contains(text(), 'Elements')]";
    public final static String WEB_TABLES_BUTTON = "//*[@class='element-list collapse show']//*[@id='item-3']";
    public final static String ADD_BUTTON = "//*[@id='addNewRecordButton']";
    public final static String REGISTRATION_FORM = "//*[@id='registration-form-modal']";
    public final static String SUBMIT_BUTTON = "//*[@id='submit']";
    public final static String FIST_NAME_FIELD = "//*[@id='firstName-wrapper']//input";
    public final static String LAST_NAME_FIELD = "//*[@id='lastName-wrapper']//input";
    public final static String EMAIL_FIELD = "//*[@id='userEmail-wrapper']//input";
    public final static String AGE_FIELD = "//*[@id='age-wrapper']//input";
    public final static String SALARY_FIELD = "//*[@id='salary-wrapper']//input";
    public final static String DEPARTMENT_FIELD = "//*[@id='department-wrapper']//input";
    public final static String TABLE_ENTRY = "//*[contains(text(),'Jon')]";
    public final static String DELETE_BUTTON = "//*[@id='delete-record-4']";
    public final static String NUMBER_OF_ROW = "//*[@class='rt-tr -odd' or @class= 'rt-tr -even']";
    public final static int NUM = 3;

    public final static String BROWSER_WINDOW = "//*[@class='element-list collapse show']//*[@id='item-0']";
    public final static String NEW_TAB_BUTTON = "//*[@id='tabButton']";
    public final static String SAMPLE_PAGE_TEXT = "//*[@id='sampleHeading']";
    public final static String NEW_TAB_TEXT = "This is a sample page";
    public final static String ELEMENT_BUTTON = "//*[@class='group-header']//*[contains(text(),'Elements')]";
    public final static String LINKS_BUTTON = "//*[@class='element-list collapse show']//*[@id='item-5']";
    public final static String HOME_LINK = "//*[@id='simpleLink']";
}
