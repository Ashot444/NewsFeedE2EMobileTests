import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Epic(value = "MyProfile page.")
@Feature("MyProfile.")
public class MyProfileTest extends Methods {
    @Story("Valid MyProfile.")
    @Description(value = "MyProfile user")
    @Test
    public void myProfileTest() throws InterruptedException {
        ProfilePage profilePage =new ProfilePage(this.driver);
        MyProfilePage myProfilePage = new MyProfilePage(this.driver);

        this.login();
        profilePage.myProfileButton.click();

        String name = myProfilePage.userNameInfo.getAttribute("name").substring(11);
        String email = myProfilePage.userEmailInfo.getAttribute("name").substring(12);

        assertEquals(name, "9Ashot0988");
        assertEquals(email, "9default4575@mail.ru");
    }
}
