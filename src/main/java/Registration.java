import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

    public Registration(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//*[@text='REGISTER']")
    @iOSXCUITFindBy(accessibility = "REGISTER")
    public MobileElement registerButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Email Name Password REGISTER Go back'])[15]/XCUIElementTypeOther[1]")
    public MobileElement avatarButton;

    @AndroidFindBy(xpath = "//*[@text='download.png']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains (@name , 'Фотография')][1]")
    public MobileElement avatarSelectImg;

    @AndroidFindBy(xpath = "//*[@text='CROP']")
    @iOSXCUITFindBy(accessibility = "Choose")
    public MobileElement chooseButton;

    @AndroidFindBy(xpath = "//*[@text='Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Email'])[2]/XCUIElementTypeTextField")
    public MobileElement emailInput;

    @AndroidFindBy(xpath = "//*[@text='Name']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Name'])[2]/XCUIElementTypeTextField")
    public MobileElement nameInput;

    @AndroidFindBy(xpath = "//*[@text='Password']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Password'])[2]/XCUIElementTypeSecureTextField")
    public MobileElement passwordInput;

    @AndroidFindBy(xpath = "//*[@text='Go back']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Go back']")
    public MobileElement goBackButton;
}

