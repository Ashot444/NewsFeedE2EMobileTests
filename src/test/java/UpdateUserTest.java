import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.AssertJUnit.assertEquals;

@Epic(value = "Update page.")
@Feature("Update.")
public class UpdateUserTest  extends Methods {
    @Story("Valid Update.")
    @Description(value = "Update user")
    @Test
    public void updateUserTest() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        ProfilePage profilePage =new ProfilePage(this.driver);
        MyProfilePage myProfilePage = new MyProfilePage(this.driver);
        UpdatePage updatePage = new UpdatePage(this.driver);
        String updateName = "9Ashot0988";
        String updateEmail = "9default4575@mail.ru";

        this.login();
        profilePage.myProfileButton.click();
        myProfilePage.updateButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        updatePage.avatarButton.click();
        updatePage.selectAvatarButton.click();
        updatePage.chooseButton.click();
        updatePage.emailInput.sendKeys(updateEmail);
        updatePage.nameInput.sendKeys(updateName);
        new TouchAction<>(driver).press(PointOption.point(350,800)).release().perform();
        updatePage.saveButton.click();
        updatePage.backButton.click();

        myProfilePage.userNameInfo.click();
        String name = myProfilePage.userNameInfo.getAttribute("name").substring(11);

        assertEquals(name, updateName);

        this.defaultUpdateUser();
    }

    @Story("Valid negativeUpdate.")
    @Description(value = "negativeUpdate user")
    @Test
    public void negativeUpdateUserTest() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        ProfilePage profilePage =new ProfilePage(this.driver);
        MyProfilePage myProfilePage = new MyProfilePage(this.driver);
        UpdatePage updatePage = new UpdatePage(this.driver);
        String updateName = "9Ashot0988";
        String updateEmail = "9default4575@mail.ru";

        this.login();
        profilePage.myProfileButton.click();
        myProfilePage.updateButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        updatePage.avatarButton.click();
        updatePage.selectAvatarButton.click();
        updatePage.chooseButton.click();
        updatePage.emailInput.sendKeys(updateEmail);
        updatePage.nameInput.sendKeys(updateName);
        new TouchAction<>(driver).press(PointOption.point(350,800)).release().perform();

        updatePage.backButton.click();

        myProfilePage.userNameInfo.click();
        String name = myProfilePage.userNameInfo.getAttribute("name").substring(11);

        assertEquals(name, updateName);

    }
}
