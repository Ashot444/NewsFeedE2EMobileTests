
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.testng.AssertJUnit.assertNotNull;

@Epic(value = "News page.")
@Feature("News.")
public class PaginationNewsTest extends Methods {
    @Story("Valid News.")
    @Description(value = "News")
    @Test
    public void paginationNewsTest() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(this.driver);
        NewsPage newsPage = new NewsPage(this.driver);

        this.login();
        profilePage.NewsButton.click();
        Thread.sleep(5000);
        HashMap<String, String> scrollObject = new HashMap<String, String>();

        int t = -1;
        int k = 0;

        do {
            t++;
            List<String> titleNewsAr = new ArrayList<>();
            int j = 0;
            for (int i = t; j < 1; i++) {
                titleNewsAr.add(newsPage.newsArray.get(i).getText());
                j = j + 1;
                t++;
            }

            List<String> textNewsAr = new ArrayList<>();
            j = 0;
            for (int i = t; j < 1; i++) {
                textNewsAr.add(newsPage.newsArray.get(i).getText());
                j = j + 1;
                t++;
            }

            List<String> tagsNewsAr = new ArrayList<>();
            j = 0;
            for (int i = t; j < 1; i++) {
                tagsNewsAr.add(newsPage.newsArray.get(i).getText());
                j = j + 1;
                t++;
            }

            j = 0;
            for (int i = 0; j < 1; i++) {
                System.out.println(titleNewsAr.get(i));
                System.out.println(textNewsAr.get(i));
                System.out.println(tagsNewsAr.get(i) + "\n");
                j++;
            }

            scrollObject.put("direction", "down");
            driver.executeScript("mobile: scroll", scrollObject);
            k++;
        } while (k < 3);
        assertNotNull(newsPage.newsArray);
    }
}
