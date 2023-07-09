package pages;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SectionsPage {
    public void content(String ContentSections, List<String> expectedButtons) {
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText(ContentSections)).hover();
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText(ContentSections)).click();
        $(".b-homepage-competence-center__tab-content").hover();
        $$(".b-homepage-competence-center__center-services-item").shouldHave(CollectionCondition.containExactTextsCaseSensitive(expectedButtons));

    }
}