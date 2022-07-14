import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public ProfilePage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text ='My Profile']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='My Profile']")
    public MobileElement myProfileButton;

    @AndroidFindBy(xpath = "//*[@text ='Newsfeed']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Newsfeed']")
    public MobileElement NewsButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Hello,')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Hello,')]")
    public MobileElement textHello;
}
