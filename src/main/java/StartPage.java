import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage {

    public StartPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // buttons
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:NEXT_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:NEXT_BUTTON")
    public MobileElement nextButton;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:PREV_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:NEXT_BUTTON")
    public MobileElement prevButton;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:START_BUTTON')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_BUTTON")
    public MobileElement startButton;
    // 1
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:HEADER_TITLE_TEXT_SLIDE_0')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:HEADER_TITLE_TEXT_SLIDE_0")
    public MobileElement firstSlideHeader;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:MAIN_IMG_SLIDE_0')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:MAIN_IMG_SLIDE_0")
    public MobileElement firstSlideImg;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:HEADER_DESCRIPTION_TEXT_SLIDE_0')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:HEADER_DESCRIPTION_TEXT_SLIDE_0")
    public MobileElement firstSlideDescText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:DESCRIPTION_IMG_SLIDE_0')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:DESCRIPTION_IMG_SLIDE_0")
    public MobileElement firstSlideDescImg;
    // 2
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:DESCRIPTION_IMG_SLIDE_1')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:DESCRIPTION_IMG_SLIDE_1")
    public MobileElement secondSlideFooterText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:FOOTER_TEXT_SLIDE_1')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:FOOTER_TEXT_SLIDE_1")
    public MobileElement secondSlideDescImg;
    // 3
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:DESCRIPTION_IMG_SLIDE_2')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:DESCRIPTION_IMG_SLIDE_2")
    public MobileElement thirdSlideFooterText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:FOOTER_TEXT_SLIDE_2')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:FOOTER_TEXT_SLIDE_2")
    public MobileElement thirdSlideDescImg;
    // 4
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:DESCRIPTION_IMG_SLIDE_3')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:DESCRIPTION_IMG_SLIDE_3")
    public MobileElement fourthSlideFooterText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:FOOTER_TEXT_SLIDE_3')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:FOOTER_TEXT_SLIDE_3")
    public MobileElement fourthSlideDescImg;
    // 5
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:DESCRIPTION_IMG_SLIDE_4')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:DESCRIPTION_IMG_SLIDE_4")
    public MobileElement finalSlideFooterText;
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'START_CAROUSEL:FOOTER_TEXT_SLIDE_4')]")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:FOOTER_TEXT_SLIDE_4")
    public MobileElement finalSlideDescImg;

}
