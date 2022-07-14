import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='LOGIN']")
    @iOSXCUITFindBy(accessibility = "LOGIN")
    public MobileElement loginButton;

    @AndroidFindBy(xpath = "//*[@text='Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Email'])[1]")
    public MobileElement loginEmail;

    @AndroidFindBy(xpath = "//*[@text='Password']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Password'])[1]")
    public MobileElement loginPassword;

    @AndroidFindBy(xpath = "//*[contains(@text , 'user email')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='user email must be a well-formed email address']")
    public MobileElement logText;

    @AndroidFindBy(xpath = "//*[contains(@text , 'If you')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='If you don't have an account']")
    public MobileElement logRegText;

    @AndroidFindBy(xpath = "//*[contains(@text , 'password')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='password not valid']")
    public MobileElement logPassText;

}
