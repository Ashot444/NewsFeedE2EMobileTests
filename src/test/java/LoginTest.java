import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.junit.Assert;

import static org.testng.AssertJUnit.assertEquals;

@Epic(value = "Login page.")
@Feature("Login.")
public class LoginTest extends Methods {
    @Story("Valid Login.")
    @Description(value = "Login user")
    @Test
    public void loginTest() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        LoginPage login = new LoginPage(this.driver);
        ProfilePage profilePage =new ProfilePage(this.driver);

        String defaultEmail = "9default4575@mail.ru";
        String defaultPassword = "90123456787";

        Thread.sleep(1000);
        login.loginEmail.sendKeys(defaultEmail);
        login.loginPassword.sendKeys(defaultPassword);
        login.loginButton.click();
        profilePage.textHello.click();
        String name = profilePage.textHello.getAttribute("name");

        assertEquals("Hello, 9Ashot0988", name);
    }


    @Story("Valid NegativeLogin.")
    @Description(value = "NegativeLogin user")
    @Test
    public void negativeLoginTest() throws InterruptedException {

        LoginPage login = new LoginPage(this.driver);

        String defaultEmail = "9default4575";
        String defaultPassword = "12345";

        Thread.sleep(1000);
        login.loginEmail.sendKeys(defaultEmail);
        login.loginPassword.sendKeys(defaultPassword);
        login.loginButton.click();
        String logText = login.logText.getText();

        assertEquals(logText, "user email must be a well-formed email address");
    }


    @Story("Not Valid Negative Login.")
    @Description(value = "Not Valid Negative Login user")
    @Test
    public void negativePassLoginTest() throws InterruptedException {

        LoginPage login = new LoginPage(this.driver);

        String defaultEmail = "9default4575@mail.ru";
        String defaultPassword = "";

        Thread.sleep(1000);
        login.loginEmail.sendKeys(defaultEmail);
        login.loginPassword.sendKeys(defaultPassword);
        login.loginButton.click();
        String logText = login.logPassText.getText();

        assertEquals(logText, "password not valid");
    }


}