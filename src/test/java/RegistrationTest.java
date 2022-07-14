
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

@Epic(value = "Registration page.")
@Feature("Registration.")
public class RegistrationTest extends Methods {
    @Story("Valid Registration.")
    @Description(value = "Registration users")
    @Test
    public void registrationTest() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        Registration registration = new Registration(this.driver);
        ProfilePage profilePage =new ProfilePage(this.driver);

        String defaultEmail = generateRandomHexString(7)+"@gmail.ru";
        String defaultPassword = generateRandomHexString(7);
        String defaultName = generateRandomHexString(5);

        this.driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        registration.registerButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        registration.avatarButton.click();
        registration.avatarSelectImg.click();
        registration.chooseButton.click();
        registration.emailInput.sendKeys(defaultEmail);

        registration.nameInput.sendKeys(defaultName);

        registration.passwordInput.sendKeys(defaultPassword, Keys.ENTER);

        registration.registerButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        registration.goBackButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        profilePage.textHello.click();
        String name = profilePage.textHello.getAttribute("name");

        assertEquals("Hello, " + defaultName, name);
    }

    @Story("Valid negativeRegistration.")
    @Description(value = "negativeRegistration users")
    @Test
    public void negativeRegistrationTest() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        Registration registration = new Registration(this.driver);
        LoginPage login = new LoginPage(this.driver);

        String defaultEmail = generateRandomHexString(7);
        String defaultPassword = generateRandomHexString(7);
        String defaultName = generateRandomHexString(5);

        this.driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        registration.registerButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        registration.avatarButton.click();
        registration.avatarSelectImg.click();
        registration.chooseButton.click();
        registration.emailInput.sendKeys(defaultEmail);

        registration.nameInput.sendKeys(defaultName);
        registration.passwordInput.sendKeys(defaultPassword, Keys.ENTER);

        registration.registerButton.click();

        this.driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        registration.goBackButton.click();

        this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        String logRegText = login.logRegText.getText();

        assertEquals(logRegText, "If you don't have an account");

    }
    }

