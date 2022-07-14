import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePage {
    public UpdatePage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='9default4575@mail.ru 9Ashot0988 Save Back'])[15]/XCUIElementTypeOther[1]")
    public MobileElement avatarButton;

    @AndroidFindBy(xpath = "//*[@text='download.png']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains (@name , 'Фотография')][3]")
    public MobileElement selectAvatarButton;

    @AndroidFindBy(xpath = "//*[@text='CROP']")
    @iOSXCUITFindBy(accessibility = "Choose")
    public MobileElement chooseButton;

    @AndroidFindBy(xpath = "//*[@text='9default4575@mail.ru']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='9default4575@mail.ru'])[1]")
    public MobileElement emailInput;

    @AndroidFindBy(xpath = "//*[@text='9Ashot0988']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='9Ashot0988'])[1]")
    public MobileElement nameInput;

    @AndroidFindBy(xpath = "//*[@text='Save']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Save']")
    public MobileElement saveButton;

    @AndroidFindBy(xpath = "//*[@text='Back']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Back']")
    public MobileElement backButton;

    //block 2

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='update@google.ru Ivan Save Back'])[15]/XCUIElementTypeOther[1]")
    public MobileElement avatarButton2;


    @AndroidFindBy(xpath = "//*[@text='update@google.ru']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='update@google.ru'])[1]")
    public MobileElement emailInput2;

    @AndroidFindBy(xpath = "//*[@text='Ivan']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Ivan'])[1]")
    public MobileElement nameInput2;

}
