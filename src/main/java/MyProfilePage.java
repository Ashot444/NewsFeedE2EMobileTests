import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public MyProfilePage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text ='Update']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Update']")
    public MobileElement updateButton;

    @AndroidFindBy(xpath = "//*[contains(@text , 'User name:')]")
    @iOSXCUITFindBy(xpath = " //XCUIElementTypeStaticText[contains(@name,'User name:')]")
    public MobileElement userNameInfo;

    @AndroidFindBy(xpath = "//*[contains(@text , 'User email:')]")
    @iOSXCUITFindBy(xpath = " //XCUIElementTypeStaticText[contains(@name,'User email:')]")
    public MobileElement userEmailInfo;
}
