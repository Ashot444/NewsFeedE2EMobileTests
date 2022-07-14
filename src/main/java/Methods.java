import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;


public class Methods extends BaseMethods {

    String defaultEmail = "9default4575@mail.ru";
    String defaultPassword = "90123456787";
    String defaultName = "9Ashot0988";


    protected AppiumDriver<?> driver;

    @BeforeMethod
    public void setUp() throws Exception {
//        driver = BaseMethods.returnDriver(System.getenv("TESTING_PLATFORM"));
        driver = BaseMethods.returnDriver(BaseMethods.readProperty("run.platform"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    // random string generation
    public static String generateRandomHexString (int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    protected void login() throws InterruptedException {
        LoginPage login = new LoginPage(this.driver);
        Thread.sleep(1000);
        login.loginEmail.sendKeys(defaultEmail);
        login.loginPassword.sendKeys(defaultPassword);
        login.loginButton.click();
    }

    protected void registration() throws InterruptedException {
        Registration registration = new Registration(this.driver);
        Thread.sleep(1000);
        registration.registerButton.click();
        registration.avatarButton.click();
        registration.avatarSelectImg.click();
        registration.chooseButton.click();
        registration.emailInput.sendKeys("9default4575@mail.ru");

        registration.nameInput.sendKeys("9Ashot0988");
        registration.passwordInput.sendKeys("90123456787");

        registration.registerButton.click();

        new TouchAction<>(driver).press(PointOption.point(350,800)).release().perform();
        registration.goBackButton.click();

        Thread.sleep(100000);
    }

    protected void defaultUpdateUser(){
        MyProfilePage myProfilePage = new MyProfilePage(this.driver);
        UpdatePage updatePage = new UpdatePage(this.driver);

        myProfilePage.updateButton.click();
        updatePage.emailInput.sendKeys(defaultEmail);
        updatePage.nameInput.sendKeys(defaultName);
        new TouchAction<>(driver).press(PointOption.point(350,800)).release().perform();
        updatePage.saveButton.click();
        updatePage.backButton.click();
    }


}
