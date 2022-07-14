
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


@Epic(value = "News page.")
@Feature("Search News.")
public class SearchNewsOneTest extends Methods{
    @Story("Valid News.")
    @Description(value = "Search News")
    @Test
    public void searchNewsOneTest() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(this.driver);
        NewsPage newsPage = new NewsPage(this.driver);

        this.login();
        profilePage.NewsButton.click();
        this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);


        List<String> titleNewsAr = new ArrayList<>();
        int j = 0;
        for (int i = 0; j < 2; i = i + 4) {
            titleNewsAr.add(newsPage.newsArray.get(i).getText());
            j = j + 1;
        }

        j = 0;
        String titleQ = null;
        for (int i = 0; j < 1; i++) {
            System.out.println(titleNewsAr.get(i) + "\n");
            titleQ = titleNewsAr.get(i);
            j++;
        }
        assertEquals(titleQ, "MEM");
    }
}


