package testCROK;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    MenuPage clickOnMenu = new MenuPage();
    SearchPage search = new SearchPage();
    NewsPage news = new NewsPage();
    OurProjectPage ourProject = new OurProjectPage();
    SpecialProjectsPage specialProjects = new SpecialProjectsPage();
    SectionsPage sectionsContent = new SectionsPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;

        Configuration.browser = System.getProperty("browser", "CHROME");

        open("https://www.croc.ru");

        $("#cookie-notice").find(byText("Спасибо, понятно")).click();
    }
}
